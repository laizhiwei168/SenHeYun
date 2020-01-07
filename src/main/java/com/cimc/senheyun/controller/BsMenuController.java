package com.cimc.senheyun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.po.BsMenuPo;
import com.cimc.senheyun.service.BsMenuService;
@Component
@RequestMapping("/bsMenu")
public class BsMenuController {

	@Resource(name="bsMenuService")
	private BsMenuService service;
	
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample() {	
		List<BsMenuPo> list=service.findAllRecursion();
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
}
