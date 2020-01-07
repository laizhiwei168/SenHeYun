package com.cimc.senheyun.controller;

import java.util.HashMap;
import java.util.List;
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

import com.cimc.senheyun.bo.TaLandYieldBo;
import com.cimc.senheyun.bo.TaLandYieldByYearBo;
import com.cimc.senheyun.bo.TaLandYieldSimplenessBo;
import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.service.TaLandYieldService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaLandYieldVo;

@Component
@RequestMapping("/TaLandYield")
public class TaLandYieldController {

	private Logger logger = LogManager.getLogger(TaLandYieldController.class.getName());

	@Resource(name="taLandYieldService")
	private TaLandYieldService service;
	
	
	@RequestMapping(value = "/selectYield.do", method = RequestMethod.POST)
	public @ResponseBody Object selectYieldByYear(@RequestBody TaLandYieldVo vo,HttpServletRequest request) {	
		vo.setYear("20"+(new java.util.Date().getYear()-100));
		PageOutVo<TaLandYieldByYearBo> list=service.selectYieldByYear(vo);		
		Map<String, Object> obj = new HashMap<String, Object>();		
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	@RequestMapping(value = "/select.do")
	public @ResponseBody Object selectYieldByYear(TaLandYieldVo vo) {	
		//vo.setYear("20"+(new java.util.Date().getYear()-100));
		vo.setSort("true");
		List<TaLandYieldSimplenessBo> list=service.select(vo);
		return list;
	}
}
