package com.cimc.senheyun.po;

import java.util.Date;

public class commandPo {
    private String id;

    private String equipmetId;

    private String commandTitle;

    private String commandType;

    private String commandContent;

    private Date addtime;

    private Date finishtime;

    private Integer status;

    private Integer flowid;

    private Integer type;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEquipmetId() {
        return equipmetId;
    }

    public void setEquipmetId(String equipmetId) {
        this.equipmetId = equipmetId == null ? null : equipmetId.trim();
    }

    public String getCommandTitle() {
        return commandTitle;
    }

    public void setCommandTitle(String commandTitle) {
        this.commandTitle = commandTitle == null ? null : commandTitle.trim();
    }

    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType == null ? null : commandType.trim();
    }

    public String getCommandContent() {
        return commandContent;
    }

    public void setCommandContent(String commandContent) {
        this.commandContent = commandContent == null ? null : commandContent.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}