package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.bo.Lg_BsUserBo;
import com.cimc.senheyun.bo.ps_BsUserBo;
import com.cimc.senheyun.dao.BsUserDao;
import com.cimc.senheyun.dao.TaEquipmentDao;
import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.UserService;
import com.cimc.senheyun.utils.MD5Util;
import com.cimc.senheyun.vo.BsUserVo;
import com.cimc.senheyun.vo.PageOutVo;

@Transactional
@Component("userService")
public class UserServiceImpl implements UserService{

	@Resource(name="bsUserDao")
	private BsUserDao dao;
	
	@Override
	public Lg_BsUserBo login(BsUserVo vo) {
		List<Lg_BsUserBo> list=dao.login(vo);
		Lg_BsUserBo user1=null;
		if(list!=null && !list.isEmpty()) {
			user1=list.get(0);		
			if(user1!=null){
				System.err.println(user1.getPassword()+"      "+  MD5Util.stringMD5(vo.getPassword()));
				if(user1.getPassword().equals(MD5Util.stringMD5(vo.getPassword()))) {
					return user1;
				}
			}
		}
		return null;
	}
	
	@Override
	public PageOutVo<BsUserPo> selectByExample(BsUserVo vo) {
		System.out.println("=======UserService=====selectByExample=====");
		List<BsUserPo> list=dao.selectByExample(vo);
		int total= dao.findByCount(vo);
		PageOutVo<BsUserPo> page = new PageOutVo<BsUserPo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}

	@Override
	public int insert(BsUserPo po) {
		System.out.println("=======UserService=====insert=====");
		return 0;
	}

	@Override
	public int update(BsUserPo po) {
		return 0;
	}

	@Override
	public int updatePassword(ps_BsUserBo bo) {
		BsUserVo vo=new BsUserVo();
		vo.setName(bo.getAccountnumber());
		vo.setPassword(bo.getOldPassword());
		List<Lg_BsUserBo> list=dao.login(vo);
		Lg_BsUserBo user1=null;
		if(list!=null && !list.isEmpty()) {
			user1=list.get(0);		
			if(user1!=null){
				//System.err.println(user1.getPassword()+"      "+  MD5Util.stringMD5(vo.getPassword()));
				if(user1.getPassword().equals(MD5Util.stringMD5(vo.getPassword()))) {
					BsUserPo bpo=new BsUserPo();
					bpo.setPkUser(bo.getPkUser());
					bpo.setPassword(MD5Util.stringMD5(bo.getPassword()));
					dao.update(bpo);
					return 0;
				}
				return 1;
			}
		}
		return 2;
	}

}
