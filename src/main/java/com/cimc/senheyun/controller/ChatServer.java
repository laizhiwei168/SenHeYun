package com.cimc.senheyun.controller;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint(value = "/chatServer")
public class ChatServer {

    private static CopyOnWriteArraySet<ChatServer> webSocketSet = new CopyOnWriteArraySet<ChatServer>();
    private Session session;    //与某个客户端的连接会话，需要通过它来给客户端发送数据
   

    /**
     * 连接建立成功调用的方法
     * @param session  可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(Session session, EndpointConfig config){
    	this.session = session;
        webSocketSet.add(this);     //加入set中
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(){
    	webSocketSet.remove(this);
        System.out.println("----------close-----------"+webSocketSet.size());
    }

    
    @OnMessage
    public void onMessage(String _message) {
         broadcast(_message,this);
    }

    /**
     * 发生错误时调用
     * @param error
     */
    @OnError
    public void onError(Throwable error){
        error.printStackTrace();
    }
    
    /**
     * 广播消息
     * @param message
     */
    public void broadcast(String message,ChatServer noChat){
        for(ChatServer chat: webSocketSet){
        	if(noChat!=chat) {
	            try {
	            	if(chat.session!=null&&chat.session.isOpen()) {
	            		chat.session.getBasicRemote().sendText(message);
	            	}	                
	            } catch (IOException e) {
	                e.printStackTrace();
	                continue;
	            }
        	}
        }
    }

    /**
     * 广播消息
     * @param message
     */
    public void broadcast(String message){
        for(ChatServer chat: webSocketSet){
            try {
                chat.session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    /**
     * 对特定用户发送消息
     * @param message
     * @param session
     */
    public void singleSend(String message, Session session){
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
