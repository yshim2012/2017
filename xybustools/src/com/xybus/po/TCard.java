package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TCard implements Serializable {
    private Integer id;

    /**
     * 卡号：胸卡、乘车卡
     */
    private String cardPin;

    /**
     * 卡编号，胸卡没有编号
     */
    private String cardNo;

    /**
     * 卡类型：T特种卡；C乘车卡；E大众员工卡
     */
    private String cardType;

    /**
     * 余额
     */
    private Long amount;

    /**
     * 状态(Y:已激活卡，N：未激活卡，V：作废卡 ，L:挂失卡， C：注销卡 )
     */
    private String status;

    /**
     * 持有人
     */
    private Integer passengerId;

    /**
     * 发卡人
     */
    private Short createdUser;

    /**
     * 发卡时间
     */
    private Date createdTime;

    /**
     * 最后更新人员
     */
    private Short updatedUser;

    /**
     * 最后更新时间
     */
    private Date updatedTime;

    /**
     * 有效起始月份
     */
    private String startMonth;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public Short getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(Short createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Short getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(Short updatedUser) {
        this.updatedUser = updatedUser;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }
}