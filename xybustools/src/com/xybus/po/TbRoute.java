package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TbRoute implements Serializable {
    private Integer id;

    /**
     * 线路名称
     */
    private String routeName;

    /**
     * 车辆停放位置示意图
     */
    private String stopMap;

    private String isUsing;

    /**
     * 状态
     */
    private String status;

    private Date createTime;

    private Short createUserid;

    private Date updateTime;

    private Short updateUserid;

    private String routeCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getStopMap() {
        return stopMap;
    }

    public void setStopMap(String stopMap) {
        this.stopMap = stopMap;
    }

    public String getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(String isUsing) {
        this.isUsing = isUsing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Short createUserid) {
        this.createUserid = createUserid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Short updateUserid) {
        this.updateUserid = updateUserid;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }
}