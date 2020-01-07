package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.po.BsOrgPo;
import com.cimc.senheyun.vo.BsOrgVo;

public interface BsOrgDao {
    
    int findByCount(BsOrgVo vo);
    
    List<BsOrgPo> selectByExample(BsOrgVo vo);
    
    int insert(BsOrgPo po);

    int update( BsOrgPo po);
}