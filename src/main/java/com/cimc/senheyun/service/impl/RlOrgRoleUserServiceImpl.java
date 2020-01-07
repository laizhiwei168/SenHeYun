package com.cimc.senheyun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.RlOrgRoleUserDao;
import com.cimc.senheyun.po.RlOrgRoleUserPo;
import com.cimc.senheyun.service.RlOrgRoleUserService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.RlOrgRoleUserVo;

@Transactional
@Component("rlOrgRoleUserService")
public class RlOrgRoleUserServiceImpl implements RlOrgRoleUserService {

	@Resource(name="rlOrgRoleUserDao")
	private RlOrgRoleUserDao dao;
	
	@Override
	public PageOutVo<RlOrgRoleUserPo> selectByExample(RlOrgRoleUserVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(RlOrgRoleUserPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RlOrgRoleUserPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

}
