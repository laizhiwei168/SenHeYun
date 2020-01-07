package com.cimc.senheyun.service;

import com.cimc.senheyun.po.RlOrgRoleUserPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.RlOrgRoleUserVo;

public interface RlOrgRoleUserService {

	public PageOutVo<RlOrgRoleUserPo> selectByExample(RlOrgRoleUserVo vo);
	
	public int insert(RlOrgRoleUserPo po);
    
    public int update(RlOrgRoleUserPo po);
}
