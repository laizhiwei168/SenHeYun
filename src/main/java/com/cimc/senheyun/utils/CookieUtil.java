package com.cimc.senheyun.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

	private static String COOKIE_DOMAIN ="happymmall.com";//happymmall.com  senheyun.com
	private static String COOKIE_NAME ="mmall_login_token";//mmall_login_token    senhe_login_token
	
	public static String readLoginToken(HttpServletRequest request ) {
		Cookie[] cks = request.getCookies();
		if(cks!=null) {
			for(Cookie ck:cks) {
				//System.out.println("read ck.name:"+ck.getName()+"   ck.value:"+ck.getValue());
				if(ck.getName().equals(COOKIE_NAME)) {
					//System.out.println("return ck.name:"+ck.getName()+"   ck.value:"+ck.getValue());
					return ck.getValue();
				}
			}
		}
		return null;
	}
	
	public static void writeLoginToken(HttpServletResponse response ,String token) {
		Cookie ck =new Cookie(COOKIE_NAME, token);
		ck.setDomain(COOKIE_DOMAIN);
		ck.setPath("/");
		ck.setHttpOnly(true);
		// 这个单位是秒
		// 如果这个maxage不设置的话，cookie就不会写入硬盘，而是写在内存。只在当前页面有效。
		ck.setMaxAge(60*60*5);// 如果是-1，代表永久
		//System.out.println("ck.name:"+ck.getName()+"   ck.value:"+ck.getValue()+"   token:"+token);
		response.addCookie(ck);		
	}
	
	
	
	public static void delLoginToken(HttpServletRequest request,HttpServletResponse response ) {
		Cookie[] cks = request.getCookies();
		if(cks!=null) {
			for(Cookie ck:cks) {
				if(ck.getName().equals(COOKIE_NAME)) {
					ck.setDomain(COOKIE_DOMAIN);
					ck.setPath("/");
					ck.setMaxAge(0);//设置成0，删除cookie
					//System.out.println("del   ck.name:"+ck.getName()+"   ck.value:"+ck.getValue());
					response.addCookie(ck);
					return;
				}
			}
		}
	}
	
}
