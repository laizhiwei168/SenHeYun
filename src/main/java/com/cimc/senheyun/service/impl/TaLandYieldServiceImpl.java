package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.bo.TaLandYieldBo;
import com.cimc.senheyun.bo.TaLandYieldByYearBo;
import com.cimc.senheyun.bo.TaLandYieldSimplenessBo;
import com.cimc.senheyun.dao.TaLandYieldDao;
import com.cimc.senheyun.po.TaLandYieldPo;
import com.cimc.senheyun.service.TaLandYieldService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaLandYieldVo;

@Transactional
@Component("taLandYieldService")
public class TaLandYieldServiceImpl implements TaLandYieldService {

	@Resource(name="taLandYieldDao")
	private TaLandYieldDao dao;
	
	@Override
	public List<TaLandYieldSimplenessBo> select(TaLandYieldVo vo) {
		List<TaLandYieldSimplenessBo> list=dao.select(vo);
		return list;
	}

	
	@Override
	public PageOutVo<TaLandYieldBo> selectByExample(TaLandYieldVo vo) {
		
		return null ;
	}

	@Override
	public PageOutVo<TaLandYieldByYearBo> selectYieldByYear(TaLandYieldVo vo) {
		List<TaLandYieldByYearBo> list=dao.selectYieldByYear(vo);
		PageOutVo<TaLandYieldByYearBo> page = new PageOutVo<TaLandYieldByYearBo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(1);
		return page;
	}

	@Override
	public int insert(TaLandYieldPo po) {
		
		return 0;
	}

	@Override
	public int update(TaLandYieldPo po) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
