package com.cimc.senheyun.bo;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TaLandYieldSimplenessBo {

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String datatime;

    private Double longitude;

    private Double latitude;

    private Double yield;
    
    private Integer landtype;

	public String getDatatime() {
		return datatime;
	}

	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getYield() {
		return yield;
	}

	public void setYield(Double yield) {
		this.yield = yield;
	}

	public Integer getLandtype() {
		return landtype;
	}

	public void setLandtype(Integer landtype) {
		this.landtype = landtype;
	}    
}
