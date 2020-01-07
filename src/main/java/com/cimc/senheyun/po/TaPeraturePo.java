package com.cimc.senheyun.po;


public class TaPeraturePo {
    
    private String pkEquipment;

    private String datatime;
    private Double liquidlevelmpa;

    private Double batterycapacity;

    
    private Double signalValue;
    
    

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

	public Double getLiquidlevelmpa() {
		return liquidlevelmpa;
	}

	public void setLiquidlevelmpa(Double liquidlevelmpa) {
		this.liquidlevelmpa = liquidlevelmpa;
	}

	public Double getBatterycapacity() {
		return batterycapacity;
	}

	public void setBatterycapacity(Double batterycapacity) {
		this.batterycapacity = batterycapacity;
	}

	public Double getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(Double signalValue) {
		this.signalValue = signalValue;
	}

	
    
}