package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.bo.TaLandBo;
import com.cimc.senheyun.po.TaLandPo;
import com.cimc.senheyun.vo.TaLandVo;

public interface TaLandDao {
	int findByCount(TaLandVo vo);
    
    List<TaLandBo> selectByExample(TaLandVo vo);
    
    int insert(TaLandPo po);

    int update( TaLandPo po);
}