package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TAccountRecord implements Serializable {
    private Integer id;

    /**
     * 乘客ID
     */
    private String passengerId;

    /**
     * 卡号
     */
    private String cardPin;

    /**
     * 变动类型：A充值，D乘车,C注销;F销账
     */
    private String changeType;

    /**
     * 变动前金额
     */
    private Long amountBefore;

    /**
     * 本次金额
     */
    private Long amount;

    /**
     * 变动后金额
     */
    private Long amountAfter;

    /**
     * 充值方式：W微信，P支付宝，C现金，U银联，O线上充值
     */
    private String payWay;

    /**
     * 充值机号
     */
    private String posId;

    /**
     * 创建人员ID
     */
    private Short createdUser;

    /**
     * 创建时间
     */
    private Date createdTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Long getAmountBefore() {
        return amountBefore;
    }

    public void setAmountBefore(Long amountBefore) {
        this.amountBefore = amountBefore;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmountAfter() {
        return amountAfter;
    }

    public void setAmountAfter(Long amountAfter) {
        this.amountAfter = amountAfter;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
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
}