package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.BsMenuDao;
import com.cimc.senheyun.po.BsMenuPo;
import com.cimc.senheyun.service.BsMenuService;

@Transactional
@Component("bsMenuService")
public class BsMenuServiceImpl implements BsMenuService{

	@Resource(name="bsMenuDao")
	private BsMenuDao dao;
	
	@Override
	public List<BsMenuPo> findAllRecursion() {		
		return dao.findAllRecursion();
	}

}
