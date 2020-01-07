package com.cimc.senheyun.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.po.commandPo;
import com.cimc.senheyun.service.commandService;
import com.cimc.senheyun.utils.CookieUtil;
import com.cimc.senheyun.utils.RedisPoolUtil;
import com.cimc.senheyun.utils.StringUtil;
import com.google.common.collect.Maps;

@Component
@RequestMapping("/Command")
public class CommandController {

	private Logger logger = LogManager.getLogger(CommandController.class.getName());
	@Resource(name="commandService")
	private commandService service;
	
	// 添加
	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public @ResponseBody Object insert(@RequestBody commandPo po,HttpServletRequest request) {	
		Map<String, Object> obj = new HashMap<String, Object>();
		/*String loginToken= CookieUtil.readLoginToken(request);		
		if(StringUtil.strIsNullOrEmpty(loginToken)) {
			obj.put("status", new MyStatus("02", "02", "用户未登录，无法获取当前用户的信息"));
			return obj;
		}
		String userJsonStr= RedisPoolUtil.get(loginToken);
		if(StringUtil.strIsNullOrEmpty(userJsonStr)) {
			obj.put("status", new MyStatus("02", "02", "用户未登录，无法获取当前用户的信息"));
			return obj;
		}*/
		
		po.setType(1);
		int i=service.insert(po);
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
}
