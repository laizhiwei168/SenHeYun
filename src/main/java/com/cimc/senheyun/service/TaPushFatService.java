package com.cimc.senheyun.service;

import java.util.List;

import com.cimc.senheyun.bo.TaPushFatBo;
import com.cimc.senheyun.bo.TaWeatherDetectorBo;
import com.cimc.senheyun.bo.Tj_TaPushFatBo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;
import com.cimc.senheyun.vo.TaPushFatVo;
import com.cimc.senheyun.vo.TaWeatherDetectorVo;
import com.cimc.senheyun.vo.Tj_TaPushFatVo;

public interface TaPushFatService {
    
	public PageOutVo<TaPushFatBo> selectByExample(TaPushFatVo vo);
	public PageOutVo<TaPushFatBo> selectHistoryByExample(TaPushFatVo vo);
	public PageOutVo<Tj_TaPushFatBo> findTjTaPushFat(Tj_TaPushFatVo vo);
}
