package com.cimc.senheyun.service;

import com.cimc.senheyun.po.BsRolePo;
import com.cimc.senheyun.vo.BsRoleVo;
import com.cimc.senheyun.vo.PageOutVo;

public interface BsRoleService {

public PageOutVo<BsRolePo> selectByExample(BsRoleVo vo);
	
	public int insert(BsRolePo po);
    
    public int update(BsRolePo po);
}
