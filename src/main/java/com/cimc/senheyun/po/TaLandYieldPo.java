package com.cimc.senheyun.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TaLandYieldPo {
    private String pkLand;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String datatime;

    private Double longitude;

    private Double latitude;

    private Double yield;

    private Double weight;

    private Double demarcate1;

    private Double demarcate2;

    private Double simulationvalue;

    private Integer landtype;

    

    public String getPkLand() {
        return pkLand;
    }

    public void setPkLand(String pkLand) {
        this.pkLand = pkLand == null ? null : pkLand.trim();
    }

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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getDemarcate1() {
        return demarcate1;
    }

    public void setDemarcate1(Double demarcate1) {
        this.demarcate1 = demarcate1;
    }

    public Double getDemarcate2() {
        return demarcate2;
    }

    public void setDemarcate2(Double demarcate2) {
        this.demarcate2 = demarcate2;
    }

    public Double getSimulationvalue() {
        return simulationvalue;
    }

    public void setSimulationvalue(Double simulationvalue) {
        this.simulationvalue = simulationvalue;
    }

    public Integer getLandtype() {
        return landtype;
    }

    public void setLandtype(Integer landtype) {
        this.landtype = landtype;
    }
}