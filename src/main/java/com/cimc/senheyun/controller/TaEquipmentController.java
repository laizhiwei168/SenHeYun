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
import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.po.PxTrainclassPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.PxTrainclassService;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.utils.CookieUtil;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.utils.RedisPoolUtil;
import com.cimc.senheyun.utils.StringUtil;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.PxTrainclassVo;
import com.cimc.senheyun.vo.TaEquipmentVo;
import com.google.common.collect.Maps;


@Component
@RequestMapping("/TaEquipment")
public class TaEquipmentController {
	private Logger logger = LogManager.getLogger(TaEquipmentController.class.getName());
	@Resource(name="taEquipmentService")
	private TaEquipmentService service;
	
		
	// 查询资料信息   
	@RequestMapping(value = "/select.do", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample(@RequestBody TaEquipmentVo vo,HttpServletRequest request) {
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
		PageOutVo<TaEquipmentPo> list=service.selectByExample(vo);
		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
}
