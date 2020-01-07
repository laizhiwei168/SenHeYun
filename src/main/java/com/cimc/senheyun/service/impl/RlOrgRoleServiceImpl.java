package com.cimc.senheyun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.RlOrgRoleDao;
import com.cimc.senheyun.po.RlOrgRolePo;
import com.cimc.senheyun.service.RlOrgRoleService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.RlOrgRoleVo;

@Transactional
@Component("rlOrgRoleService")
public class RlOrgRoleServiceImpl implements RlOrgRoleService {

	@Resource(name="rlOrgRoleDao")
	private RlOrgRoleDao dao;
	
	@Override
	public PageOutVo<RlOrgRolePo> selectByExample(RlOrgRoleVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(RlOrgRolePo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RlOrgRolePo po) {
		// TODO Auto-generated method stub
		return 0;
	}

}
