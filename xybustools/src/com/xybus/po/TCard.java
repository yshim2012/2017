package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TCard implements Serializable {
    private Integer id;

    /**
     * ���ţ��ؿ����˳���
     */
    private String cardPin;

    /**
     * ����ţ��ؿ�û�б��
     */
    private String cardNo;

    /**
     * �����ͣ�T���ֿ���C�˳�����E����Ա����
     */
    private String cardType;

    /**
     * ���
     */
    private Long amount;

    /**
     * ״̬(Y:�Ѽ����N��δ�����V�����Ͽ� ��L:��ʧ���� C��ע���� )
     */
    private String status;

    /**
     * ������
     */
    private Integer passengerId;

    /**
     * ������
     */
    private Short createdUser;

    /**
     * ����ʱ��
     */
    private Date createdTime;

    /**
     * ��������Ա
     */
    private Short updatedUser;

    /**
     * ������ʱ��
     */
    private Date updatedTime;

    /**
     * ��Ч��ʼ�·�
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