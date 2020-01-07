package com.cimc.senheyun.service;

import com.cimc.senheyun.bo.Tj_TaPeratureBo;
import com.cimc.senheyun.po.TaPeraturePo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.Tj_TaPeratureVo;

public interface TaPeratureService {
	
	public PageOutVo<Tj_TaPeratureBo> findTjPerature(Tj_TaPeratureVo vo);

	public int insert(TaPeraturePo record);

	public int myinsertHistory(TaPeraturePo record);
}
