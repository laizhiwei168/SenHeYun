package com.cimc.senheyun.po;


import com.fasterxml.jackson.annotation.JsonFormat;

public class TaLandPo {
    private String pkLand;

    private String landname;

    private String pkCompany;
    private String creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String creatortime;

    private String modifier;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String modifiedtime;

    private Integer enablestate;

   

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

	public String getPkLand() {
        return pkLand;
    }

    public void setPkLand(String pkLand) {
        this.pkLand = pkLand == null ? null : pkLand.trim();
    }

    public String getLandname() {
        return landname;
    }

    public void setLandname(String landname) {
        this.landname = landname == null ? null : landname.trim();
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

	public String getPkCompany() {
		return pkCompany;
	}

	public void setPkCompany(String pkCompany) {
		this.pkCompany = pkCompany;
	}
}