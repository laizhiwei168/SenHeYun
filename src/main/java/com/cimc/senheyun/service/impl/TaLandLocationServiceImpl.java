package com.cimc.senheyun.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.bo.TaLandBo;
import com.cimc.senheyun.bo.TaLandLocationBo;
import com.cimc.senheyun.dao.TaLandDao;
import com.cimc.senheyun.dao.TaLandLocationDao;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.po.TaLandLocationPo;
import com.cimc.senheyun.po.TaLandPo;
import com.cimc.senheyun.service.TaLandLocationService;
import com.cimc.senheyun.utils.DateUtils;
import com.cimc.senheyun.utils.UUIDUtil;
import com.cimc.senheyun.vo.BsRoleVo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaLandLocationVo;
import com.cimc.senheyun.vo.TaLandVo;

@Transactional
@Component("taLandLocationService")
public class TaLandLocationServiceImpl  implements TaLandLocationService{

	@Resource(name="taLandDao")
	private TaLandDao taLandDao;
	
	@Resource(name="taLandLocationDao")
	private TaLandLocationDao taLandLocationDao;
	
	
	@Override
	public PageOutVo<TaLandLocationBo> selectByExample(TaLandVo vo) {
		List<TaLandLocationBo> list =new ArrayList<TaLandLocationBo>();
		List<TaLandBo> list_l=taLandDao.selectByExample(vo);
		for(TaLandBo po:list_l) {
			TaLandLocationVo l_vo=new TaLandLocationVo();
			l_vo.setPkLand(po.getPkLand());
			l_vo.setSort("true");
			List<TaLandLocationPo> list_ll=taLandLocationDao.selectByExample(l_vo);
			TaLandLocationBo bo=new TaLandLocationBo();
			bo.setPkLand(po.getPkLand());
			bo.setLandname(po.getLandname());
			bo.setUsername(po.getUsername());
			bo.setCreatortime(po.getCreatortime());
			bo.setL_p(list_ll);
			list.add(bo);
		}
		
		int total= taLandDao.findByCount(vo);		
		PageOutVo<TaLandLocationBo> page = new PageOutVo<TaLandLocationBo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}

	@Override
	public int insert(TaLandLocationBo bo) {
		TaLandVo vo=new TaLandVo();
		vo.setLandname(bo.getLandname());
		List<TaLandBo> list_l=taLandDao.selectByExample(vo);
		int i=2;
		if(list_l.size()==0) {
			String pk=UUIDUtil.getUUID();
			TaLandPo po=bo;
			po.setPkLand(pk);
			po.setCreatortime(DateUtils.getDoDayTime());
			i=taLandDao.insert(po);
			if(i>0) {
				for(TaLandLocationPo l_po:bo.getL_p()) {
					l_po.setPkLand(pk);
					taLandLocationDao.insert(l_po);
				}
			}
		}
		/*System.out.println(bo.getLandname()+"   "+po.getPkCompany());
		System.out.println(bo.getLandname() +"   "+bo.getL_p().get(0).getPkLand());*/
		return i;
	}

	@Override
	public int update(TaLandLocationBo bo) {
		TaLandPo old_po=new TaLandPo();
		old_po.setPkLand(bo.getPkLand());
		old_po.setEnablestate(0);
		taLandDao.update(old_po);
		
		String pk=UUIDUtil.getUUID();
		TaLandPo po=bo;
		po.setPkLand(pk);
		po.setCreatortime(DateUtils.getDoDayTime());
		int i=taLandDao.insert(po);
		if(i>0) {
			for(TaLandLocationPo l_po:bo.getL_p()) {
				l_po.setPkLand(pk);
				taLandLocationDao.insert(l_po);
			}
		}
		return i;
	}

	@Override
	public int delete(TaLandPo bo) {
		TaLandPo old_po=new TaLandPo();
		old_po.setPkLand(bo.getPkLand());
		old_po.setEnablestate(0);
		old_po.setModifier(bo.getModifier());
		old_po.setModifiedtime(DateUtils.getDoDayTime());
		return taLandDao.update(old_po);		
	}

}
