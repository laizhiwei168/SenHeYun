package com.cimc.senheyun.po;

import java.util.Date;

public class TaBusinessPo {
    private String pkEquipment;
    private String datatime;
    private Double batterycapacity;
    private Double signalValue;
    private String datanumber;
    private String imei;
    private String iccid;
    private Double soiltemperature1;
    private Double soiltemperature2;
    private Double soiltemperature3;
    private Double soilmoisture1;
    private Double soilmoisture2;
    private Double soilmoisture3;

    

    @Override
	public String toString() {
		return "TaBusinessPo [pkEquipment=" + pkEquipment + ", datatime=" + datatime + ", batterycapacity="
				+ batterycapacity + ", signalValue=" + signalValue + ", datanumber=" + datanumber + ", imei=" + imei
				+ ", iccid=" + iccid + ", soiltemperature1=" + soiltemperature1 + ", soiltemperature2="
				+ soiltemperature2 + ", soiltemperature3=" + soiltemperature3 + ", soilmoisture1=" + soilmoisture1
				+ ", soilmoisture2=" + soilmoisture2 + ", soilmoisture3=" + soilmoisture3 + "]";
	}

	public String getPkEquipment() {
        return pkEquipment;
    }

    public void setPkEquipment(String pkEquipment) {
        this.pkEquipment = pkEquipment == null ? null : pkEquipment.trim();
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public Double getBatterycapacity() {
        return batterycapacity;
    }

    public void setBatterycapacity(Double batterycapacity) {
        this.batterycapacity = batterycapacity;
    }

    public String getDatanumber() {
        return datanumber;
    }

    public void setDatanumber(String datanumber) {
        this.datanumber = datanumber == null ? null : datanumber.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid == null ? null : iccid.trim();
    }

    public Double getSoiltemperature1() {
        return soiltemperature1;
    }

    public void setSoiltemperature1(Double soiltemperature1) {
        this.soiltemperature1 = soiltemperature1;
    }

    public Double getSoiltemperature2() {
        return soiltemperature2;
    }

    public void setSoiltemperature2(Double soiltemperature2) {
        this.soiltemperature2 = soiltemperature2;
    }

    public Double getSoiltemperature3() {
        return soiltemperature3;
    }

    public void setSoiltemperature3(Double soiltemperature3) {
        this.soiltemperature3 = soiltemperature3;
    }

    public Double getSoilmoisture1() {
        return soilmoisture1;
    }

    public void setSoilmoisture1(Double soilmoisture1) {
        this.soilmoisture1 = soilmoisture1;
    }

    public Double getSoilmoisture2() {
        return soilmoisture2;
    }

    public void setSoilmoisture2(Double soilmoisture2) {
        this.soilmoisture2 = soilmoisture2;
    }

    public Double getSoilmoisture3() {
        return soilmoisture3;
    }

    public void setSoilmoisture3(Double soilmoisture3) {
        this.soilmoisture3 = soilmoisture3;
    }

	public Double getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(Double signalValue) {
		this.signalValue = signalValue;
	}
}