package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.cimc.senheyun.bo.PxTrainclassBo;
import com.cimc.senheyun.dao.PxTrainclassDao;
import com.cimc.senheyun.po.PxTrainclassPo;
import com.cimc.senheyun.service.PxTrainclassService;
import com.cimc.senheyun.utils.UUIDUtil;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.PxTrainclassVo;

@Transactional
@Component("pxTrainclassService")
public class PxTrainclassServiceImpl  implements PxTrainclassService{

	@Resource(name="pxTrainclassDao")
	private PxTrainclassDao pxTrainclassDao;
	
	@Override
	public PageOutVo<PxTrainclassBo> selectByExample(PxTrainclassVo vo) {
		List<PxTrainclassBo> list=pxTrainclassDao.selectByExample(vo);
		int total= pxTrainclassDao.findByCount(vo);
		PageOutVo<PxTrainclassBo> page = new PageOutVo<PxTrainclassBo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}
	
	@Override
	public PageOutVo<PxTrainclassPo> selectByKey(PxTrainclassVo vo) {
		List<PxTrainclassPo> list=pxTrainclassDao.selectByKey(vo);
		PageOutVo<PxTrainclassPo> page = new PageOutVo<PxTrainclassPo>();
		page.setRows(list);
		return page;
	}

	@Override
	public int insert(PxTrainclassPo po) {
		int i=0;
		po.setPkTrainclass(UUIDUtil.getUUID());
		try {
			i=pxTrainclassDao.insertSelective(po);
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();							
		}
		return i;
	}

	@Override
	public int update(PxTrainclassPo po) {
		int i=0;
		try {
			i=pxTrainclassDao.updateByExampleSelective(po);
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();							
		}
		return i;
	}

	@Override
	public int delete(PxTrainclassPo po) {
		int i=0;
		try {
			i=pxTrainclassDao.updateByExampleSelective(po);
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();							
		}
		return i;
	}

	

}
