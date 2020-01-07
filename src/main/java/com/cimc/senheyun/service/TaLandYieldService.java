package com.cimc.senheyun.service;

import java.util.List;

import com.cimc.senheyun.bo.TaLandYieldBo;
import com.cimc.senheyun.bo.TaLandYieldByYearBo;
import com.cimc.senheyun.bo.TaLandYieldSimplenessBo;
import com.cimc.senheyun.po.TaLandYieldPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaLandYieldVo;

public interface TaLandYieldService {

	List<TaLandYieldSimplenessBo> select(TaLandYieldVo vo);
	
	PageOutVo<TaLandYieldBo> selectByExample(TaLandYieldVo vo);
    
	PageOutVo<TaLandYieldByYearBo> selectYieldByYear(TaLandYieldVo vo);
    
    int insert(TaLandYieldPo po);

    int update( TaLandYieldPo po);
}
