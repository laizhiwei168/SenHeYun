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

import com.cimc.senheyun.bo.TaLandLocationBo;
import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.po.BsOrgPo;
import com.cimc.senheyun.po.TaLandPo;
import com.cimc.senheyun.service.BsOrgService;
import com.cimc.senheyun.service.TaLandLocationService;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.vo.BsOrgVo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaLandVo;
import com.google.common.collect.Maps;

@Component
@RequestMapping("/TaLandLocation")
public class TaLandLocationController { 

	private Logger logger = LogManager.getLogger(TaLandLocationController.class.getName());

	@Resource(name="taLandLocationService")
	private TaLandLocationService service;
	
	
	@RequestMapping(value = "/select.do", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample(@RequestBody TaLandVo vo,HttpServletRequest request) {	
		//System.out.println(vo.getPkCompany());
		if (vo.getPkCompany() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		PageOutVo<TaLandLocationBo> list=service.selectByExample(vo);		
		Map<String, Object> obj = new HashMap<String, Object>();		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public @ResponseBody Object insert(@RequestBody TaLandLocationBo bo,HttpServletRequest request) {
		if (bo.getPkCompany() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		int i=service.insert(bo);
		Map<String, Object> obj = Maps.newHashMap();
		if(i==1) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else if(i==0) {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		else if(i==2) {
			obj.put("status", new MyStatus("02", "02", "地块名称重复！"));
		}
		return obj;
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public @ResponseBody Object update(@RequestBody TaLandLocationBo bo,HttpServletRequest request) {	
		if (bo.getPkCompany() == null||bo.getPkLand() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		int i=service.update(bo);
		Map<String, Object> obj = Maps.newHashMap();
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
	
	@RequestMapping(value = "/delete.do", method = RequestMethod.POST)
	public @ResponseBody Object delete(@RequestBody TaLandPo po,HttpServletRequest request) {	
		if (po.getPkLand() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		int i=service.delete(po);
		Map<String, Object> obj = Maps.newHashMap();
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
}
