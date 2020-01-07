package com.cimc.senheyun.service.impl;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.VdTokenDao;
import com.cimc.senheyun.po.VdTokenPo;
import com.cimc.senheyun.service.VideoService;
import com.cimc.senheyun.utils.DateUtils;
import com.cimc.senheyun.utils.FastJsonSerializer;
import com.cimc.senheyun.utils.HttpClientUtil;
import com.cimc.senheyun.utils.jo.AccessTokenJo;
import com.cimc.senheyun.utils.jo.TokenJo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.VdTokenVo;

@Transactional
@Component("videoService")
public class VideoServiceImpl  implements VideoService{

	@Resource(name="vdTokenDao")
	private VdTokenDao dao;
	
	@Override
	public PageOutVo<VdTokenPo> selectToken(VdTokenVo vo) {
		// 查询数据库的token表
		List<VdTokenPo> list=dao.select(new VdTokenVo());
		if(list.isEmpty()) {
			// 新增
		}else{
			String sqltime=list.get(0).getValidtime();
			String totime=DateUtils.getDoDayTime();
			try {
				long l=DateUtils.getDatePoor(totime, sqltime);
				if(l<360) {
					VdTokenPo po=new VdTokenPo();
					// 如果过期调用接口方法
					Map<String, String> params=new HashMap<String, String>();
					params.put("appKey", "bf6800ee89234ec895d888ab93b45fb6");
					params.put("appSecret", "7d5e05850f16331aa4b4841159a785da");
					String json=HttpClientUtil.doPostForm("https://open.ys7.com/api/lapp/token/get", params);
					TokenJo TokenJo=new FastJsonSerializer().toObject(json, TokenJo.class);
					if("200".equals(TokenJo.getCode())) {
						AccessTokenJo data=TokenJo.getData();
						String accessToken= data.getAccessToken();
						String validtime=DateUtils.stampToDate(data.getExpireTime());
						po.setId(list.get(0).getId());
						po.setAccesstoken(accessToken);						
						po.setValidtime(validtime);						
						dao.update(po);
						list.clear();
						list.add(po);
					}
				}
			} catch (ParseException e) {
				e.printStackTrace();
			};
		}
		PageOutVo<VdTokenPo> page = new PageOutVo<VdTokenPo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(0);
		return page;
	}
		
}
