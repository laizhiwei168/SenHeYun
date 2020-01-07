package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.VdTokenPo;
import com.cimc.senheyun.vo.VdTokenVo;

import java.util.List;


public interface VdTokenDao {
    
	int findByCount(VdTokenVo vo);
    
    List<VdTokenPo> select(VdTokenVo vo);
	
    int insert(VdTokenPo record);
  
    int update( VdTokenPo record);
}