package com.cimc.senheyun.bo;

import java.util.List;

import com.cimc.senheyun.po.TaLandLocationPo;
import com.cimc.senheyun.po.TaLandPo;

public class TaLandLocationBo extends TaLandPo {  
	private String username;
    private List<TaLandLocationPo> l_p;
    
	public List<TaLandLocationPo> getL_p() {
		return l_p;
	}

	public void setL_p(List<TaLandLocationPo> l_p) {
		this.l_p = l_p;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}    
	
}
