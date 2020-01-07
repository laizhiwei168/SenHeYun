package com.cimc.senheyun.dao;


import java.util.List;

import com.cimc.senheyun.po.RlOrgRolePo;
import com.cimc.senheyun.vo.RlOrgRoleVo;

public interface RlOrgRoleDao {

    int findByCount(RlOrgRoleVo vo);
    
    List<RlOrgRolePo> selectByExample(RlOrgRoleVo vo);
    
    int insert(RlOrgRolePo po);

    int update(RlOrgRolePo po);
}