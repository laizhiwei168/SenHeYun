package com.cimc.senheyun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.commandDao;
import com.cimc.senheyun.po.commandPo;
import com.cimc.senheyun.service.commandService;
import com.cimc.senheyun.utils.UUIDUtil;

@Transactional
@Component("commandService")
public class commandServiceImpl implements commandService {

	@Resource(name="commandDao")
	private commandDao dao;
	
	@Override
	public int insert(commandPo po) {
		po.setId(UUIDUtil.getUUID());
		return dao.insert(po);
	}

	@Override
	public int update(commandPo po) {
		return dao.update(po);
	}
	
}
