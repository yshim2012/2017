package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TTicketTimes implements Serializable {
    private Integer id;

    /**
     * 固定A票
     */
    private Short freeA;

    /**
     * 固定B票
     */
    private Short freeB;

    /**
     * 固定C票
     */
    private Short freeC;

    /**
     * 错时A票
     */
    private Short overtimeA;

    /**
     * 错时B票
     */
    private Short overtimeB;

    /**
     * 错时C票
     */
    private Short overtimeC;

    /**
     * 自费A票
     */
    private Short rechargeA;

    /**
     * 自费B票
     */
    private Short rechargeB;

    /**
     * 自费C票
     */
    private Short rechargeC;

    /**
     * 特种A票
     */
    private Short specialA;

    /**
     * 特种B票
     */
    private Short specialB;

    /**
     * 特种C票
     */
    private Short specialC;

    private Date createTime;

    private Short createUser;

    private Short updateUser;

    private Date updateTime;

    /**
     * 临时卡A票
     */
    private Short otherA;

    /**
     * 临时卡B票
     */
    private Short otherB;

    /**
     * 临时卡C票
     */
    private Short otherC;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getFreeA() {
        return freeA;
    }

    public void setFreeA(Short freeA) {
        this.freeA = freeA;
    }

    public Short getFreeB() {
        return freeB;
    }

    public void setFreeB(Short freeB) {
        this.freeB = freeB;
    }

    public Short getFreeC() {
        return freeC;
    }

    public void setFreeC(Short freeC) {
        this.freeC = freeC;
    }

    public Short getOvertimeA() {
        return overtimeA;
    }

    public void setOvertimeA(Short overtimeA) {
        this.overtimeA = overtimeA;
    }

    public Short getOvertimeB() {
        return overtimeB;
    }

    public void setOvertimeB(Short overtimeB) {
        this.overtimeB = overtimeB;
    }

    public Short getOvertimeC() {
        return overtimeC;
    }

    public void setOvertimeC(Short overtimeC) {
        this.overtimeC = overtimeC;
    }

    public Short getRechargeA() {
        return rechargeA;
    }

    public void setRechargeA(Short rechargeA) {
        this.rechargeA = rechargeA;
    }

    public Short getRechargeB() {
        return rechargeB;
    }

    public void setRechargeB(Short rechargeB) {
        this.rechargeB = rechargeB;
    }

    public Short getRechargeC() {
        return rechargeC;
    }

    public void setRechargeC(Short rechargeC) {
        this.rechargeC = rechargeC;
    }

    public Short getSpecialA() {
        return specialA;
    }

    public void setSpecialA(Short specialA) {
        this.specialA = specialA;
    }

    public Short getSpecialB() {
        return specialB;
    }

    public void setSpecialB(Short specialB) {
        this.specialB = specialB;
    }

    public Short getSpecialC() {
        return specialC;
    }

    public void setSpecialC(Short specialC) {
        this.specialC = specialC;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Short createUser) {
        this.createUser = createUser;
    }

    public Short getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Short updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getOtherA() {
        return otherA;
    }

    public void setOtherA(Short otherA) {
        this.otherA = otherA;
    }

    public Short getOtherB() {
        return otherB;
    }

    public void setOtherB(Short otherB) {
        this.otherB = otherB;
    }

    public Short getOtherC() {
        return otherC;
    }

    public void setOtherC(Short otherC) {
        this.otherC = otherC;
    }
}