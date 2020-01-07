package com.cimc.senheyun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.BsRoleDao;
import com.cimc.senheyun.po.BsRolePo;
import com.cimc.senheyun.service.BsRoleService;
import com.cimc.senheyun.vo.BsRoleVo;
import com.cimc.senheyun.vo.PageOutVo;

@Transactional
@Component("bsRoleService")
public class BsRoleServiceImpl implements BsRoleService{

	@Resource(name="bsRoleDao")
	private BsRoleDao dao;
	
	@Override
	public PageOutVo<BsRolePo> selectByExample(BsRoleVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BsRolePo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BsRolePo po) {
		// TODO Auto-generated method stub
		return 0;
	}

}
