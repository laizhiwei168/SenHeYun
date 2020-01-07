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
import com.cimc.senheyun.bo.PxTrainclassBo;
import com.cimc.senheyun.bo.TaPushFatBo;
import com.cimc.senheyun.bo.TaWeatherDetectorBo;
import com.cimc.senheyun.bo.Tj_TaPushFatBo;
import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.po.PxTrainclassPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.PxTrainclassService;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.service.TaPushFatService;
import com.cimc.senheyun.service.TaWeatherDetectorService;
import com.cimc.senheyun.utils.CookieUtil;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.utils.RedisPoolUtil;
import com.cimc.senheyun.utils.StringUtil;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.PxTrainclassVo;
import com.cimc.senheyun.vo.TaEquipmentVo;
import com.cimc.senheyun.vo.TaPushFatVo;
import com.cimc.senheyun.vo.TaWeatherDetectorVo;
import com.cimc.senheyun.vo.Tj_TaPushFatVo;
import com.google.common.collect.Maps;


@Component
@RequestMapping("/TaPushFat")
public class TaPushFatController {
	private Logger logger = LogManager.getLogger(TaPushFatController.class.getName());
	@Resource(name="taPushFatService")
	private TaPushFatService service;
	
	
	// 查询信息
	@RequestMapping(value = "/select.do", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample(@RequestBody TaPushFatVo vo,HttpServletRequest request) {
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
		
		vo.setEquipmentType(1);
		PageOutVo<TaPushFatBo> list=service.selectByExample(vo);
		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	// 查询history信息
	@RequestMapping(value = "/selectHistory.do", method = RequestMethod.POST)
	public @ResponseBody Object selectHistoryByExample(@RequestBody TaPushFatVo vo,HttpServletRequest request) {
		if(vo.getPkEquipment()==null) {
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
		
		//vo.setEquipmentType(2);
		vo.setSort("true");
		PageOutVo<TaPushFatBo> list=service.selectHistoryByExample(vo);
		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	// 查询统计信息
	/**
	  {
	"pkEquipment":"2885c5ac35944749bd1f5bb6b64de5e4",
	"dataFormat":"%Y-%m",
	"is_KPFatWeight":true,
	"is_KPSecondFatWeight":true,
	"is_XSAFatWeight":true
	}
	 * @param vo
	 * @return
	 */
	@RequestMapping(value = "/selectTjTaPushFat.do", method = RequestMethod.POST)
	public @ResponseBody Object selectTjTaPushFat(@RequestBody Tj_TaPushFatVo vo,HttpServletRequest request) {
		if(vo.getPkEquipment()==null) {
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
		
		if(vo.getDataFormat()==null) vo.setDataFormat("%Y-%m");
		
		PageOutVo<Tj_TaPushFatBo> list=service.findTjTaPushFat(vo);
		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
}
