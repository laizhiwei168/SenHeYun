package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.bo.TaPushFatBo;
import com.cimc.senheyun.bo.Tj_TaPushFatBo;
import com.cimc.senheyun.vo.TaPushFatVo;
import com.cimc.senheyun.vo.Tj_TaPushFatVo;

public interface TaPushFatDao {

	int findByCount(TaPushFatVo vo);
	   List<TaPushFatBo> selectByExample(TaPushFatVo vo);
	    
    int findHistoryByCount(TaPushFatVo vo);
    List<TaPushFatBo> selectHistoryByExample(TaPushFatVo vo);
    
    List<Tj_TaPushFatBo> findTjTaPushFat(Tj_TaPushFatVo vo);
    
}
