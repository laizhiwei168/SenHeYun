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
import com.cimc.senheyun.po.RlOrgRoleUserPo;
import com.cimc.senheyun.service.RlOrgRoleUserService;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.RlOrgRoleUserVo;
import com.google.common.collect.Maps;

@Component
@RequestMapping("/RlOrgRoleUser")
public class RlOrgRoleUserController {

	private Logger logger = LogManager.getLogger(RlOrgRoleUserController.class.getName());

	@Resource(name="rlOrgRoleUserService")
	private RlOrgRoleUserService service;
	
	@RequestMapping(value = "/select.do", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample(RlOrgRoleUserVo vo,HttpServletRequest request) {		
		PageOutVo<RlOrgRoleUserPo> list=service.selectByExample(vo);		
		Map<String, Object> obj = new HashMap<String, Object>();		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public @ResponseBody Object insert(@RequestBody RlOrgRoleUserPo po) {		
		int i=service.insert(po);
		Map<String, Object> obj = Maps.newHashMap();
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public @ResponseBody Object update(@RequestBody RlOrgRoleUserPo po) {
		if(po.getPkCompany()==null) {
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		int i=service.update(po);
		Map<String, Object> obj = Maps.newHashMap();
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
}
