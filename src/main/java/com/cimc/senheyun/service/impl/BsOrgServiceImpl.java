package com.cimc.senheyun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.BsOrgDao;
import com.cimc.senheyun.po.BsOrgPo;
import com.cimc.senheyun.service.BsOrgService;
import com.cimc.senheyun.vo.BsOrgVo;
import com.cimc.senheyun.vo.PageOutVo;

@Transactional
@Component("bsOrgService")
public class BsOrgServiceImpl  implements BsOrgService{

	@Resource(name="bsOrgDao")
	private BsOrgDao dao;
	
	@Override
	public PageOutVo<BsOrgPo> selectByExample(BsOrgVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BsOrgPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BsOrgPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

}
