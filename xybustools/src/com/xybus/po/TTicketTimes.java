package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TTicketTimes implements Serializable {
    private Integer id;

    /**
     * �̶�AƱ
     */
    private Short freeA;

    /**
     * �̶�BƱ
     */
    private Short freeB;

    /**
     * �̶�CƱ
     */
    private Short freeC;

    /**
     * ��ʱAƱ
     */
    private Short overtimeA;

    /**
     * ��ʱBƱ
     */
    private Short overtimeB;

    /**
     * ��ʱCƱ
     */
    private Short overtimeC;

    /**
     * �Է�AƱ
     */
    private Short rechargeA;

    /**
     * �Է�BƱ
     */
    private Short rechargeB;

    /**
     * �Է�CƱ
     */
    private Short rechargeC;

    /**
     * ����AƱ
     */
    private Short specialA;

    /**
     * ����BƱ
     */
    private Short specialB;

    /**
     * ����CƱ
     */
    private Short specialC;

    private Date createTime;

    private Short createUser;

    private Short updateUser;

    private Date updateTime;

    /**
     * ��ʱ��AƱ
     */
    private Short otherA;

    /**
     * ��ʱ��BƱ
     */
    private Short otherB;

    /**
     * ��ʱ��CƱ
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