package com.cimc.senheyun.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.cimc.senheyun.utils.CookieUtil;
import com.cimc.senheyun.utils.RedisPoolUtil;
import com.cimc.senheyun.utils.StringUtil;

public class SessionExpireFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		//System.out.println("============doFilter===============");
		HttpServletRequest  httpServletRequest=(HttpServletRequest)arg0;
		String loginToken =CookieUtil.readLoginToken(httpServletRequest);
		if(!StringUtil.strIsNullOrEmpty(loginToken)) {
			String userJsonStr= RedisPoolUtil.get(loginToken);
			if(!StringUtil.strIsNullOrEmpty(userJsonStr)) {
				RedisPoolUtil.expire(loginToken, 60*30);
			}
		}
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
