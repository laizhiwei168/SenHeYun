package com.cimc.senheyun.service;

import com.cimc.senheyun.bo.PxTrainclassBo;
import com.cimc.senheyun.po.PxTrainclassPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.PxTrainclassVo;

public interface PxTrainclassService {
    
	public PageOutVo<PxTrainclassBo> selectByExample(PxTrainclassVo vo);
    
	public PageOutVo<PxTrainclassPo> selectByKey(PxTrainclassVo vo);
	
	public int insert(PxTrainclassPo po);
    
    public int update(PxTrainclassPo po);
    
    public int delete( PxTrainclassPo po);
    
}
