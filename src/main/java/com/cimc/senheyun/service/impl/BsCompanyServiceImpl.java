package com.cimc.senheyun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.BsCompanyDao;
import com.cimc.senheyun.dao.commandDao;
import com.cimc.senheyun.po.BsCompanyPo;
import com.cimc.senheyun.service.BsCompanyService;
import com.cimc.senheyun.vo.BsCompanyVo;
import com.cimc.senheyun.vo.PageOutVo;

@Transactional
@Component("bsCompanyService")
public class BsCompanyServiceImpl implements BsCompanyService{

	@Resource(name="bsCompanyDao")
	private BsCompanyDao dao;
	
	@Override
	public PageOutVo<BsCompanyPo> selectByExample(BsCompanyVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BsCompanyPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BsCompanyPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

}
