package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.cimc.senheyun.bo.Tj_TaPeratureBo;
import com.cimc.senheyun.bo.Tj_TaPushFatBo;
import com.cimc.senheyun.dao.TaPeratureDao;
import com.cimc.senheyun.po.TaPeraturePo;
import com.cimc.senheyun.service.TaPeratureService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.Tj_TaPeratureVo;


@Transactional
@Component("taPeratureService")
public class TaPeratureServiceImpl implements TaPeratureService {

	@Resource(name="taPeratureDao")
	private TaPeratureDao dao;
	
	@Override
	public int insert(TaPeraturePo record) {
		return dao.insert(record);
	}

	@Override
	public int myinsertHistory(TaPeraturePo record) {
		int i=0;
		try {
			i= dao.insertHistory(record);
		} catch (Exception e) {
			System.out.println("--------------");
			//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();							
		}
		return i;
	}

	@Override
	public PageOutVo<Tj_TaPeratureBo> findTjPerature(Tj_TaPeratureVo vo) {
		List<Tj_TaPeratureBo> list=dao.findTjPerature(vo);
		PageOutVo<Tj_TaPeratureBo> page = new PageOutVo<Tj_TaPeratureBo>();
		page.setRows(list);
		page.setFirstIndex(0);
		page.setPageSize(0);
		page.setTotalRecord(0);
		return page;
	}

}
