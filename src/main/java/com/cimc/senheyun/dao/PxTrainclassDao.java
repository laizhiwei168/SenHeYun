package com.cimc.senheyun.dao;

import com.cimc.senheyun.bo.PxTrainclassBo;
import com.cimc.senheyun.po.PxTrainclassPo;
import com.cimc.senheyun.vo.PxTrainclassVo;

import java.util.List;

public interface PxTrainclassDao {
	int findByCount(PxTrainclassVo pxTraintypeVo);
    
    List<PxTrainclassBo> selectByExample(PxTrainclassVo example);
    
    List<PxTrainclassPo> selectByKey(PxTrainclassVo example);
    
    int insertSelective(PxTrainclassPo record);
    
    int updateByExampleSelective(PxTrainclassPo record);
}