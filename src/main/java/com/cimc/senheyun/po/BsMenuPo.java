package com.cimc.senheyun.po;

import java.util.Date;
import java.util.List;

public class BsMenuPo {
    private String pkMenu;

    private String pkCompany;

    private String name;

    private String menuurl;

    private String fPkMenu;

    private Boolean isConnect;

    private String creator;

    private Date creatortime;

    private String modifier;

    private Date modifiedtime;

    private Integer enablestate;

    private List<BsMenuPo> children;

    public String getPkMenu() {
        return pkMenu;
    }

    public void setPkMenu(String pkMenu) {
        this.pkMenu = pkMenu == null ? null : pkMenu.trim();
    }

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

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public String getfPkMenu() {
        return fPkMenu;
    }

    public void setfPkMenu(String fPkMenu) {
        this.fPkMenu = fPkMenu == null ? null : fPkMenu.trim();
    }

    public Boolean getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(Boolean isConnect) {
        this.isConnect = isConnect;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatortime() {
        return creatortime;
    }

    public void setCreatortime(Date creatortime) {
        this.creatortime = creatortime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }

	public List<BsMenuPo> getChildren() {
		return children;
	}

	public void setChildren(List<BsMenuPo> children) {
		this.children = children;
	}
}