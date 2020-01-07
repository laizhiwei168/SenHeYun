package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.BsMenuPo;

import java.util.List;


public interface BsMenuDao {
	public List<BsMenuPo> findAllRecursion();
}