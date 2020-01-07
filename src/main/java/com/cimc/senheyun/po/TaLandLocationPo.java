package com.cimc.senheyun.po;

import java.math.BigDecimal;

public class TaLandLocationPo {
    private String pkLand;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Integer enablestate;

    private Integer number;
    

    public String getPkLand() {
        return pkLand;
    }

    public void setPkLand(String pkLand) {
        this.pkLand = pkLand == null ? null : pkLand.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}