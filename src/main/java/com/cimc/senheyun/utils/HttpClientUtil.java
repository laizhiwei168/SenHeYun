package com.cimc.senheyun.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * 
 * @author lzw
 *
 */
public class HttpClientUtil { 
	
	public static String doPostFormToAttestation(String url,String userName,String userPass,Map<String, String> params){
		String strResult="";
		 //1.创建 HttpClient 的实例  
		try {
			CloseableHttpClient httpclient=	HttpClientTool.getHttpClient();
			HttpPost httppost = new HttpPost(url);
			//使用base64进行加密
			byte[] tokenByte = Base64.encodeBase64((userName+":"+userPass).getBytes());
			//将加密的信息转换为string
			String tokenStr =new String(tokenByte);
			String token = "Basic "+tokenStr;
			//System.out.println("token:"+token);
			//把认证信息发到header中
			httppost.setHeader("Authorization", token);
			
			// 设置参数
			List<NameValuePair> formparams = doListInBasicNameValuePair(params);
		    UrlEncodedFormEntity  uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");   
		    httppost.setEntity(uefEntity); 
			CloseableHttpResponse response = httpclient.execute(httppost);   
            try {
                HttpEntity entity = response.getEntity();   
                if (entity != null) {
                    //System.out.println("--------------------------------------"); 
                	strResult=EntityUtils.toString(entity, "UTF-8");
                    //System.out.println("Response content: " + strResult );   
                    //System.out.println("--------------------------------------");   
                }   
            } finally {   
                response.close();   
            }   
        } catch (ClientProtocolException e) {   
            e.printStackTrace();   
        } catch (UnsupportedEncodingException e1) {   
            e1.printStackTrace();   
        } catch (IOException e) {   
            e.printStackTrace();   
        }
		return strResult;
	}

	
	/**
	 * 参数是json传输
	 * @param url
	 * @param json
	 * @return
	 */
	public  static String doPostFormTojson(String url,String token ,String json){
		CloseableHttpClient httpclient=	HttpClientTool.getHttpClient();
		String strResult="";
		// 创建httppost     
        HttpPost httppost = new HttpPost(url);   
        httppost.addHeader(HTTP.CONTENT_TYPE, "application/json");
        
        try {
        	 StringEntity se = new StringEntity(json);
             se.setContentType("text/json");
             se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
             httppost.setEntity(se);  
             //指定报文头【Content-type】、【User-Agent】
             httppost.setHeader("Content-type", "application/json");
             httppost.setHeader("Authorization", token);
             CloseableHttpResponse response = httpclient.execute(httppost);   
            try {
                HttpEntity entity = response.getEntity();   
                if (entity != null) {
                    //System.out.println("--------------------------------------"); 
                	strResult=EntityUtils.toString(entity, "UTF-8");
                    //System.out.println("Response content: " + strResult );   
                    //System.out.println("--------------------------------------");   
                }   
            } finally {   
                response.close();   
            }   
        } catch (ClientProtocolException e) {   
            e.printStackTrace();   
        } catch (UnsupportedEncodingException e1) {   
            e1.printStackTrace();   
        } catch (IOException e) {   
            e.printStackTrace();   
        } 
        return strResult;
	}

	public  static String doGetForm(String url,Map<String, String> params){
		CloseableHttpClient httpclient=	HttpClientTool.getHttpClient();
		String strResult="";
		try {   
			String getUrl= buildUrl(url, params);
			//System.out.println(getUrl);
            // 创建httpget.     
            HttpGet httpget = new HttpGet(getUrl);
            //System.out.println("executing request " + httpget.getURI());   
            // 执行get请求.     
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {   
                // 获取响应实体     
                HttpEntity entity = response.getEntity();   
                //System.out.println("--------------------------------------");   
                // 打印响应状态     
               // System.out.println(response.getStatusLine());   
                if (entity != null) {   
                    // 打印响应内容长度     
                    //System.out.println("Response content length: " + entity.getContentLength());   
                    // 打印响应内容     
                    strResult=EntityUtils.toString(entity,HTTP.UTF_8);
                    //System.out.println("Response content: " + strResult);   
                }   
                //System.out.println("------------------------------------");   
            } finally {   
                response.close();   
            }   
        } catch (ClientProtocolException e) {   
            e.printStackTrace();   
        } catch (ParseException e) {   
            e.printStackTrace();   
        } catch (IOException e) {   
            e.printStackTrace();   
        }/* finally {   
            // 关闭连接,释放资源     
            try {   
                httpclient.close();   
            } catch (IOException e) {   
                e.printStackTrace();   
            }   
        } */  
		 return strResult;
	}
	
	public  static String doPostForm(String url,Map<String, String> params){
		CloseableHttpClient httpclient=	HttpClientTool.getHttpClient();
		String strResult="";
		// 创建httppost     
        HttpPost httppost = new HttpPost(url);   
        // 创建参数队列     
        List<NameValuePair> formparams = doListInBasicNameValuePair(params);
        UrlEncodedFormEntity uefEntity;   
        try {
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");   
            httppost.setEntity(uefEntity);   
            //System.out.println("executing request " + httppost.getURI());   
            CloseableHttpResponse response = httpclient.execute(httppost);   
            try {   
                HttpEntity entity = response.getEntity();   
                if (entity != null) {
                    //System.out.println("--------------------------------------"); 
                	strResult=EntityUtils.toString(entity, "UTF-8");
                   // System.out.println("Response content: " + strResult );   
                    //System.out.println("--------------------------------------");   
                }   
            } finally {   
                response.close();   
            }   
        } catch (ClientProtocolException e) {   
            e.printStackTrace();   
        } catch (UnsupportedEncodingException e1) {   
            e1.printStackTrace();   
        } catch (IOException e) {   
            e.printStackTrace();   
        } /*finally {   
            // 关闭连接,释放资源     
            try {   
                httpclient.close();   
            } catch (IOException e) {   
                e.printStackTrace();   
            }   
        }  */ 
        
        return strResult;
	}
	
	
	private static List<NameValuePair> doListInBasicNameValuePair(Map<String, String> params) {
		List<NameValuePair> mapRequest = new ArrayList<NameValuePair>();
		if(params!=null && params.size()>0 ){			
			for(Map.Entry<String, String> entry : params.entrySet()){
				if(entry.getValue()!=null && !"".equals(entry.getValue())){
					mapRequest.add(new BasicNameValuePair(entry.getKey(),
							entry.getValue()));
				}
			}
		}
		return mapRequest;
	}
	
	/**
	 * 构建get方式的url
	 * 
	 * @param reqUrl
	 *            基础的url地址
	 * @param params
	 *            查询参数
	 * @return 构建好的url
	 */
	public static String buildUrl(String reqUrl, Map<String, String> params) {
		StringBuilder query = new StringBuilder();
		Set<String> set = params.keySet();
		for (String key : set) {
			query.append(String.format("%s=%s&", key, params.get(key)));
		}
		String str_query=query.toString();
		return reqUrl + "?" + str_query.substring(0,str_query.length()-1);
	}
}
