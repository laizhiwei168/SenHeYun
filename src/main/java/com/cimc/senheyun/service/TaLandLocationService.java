package com.cimc.senheyun.service;

import com.cimc.senheyun.bo.TaLandLocationBo;
import com.cimc.senheyun.po.TaLandPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaLandVo;

public interface TaLandLocationService {

	public PageOutVo<TaLandLocationBo> selectByExample(TaLandVo vo);
	
	public int insert(TaLandLocationBo bo);
    
    public int update(TaLandLocationBo bo);
	
    public int delete(TaLandPo bo);
	
}
