package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TCardpinHistory implements Serializable {
    private Integer id;

    /**
     * �ɿ�card_pin
     */
    private String oldCardPin;

    /**
     * �¿�card_pin
     */
    private String newCardPin;

    /**
     * �ɿ�����
     */
    private String oldJobNumber;

    /**
     * �¿�����
     */
    private String newJobNumber;

    /**
     * �ɿ�T_CARD_ID
     */
    private Integer oldTcardId;

    /**
     * �¿�T_CARD_ID
     */
    private Integer newTcardId;

    /**
     * �ɿ�T_PASSENGER_ID
     */
    private Integer oldTpassenegerId;

    /**
     * �¿�T_PASSENGER_ID
     */
    private Integer newTpassenegerId;

    /**
     * ������ԱID
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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldCardPin() {
        return oldCardPin;
    }

    public void setOldCardPin(String oldCardPin) {
        this.oldCardPin = oldCardPin;
    }

    public String getNewCardPin() {
        return newCardPin;
    }

    public void setNewCardPin(String newCardPin) {
        this.newCardPin = newCardPin;
    }

    public String getOldJobNumber() {
        return oldJobNumber;
    }

    public void setOldJobNumber(String oldJobNumber) {
        this.oldJobNumber = oldJobNumber;
    }

    public String getNewJobNumber() {
        return newJobNumber;
    }

    public void setNewJobNumber(String newJobNumber) {
        this.newJobNumber = newJobNumber;
    }

    public Integer getOldTcardId() {
        return oldTcardId;
    }

    public void setOldTcardId(Integer oldTcardId) {
        this.oldTcardId = oldTcardId;
    }

    public Integer getNewTcardId() {
        return newTcardId;
    }

    public void setNewTcardId(Integer newTcardId) {
        this.newTcardId = newTcardId;
    }

    public Integer getOldTpassenegerId() {
        return oldTpassenegerId;
    }

    public void setOldTpassenegerId(Integer oldTpassenegerId) {
        this.oldTpassenegerId = oldTpassenegerId;
    }

    public Integer getNewTpassenegerId() {
        return newTpassenegerId;
    }

    public void setNewTpassenegerId(Integer newTpassenegerId) {
        this.newTpassenegerId = newTpassenegerId;
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
}