package com.cimc.senheyun.po;


import com.fasterxml.jackson.annotation.JsonFormat;

public class PxTrainclassPo {
    private String pkTrainclass;

    private String pkTraintype;

    private String pkGroup;

    private String pkOrg;
    
    private String name;

    private String classDescribe;

    private String period;

    private String video;
    
    private String information;

    private String creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String creatortime;

    private String modifier;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String modifiedtime;

    private String memo;

    private Integer enablestate;

    public String getPkTrainclass() {
        return pkTrainclass;
    }

    public void setPkTrainclass(String pkTrainclass) {
        this.pkTrainclass = pkTrainclass == null ? null : pkTrainclass.trim();
    }

    public String getPkTraintype() {
        return pkTraintype;
    }

    public void setPkTraintype(String pkTraintype) {
        this.pkTraintype = pkTraintype == null ? null : pkTraintype.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClassDescribe() {
        return classDescribe;
    }

    public void setClassDescribe(String classDescribe) {
        this.classDescribe = classDescribe == null ? null : classDescribe.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatortime() {
        return creatortime;
    }

    public void setCreatortime(String creatortime) {
        this.creatortime = creatortime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	
}