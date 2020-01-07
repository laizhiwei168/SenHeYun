package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.cimc.senheyun.service.TaPushFatService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaPushFatVo;
import com.cimc.senheyun.vo.Tj_TaPushFatVo;
import com.cimc.senheyun.bo.TaPushFatBo;
import com.cimc.senheyun.bo.Tj_TaPushFatBo;
import com.cimc.senheyun.dao.TaPushFatDao;

@Transactional
@Component("taPushFatService")
public class TaPushFatServiceImpl  implements  TaPushFatService{

	@Resource(name="taPushFatDao")
	private TaPushFatDao dao;
	
	@Override
	public PageOutVo<TaPushFatBo> selectByExample(TaPushFatVo vo) {
		List<TaPushFatBo> list=dao.selectByExample(vo);
		int total= dao.findByCount(vo);
		PageOutVo<TaPushFatBo> page = new PageOutVo<TaPushFatBo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}

	@Override
	public PageOutVo<TaPushFatBo> selectHistoryByExample(TaPushFatVo vo) {
		List<TaPushFatBo> list=dao.selectHistoryByExample(vo);
		int total= dao.findHistoryByCount(vo);
		PageOutVo<TaPushFatBo> page = new PageOutVo<TaPushFatBo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}

	@Override
	public PageOutVo<Tj_TaPushFatBo> findTjTaPushFat(Tj_TaPushFatVo vo) {
		List<Tj_TaPushFatBo> list=dao.findTjTaPushFat(vo);
		PageOutVo<Tj_TaPushFatBo> page = new PageOutVo<Tj_TaPushFatBo>();
		page.setRows(list);
		page.setFirstIndex(0);
		page.setPageSize(0);
		page.setTotalRecord(0);
		return page;
	}
}
