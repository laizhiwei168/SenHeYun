package com.cimc.senheyun.dao;

import com.cimc.senheyun.bo.TaLandYieldBo;
import com.cimc.senheyun.bo.TaLandYieldByYearBo;
import com.cimc.senheyun.bo.TaLandYieldSimplenessBo;
import com.cimc.senheyun.po.TaLandYieldPo;
import com.cimc.senheyun.vo.TaLandYieldVo;

import java.util.List;

public interface TaLandYieldDao {
  
	int findByCount(TaLandYieldVo vo);
		
	List<TaLandYieldSimplenessBo> select(TaLandYieldVo vo);
	
    List<TaLandYieldBo> selectByExample(TaLandYieldVo vo);
    
    List<TaLandYieldByYearBo> selectYieldByYear(TaLandYieldVo vo);
    
    int insert(TaLandYieldPo po);

    int update( TaLandYieldPo po);
}