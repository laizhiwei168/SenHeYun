package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.bo.Tj_TaBusinessBo;
import com.cimc.senheyun.po.TaBusinessPo;
import com.cimc.senheyun.vo.Tj_TaBusinessVo;


public interface TaBusinessDao {
	 List<Tj_TaBusinessBo> findTjTaBusiness(Tj_TaBusinessVo vo);
    int insert(TaBusinessPo po);
    int insertHistory(TaBusinessPo po);
    int update(TaBusinessPo po);

}