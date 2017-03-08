package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TCardpinHistory implements Serializable {
    private Integer id;

    /**
     * 旧卡card_pin
     */
    private String oldCardPin;

    /**
     * 新卡card_pin
     */
    private String newCardPin;

    /**
     * 旧卡工号
     */
    private String oldJobNumber;

    /**
     * 新卡工号
     */
    private String newJobNumber;

    /**
     * 旧卡T_CARD_ID
     */
    private Integer oldTcardId;

    /**
     * 新卡T_CARD_ID
     */
    private Integer newTcardId;

    /**
     * 旧卡T_PASSENGER_ID
     */
    private Integer oldTpassenegerId;

    /**
     * 新卡T_PASSENGER_ID
     */
    private Integer newTpassenegerId;

    /**
     * 创建人员ID
     */
    private Short createdUser;

    /**
     * 创建时间
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