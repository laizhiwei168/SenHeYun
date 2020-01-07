package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;
import com.cimc.senheyun.dao.TaEquipmentDao;

@Transactional
@Component("taEquipmentService")
public class TaEquipmentServiceImpl  implements  TaEquipmentService{

	@Resource(name="taEquipmentDao")
	private TaEquipmentDao TaEquipmentDao;
	
	@Override
	public PageOutVo<TaEquipmentPo> selectByExample(TaEquipmentVo vo) {
		List<TaEquipmentPo> list=TaEquipmentDao.selectByExample(vo);
		int total= TaEquipmentDao.findByCount(vo);
		PageOutVo<TaEquipmentPo> page = new PageOutVo<TaEquipmentPo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}
}
