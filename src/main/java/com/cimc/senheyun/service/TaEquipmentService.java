package com.cimc.senheyun.service;

import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;

public interface TaEquipmentService {
    
	public PageOutVo<TaEquipmentPo> selectByExample(TaEquipmentVo vo);
    
}
