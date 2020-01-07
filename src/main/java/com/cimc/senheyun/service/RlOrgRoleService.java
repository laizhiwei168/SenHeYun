package com.cimc.senheyun.service;

import com.cimc.senheyun.po.RlOrgRolePo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.RlOrgRoleVo;

public interface RlOrgRoleService {

	public PageOutVo<RlOrgRolePo> selectByExample(RlOrgRoleVo vo);
	
	public int insert(RlOrgRolePo po);
    
    public int update(RlOrgRolePo po);
}
