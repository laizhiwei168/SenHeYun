package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.vo.TaEquipmentVo;

public interface TaEquipmentDao {

	
	int findByCount(TaEquipmentVo vo);
    
    List<TaEquipmentPo> selectByExample(TaEquipmentVo vo);
    
    
}
