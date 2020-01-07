package com.cimc.senheyun.service;

import com.cimc.senheyun.po.BsCompanyPo;
import com.cimc.senheyun.vo.BsCompanyVo;
import com.cimc.senheyun.vo.PageOutVo;

public interface BsCompanyService {

	public PageOutVo<BsCompanyPo> selectByExample(BsCompanyVo vo);
	
	public int insert(BsCompanyPo po);
    
    public int update(BsCompanyPo po);
	
}
