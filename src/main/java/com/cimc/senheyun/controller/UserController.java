package com.cimc.senheyun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cimc.senheyun.bo.PxTrainclassBo;
import com.cimc.senheyun.bo.ps_BsUserBo;
import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.po.VdTokenPo;
import com.cimc.senheyun.service.UserService;
import com.cimc.senheyun.utils.CookieUtil;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.utils.JsonUtil;
import com.cimc.senheyun.utils.MD5Util;
import com.cimc.senheyun.utils.RedisPoolUtil;
import com.cimc.senheyun.utils.StringUtil;
import com.cimc.senheyun.vo.BsUserVo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.PxTrainclassVo;
import com.cimc.senheyun.vo.VdTokenVo;
import com.google.gson.Gson;

@Component
@RequestMapping("/User")
public class UserController {

	private Logger logger = LogManager.getLogger(TaEquipmentController.class.getName());

	@Resource(name="userService")
	private UserService service;
	/***
	 * 
	 * 用户登录获取token码
	 * 测试token提交
	 * flushdb
	 * 
	 */
	
	@RequestMapping(value = "/Login.do", method = RequestMethod.POST)
	public @ResponseBody Object Login(@RequestBody BsUserVo vo,HttpSession httpsession,HttpServletRequest request,HttpServletResponse response) {
		if (vo.getName() == null || vo.getPassword() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		BsUserPo user1=service.login(vo);
		if(user1!=null){
			String sessionId=httpsession.getId();
			System.out.println("sessionId:"+sessionId);
			/*CookieUtil.writeLoginToken(response, sessionId);
			RedisPoolUtil.setEx(sessionId, JsonUtil.obj2String(user1), 60*30);// 有效时间30分钟
			 */
			
			//user1.setToken(key);
			Map<String, Object> obj = new HashMap<String, Object>();
			obj.put("status", new MyStatus("00", "00", "Success"));
			obj.put("content", user1);
			return obj;
		}
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("01", "01", "登录失败！请填写正确的用户名和密码"));
		return obj;
	}
	
	// 查询资料信息
	@RequestMapping(value = "/select.do", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample(HttpServletRequest request) {
		Map<String, Object> obj = new HashMap<String, Object>();
		String loginToken= CookieUtil.readLoginToken(request);		
		/*if(StringUtil.strIsNullOrEmpty(loginToken)) {
			obj.put("status", new MyStatus("02", "02", "用户未登录，无法获取当前用户的信息"));
			return obj;
		}
		String userJsonStr= RedisPoolUtil.get(loginToken);
		if(StringUtil.strIsNullOrEmpty(userJsonStr)) {
			obj.put("status", new MyStatus("02", "02", "用户未登录，无法获取当前用户的信息"));
			return obj;
		}*/
		obj.put("status", new MyStatus("00", "00", "Success"));
		//obj.put("content", userJsonStr);
		return obj;
	}
	
	// 查询资料信息
	@RequestMapping(value = "/LoginOut.do" , method = RequestMethod.POST)
	public @ResponseBody Object LoginOut(HttpServletRequest request,HttpServletResponse response) {		
		String sessionid= CookieUtil.readLoginToken(request);
		CookieUtil.delLoginToken(request,response);	
		RedisPoolUtil.del(sessionid);
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("00", "00", "Success"));
		return obj;
	}
	
	// 修改密码 
	@RequestMapping(value = "/updatePassword.do", method = RequestMethod.POST)
	public @ResponseBody Object updatePassword(@RequestBody ps_BsUserBo bo,HttpServletRequest request) {		
		if (bo.getPkUser() == null || bo.getPassword() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
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
		int i= service.updatePassword(bo);	
		if(i==0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else if(i==1){
			obj.put("status", new MyStatus("01", "01", "以前密码不正确"));
		}else if(i==2){
			obj.put("status", new MyStatus("02", "02", "用户不存在"));
		}
		
		return obj;
	}
	
	@RequestMapping(value = "/get.do")
	public @ResponseBody Object get(HttpSession httpsession,HttpServletResponse response,HttpServletRequest request) {
		String sessionId=httpsession.getId();
		System.out.println("sessionId:"+sessionId);
		CookieUtil.writeLoginToken(response, sessionId);
		CookieUtil.readLoginToken(request);
		System.out.println("qqqqqqqqqqqq");
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("00", "00", "Success"));
		return obj;
	}
	
	@RequestMapping(value = "/get1.do", method = RequestMethod.POST)
	public @ResponseBody Object get1(@RequestBody BsUserVo vo,HttpSession httpsession,HttpServletResponse response,HttpServletRequest request) {
		System.out.println("-------"+vo.getName()+"   "+vo.getPassword());
		
		String loginToken= CookieUtil.readLoginToken(request);
		System.out.println("loginToken:"+loginToken);
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("00", "00", "Success"));
		return obj;
	}
	
	
}
