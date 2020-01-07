package com.cimc.senheyun.service;

import com.cimc.senheyun.bo.Tj_TaBusinessBo;
import com.cimc.senheyun.po.TaBusinessPo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.Tj_TaBusinessVo;

public interface TaBusinessService {

	public PageOutVo<Tj_TaBusinessBo> findTjTaBusiness(Tj_TaBusinessVo vo);
	int insert(TaBusinessPo po);
    int myinsertHistory(TaBusinessPo po);
    int update(TaBusinessPo po);
}
