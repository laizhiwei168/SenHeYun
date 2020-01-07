package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.po.RlOrgRoleUserPo;
import com.cimc.senheyun.vo.RlOrgRoleUserVo;


public interface RlOrgRoleUserDao {
	int findByCount(RlOrgRoleUserVo vo);
    
    List<RlOrgRoleUserPo> selectByExample(RlOrgRoleUserVo vo);
    
    int insert(RlOrgRoleUserPo po);

    int update(RlOrgRoleUserPo po);
}