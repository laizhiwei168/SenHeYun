package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.bo.Lg_BsUserBo;
import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.vo.BsUserVo;

public interface BsUserDao {
	
	int findByCount(BsUserVo vo);
    
    List<BsUserPo> selectByExample(BsUserVo vo);
    List<Lg_BsUserBo> login(BsUserVo vo);
    
    int insert(BsUserPo po);

    int update( BsUserPo po);  
}