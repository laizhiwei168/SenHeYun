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
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.po.TaBusinessPo;
import com.cimc.senheyun.po.WebBusinessPo;
import com.cimc.senheyun.po.WebPressurePo;
import com.cimc.senheyun.service.TaBusinessService;
import com.cimc.senheyun.service.Webservice;
import com.cimc.senheyun.utils.CookieUtil;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.utils.RedisPoolUtil;
import com.cimc.senheyun.utils.StringUtil;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.WebPressureVo;

@Component
@RequestMapping("/Web")
public class WebserviceController {
	private Logger logger = LogManager.getLogger(WebserviceController.class.getName());
	@Resource(name="webservice")
	private Webservice service;

	@Resource(name="taBusinessService")
	private TaBusinessService service4;
	// 查询信息
	@RequestMapping(value = "/selectPressure.do", method = RequestMethod.POST)
	public @ResponseBody Object selectPressure(@RequestBody WebPressureVo vo,HttpServletRequest request) {
		if(vo.getGateway()==null) {
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
		
		PageOutVo<WebPressurePo> list=service.selectPressure(vo.getGateway());
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	// 查询信息
	@RequestMapping(value = "/selectPressureHistory.do", method = RequestMethod.POST)
	public @ResponseBody Object selectPressureHistory(@RequestBody WebPressureVo vo,HttpServletRequest request) {
		if(vo.getGateway()==null &&vo.getStartTime()==null &&vo.getEndTime()==null) {
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
		
		PageOutVo<WebPressurePo> list=service.selectPressureHistory(vo);
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	// 查询信息
	@RequestMapping(value = "/selectBusiness.do", method = RequestMethod.POST)
	public @ResponseBody Object selectBusiness(@RequestBody WebPressureVo vo,HttpServletRequest request) {
		if(vo.getGateway()==null) {
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
		
		PageOutVo<WebBusinessPo> list=service.selectBusiness(vo.getGateway());
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	// 查询信息
	@RequestMapping(value = "/selectBusinessHistory.do", method = RequestMethod.POST)
	public @ResponseBody Object selectBusinessHistory(@RequestBody WebPressureVo vo,HttpServletRequest request) {
		if(vo.getGateway()==null &&vo.getStartTime()==null &&vo.getEndTime()==null) {
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
		
		PageOutVo<WebBusinessPo> list=service.selectBusinessHistory(vo);
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
		
}
