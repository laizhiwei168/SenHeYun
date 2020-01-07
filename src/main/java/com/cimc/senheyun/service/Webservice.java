package com.cimc.senheyun.service;

import com.cimc.senheyun.po.WebBusinessPo;
import com.cimc.senheyun.po.WebPressurePo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.WebPressureVo;

public interface Webservice {
	public PageOutVo<WebPressurePo> selectPressure(String gateway);
	public PageOutVo<WebPressurePo> selectPressureHistory(WebPressureVo vo);
	
	
	public PageOutVo<WebBusinessPo> selectBusiness(String gateway);
	public PageOutVo<WebBusinessPo> selectBusinessHistory(WebPressureVo vo);
}
