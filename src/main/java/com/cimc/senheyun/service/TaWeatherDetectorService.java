package com.cimc.senheyun.service;

import com.cimc.senheyun.bo.TaWeatherDetectorBo;
import com.cimc.senheyun.bo.Tj_TaWeatherDetectorBo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaWeatherDetectorVo;
import com.cimc.senheyun.vo.Tj_TaWeatherDetectorVo;

public interface TaWeatherDetectorService {
    
	public PageOutVo<TaWeatherDetectorBo> selectByExample(TaWeatherDetectorVo vo);
	public PageOutVo<TaWeatherDetectorBo> selectHistoryByExample(TaWeatherDetectorVo vo);
	public PageOutVo<Tj_TaWeatherDetectorBo> findTjTaWeatherDetector(Tj_TaWeatherDetectorVo vo);
    
}
