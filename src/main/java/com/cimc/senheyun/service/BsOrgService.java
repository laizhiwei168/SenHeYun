package com.cimc.senheyun.service;

import com.cimc.senheyun.po.BsOrgPo;
import com.cimc.senheyun.vo.BsOrgVo;
import com.cimc.senheyun.vo.PageOutVo;

public interface BsOrgService {

	public PageOutVo<BsOrgPo> selectByExample(BsOrgVo vo);
	
	public int insert(BsOrgPo po);
    
    public int update(BsOrgPo po);
}
