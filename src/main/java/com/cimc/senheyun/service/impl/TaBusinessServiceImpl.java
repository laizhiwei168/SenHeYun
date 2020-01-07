package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.bo.Tj_TaBusinessBo;
import com.cimc.senheyun.bo.Tj_TaPeratureBo;
import com.cimc.senheyun.dao.TaBusinessDao;
import com.cimc.senheyun.po.TaBusinessPo;
import com.cimc.senheyun.service.TaBusinessService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.Tj_TaBusinessVo;

@Transactional
@Component("taBusinessService")
public class TaBusinessServiceImpl  implements TaBusinessService{

	@Resource(name="taBusinessDao")
	private TaBusinessDao dao;
	
	@Override
	public int insert(TaBusinessPo po) {
		return 0;
	}

	@Override
	public int myinsertHistory(TaBusinessPo po) {
		int i=0;
		try {
			i= dao.insertHistory(po);
		} catch (Exception e) {
			System.out.println("--------------");
			//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();							
		}
		return i;
	}

	@Override
	public int update(TaBusinessPo po) {
		return 0;
	}

	@Override
	public PageOutVo<Tj_TaBusinessBo> findTjTaBusiness(Tj_TaBusinessVo vo) {
		List<Tj_TaBusinessBo> list=dao.findTjTaBusiness(vo);
		PageOutVo<Tj_TaBusinessBo> page = new PageOutVo<Tj_TaBusinessBo>();
		page.setRows(list);
		page.setFirstIndex(0);
		page.setPageSize(0);
		page.setTotalRecord(0);
		return page;
	}

}
