package com.cimc.senheyun.service;

import com.cimc.senheyun.po.VdTokenPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.VdTokenVo;

public interface VideoService { 

	public PageOutVo<VdTokenPo> selectToken(VdTokenVo vo);
}
