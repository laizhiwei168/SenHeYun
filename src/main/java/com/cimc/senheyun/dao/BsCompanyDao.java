package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.BsCompanyPo;
import com.cimc.senheyun.vo.BsCompanyVo;

import java.util.List;

public interface BsCompanyDao {
    
    int findByCount(BsCompanyVo vo);
    
    List<BsCompanyPo> selectByExample(BsCompanyVo vo);
    
    int insert(BsCompanyPo po);

    int update( BsCompanyPo po);
}