package com.cimc.senheyun.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class HttpCookieUtil {

	private static String COOKIE_DOMAIN ="happymmall.com";//happymmall.com  senheyun.com
	private static String COOKIE_NAME ="mmall_login_token";//mmall_login_token    senhe_login_token
	
	public static void writeLoginToken(HttpServletResponse response ,String token) {
		Cookie cookie =new Cookie("name","www.Admin10000.com");
		cookie.setDomain(COOKIE_DOMAIN);
		cookie.setPath("/");
		response.addCookie(cookie);
	}
}
