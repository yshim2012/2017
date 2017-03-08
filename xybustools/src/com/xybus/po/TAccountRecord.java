package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TAccountRecord implements Serializable {
    private Integer id;

    /**
     * �˿�ID
     */
    private String passengerId;

    /**
     * ����
     */
    private String cardPin;

    /**
     * �䶯���ͣ�A��ֵ��D�˳�,Cע��;F����
     */
    private String changeType;

    /**
     * �䶯ǰ���
     */
    private Long amountBefore;

    /**
     * ���ν��
     */
    private Long amount;

    /**
     * �䶯����
     */
    private Long amountAfter;

    /**
     * ��ֵ��ʽ��W΢�ţ�P֧������C�ֽ�U������O���ϳ�ֵ
     */
    private String payWay;

    /**
     * ��ֵ����
     */
    private String posId;

    /**
     * ������ԱID
     */
    private Short createdUser;

    /**
     * ����ʱ��
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