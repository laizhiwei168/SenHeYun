package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.BsRolePo;
import com.cimc.senheyun.vo.BsRoleVo;

import java.util.List;


public interface BsRoleDao {
        
    int findByCount(BsRoleVo vo);
    
    List<BsRolePo> selectByExample(BsRoleVo vo);
    
    int insert(BsRolePo po);

    int update( BsRolePo po);
}