package com.cimc.senheyun.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BsCompanyPo {
    private String pkCompany;

    private String name;

    private String englishname;

    private String registeredaddress;

    private Integer businesstype;

    private String businesscode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String companycreatetime;

    private Integer isfreeze;

    private String creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String creatortime;

    private String modifier;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String modifiedtime;

    private Integer enablestate;

    

    public String getPkCompany() {
        return pkCompany;
    }

    public void setPkCompany(String pkCompany) {
        this.pkCompany = pkCompany == null ? null : pkCompany.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    public String getRegisteredaddress() {
        return registeredaddress;
    }

    public void setRegisteredaddress(String registeredaddress) {
        this.registeredaddress = registeredaddress == null ? null : registeredaddress.trim();
    }

    public Integer getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(Integer businesstype) {
        this.businesstype = businesstype;
    }

    public String getBusinesscode() {
        return businesscode;
    }

    public void setBusinesscode(String businesscode) {
        this.businesscode = businesscode == null ? null : businesscode.trim();
    }

    

    public Integer getIsfreeze() {
        return isfreeze;
    }

    public void setIsfreeze(Integer isfreeze) {
        this.isfreeze = isfreeze;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    

    public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }
}