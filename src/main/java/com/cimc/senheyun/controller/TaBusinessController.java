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

import com.cimc.senheyun.bo.Tj_TaBusinessBo;
import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.service.TaBusinessService;
import com.cimc.senheyun.utils.CookieUtil;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.utils.RedisPoolUtil;
import com.cimc.senheyun.utils.StringUtil;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.Tj_TaBusinessVo;

@Component
@RequestMapping("/TaBusiness")
public class TaBusinessController {

	private Logger logger = LogManager.getLogger(TaBusinessController.class.getName());
	@Resource(name="taBusinessService")
	private TaBusinessService service;
	
	@RequestMapping(value = "/selectTjTaBusiness.do", method = RequestMethod.POST)
	public @ResponseBody Object selectTaBusiness(@RequestBody Tj_TaBusinessVo vo,HttpServletRequest request) {
		if(vo.getEquipmentNo()==null) {
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
		
		PageOutVo<Tj_TaBusinessBo> list=service.findTjTaBusiness(vo);
		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
}
