package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.bo.Tj_TaPeratureBo;
import com.cimc.senheyun.po.TaPeraturePo;
import com.cimc.senheyun.vo.Tj_TaPeratureVo;

public interface TaPeratureDao {
    
	 List<Tj_TaPeratureBo> findTjPerature(Tj_TaPeratureVo vo);
    int insert(TaPeraturePo record);

    int insertHistory(TaPeraturePo record);
}