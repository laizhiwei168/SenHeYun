package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.bo.TaWeatherDetectorBo;
import com.cimc.senheyun.bo.Tj_TaWeatherDetectorBo;
import com.cimc.senheyun.vo.TaWeatherDetectorVo;
import com.cimc.senheyun.vo.Tj_TaWeatherDetectorVo;

public interface TaWeatherDetectorDao {

   int findByCount(TaWeatherDetectorVo vo);
   List<TaWeatherDetectorBo> selectByExample(TaWeatherDetectorVo vo);
    
    int findHistoryByCount(TaWeatherDetectorVo vo);
    List<TaWeatherDetectorBo> selectHistoryByExample(TaWeatherDetectorVo vo);
    
    List<Tj_TaWeatherDetectorBo> findTjTaWeatherDetector(Tj_TaWeatherDetectorVo vo);
}
