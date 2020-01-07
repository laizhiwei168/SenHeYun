package com.cimc.senheyun.service;

import java.util.List;

import com.cimc.senheyun.bo.Lg_BsUserBo;
import com.cimc.senheyun.bo.ps_BsUserBo;
import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.vo.BsUserVo;
import com.cimc.senheyun.vo.PageOutVo;

public interface UserService {

	public Lg_BsUserBo login(BsUserVo vo);
	
	public PageOutVo<BsUserPo> selectByExample(BsUserVo vo);
	  
    int insert(BsUserPo po);
    int update( BsUserPo po);
    int updatePassword( ps_BsUserBo bo);
}
