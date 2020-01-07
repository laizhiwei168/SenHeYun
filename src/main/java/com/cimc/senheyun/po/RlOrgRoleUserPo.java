package com.cimc.senheyun.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RlOrgRoleUserPo {
    private String pkOrgRoleUser;

    private String pkUser;

    private String pkOrgRole;

    private String pkCompany;

    private String creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String creatortime;

    private String modifier;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String modifiedtime;

    private Integer enablestate;

   
    public String getPkOrgRoleUser() {
        return pkOrgRoleUser;
    }

    public void setPkOrgRoleUser(String pkOrgRoleUser) {
        this.pkOrgRoleUser = pkOrgRoleUser == null ? null : pkOrgRoleUser.trim();
    }

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    public String getPkOrgRole() {
        return pkOrgRole;
    }

    public void setPkOrgRole(String pkOrgRole) {
        this.pkOrgRole = pkOrgRole == null ? null : pkOrgRole.trim();
    }

    public String getPkCompany() {
        return pkCompany;
    }

    public void setPkCompany(String pkCompany) {
        this.pkCompany = pkCompany == null ? null : pkCompany.trim();
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

    
    public String getCreatortime() {
		return creatortime;
	}

	public void setCreatortime(String creatortime) {
		this.creatortime = creatortime;
	}

	public String getModifiedtime() {
		return modifiedtime;
	}

	public void setModifiedtime(String modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

	public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }
}