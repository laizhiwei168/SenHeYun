package com.cimc.senheyun.dao;


import java.util.List;

import com.cimc.senheyun.po.TaLandLocationPo;
import com.cimc.senheyun.vo.TaLandLocationVo;


public interface TaLandLocationDao {
	int findByCount(TaLandLocationVo vo);
    
    List<TaLandLocationPo> selectByExample(TaLandLocationVo vo);
    
    int insert(TaLandLocationPo po);

    int update( TaLandLocationPo po);
}