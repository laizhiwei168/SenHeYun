package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.service.TaWeatherDetectorService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;
import com.cimc.senheyun.vo.TaWeatherDetectorVo;
import com.cimc.senheyun.vo.Tj_TaWeatherDetectorVo;
import com.cimc.senheyun.bo.TaWeatherDetectorBo;
import com.cimc.senheyun.bo.Tj_TaBusinessBo;
import com.cimc.senheyun.bo.Tj_TaWeatherDetectorBo;
import com.cimc.senheyun.dao.TaEquipmentDao;
import com.cimc.senheyun.dao.TaWeatherDetectorDao;

@Transactional
@Component("taWeatherDetectorService")
public class TaWeatherDetectorServiceImpl  implements  TaWeatherDetectorService{

	@Resource(name="taWeatherDetectorDao")
	private TaWeatherDetectorDao dao;
	
	@Override
	public PageOutVo<TaWeatherDetectorBo> selectByExample(TaWeatherDetectorVo vo) {
		List<TaWeatherDetectorBo> list=dao.selectByExample(vo);
		int total= dao.findByCount(vo);
		PageOutVo<TaWeatherDetectorBo> page = new PageOutVo<TaWeatherDetectorBo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}

	@Override
	public PageOutVo<TaWeatherDetectorBo> selectHistoryByExample(TaWeatherDetectorVo vo) {
		List<TaWeatherDetectorBo> list=dao.selectHistoryByExample(vo);
		int total= dao.findHistoryByCount(vo);
		PageOutVo<TaWeatherDetectorBo> page = new PageOutVo<TaWeatherDetectorBo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}

	@Override
	public PageOutVo<Tj_TaWeatherDetectorBo> findTjTaWeatherDetector(Tj_TaWeatherDetectorVo vo) {
		List<Tj_TaWeatherDetectorBo> list=dao.findTjTaWeatherDetector(vo);
		PageOutVo<Tj_TaWeatherDetectorBo> page = new PageOutVo<Tj_TaWeatherDetectorBo>();
		page.setRows(list);
		page.setFirstIndex(0);
		page.setPageSize(0);
		page.setTotalRecord(0);
		return page;
	}
}
