package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class IWhitelist implements Serializable {
    private Integer id;

    /**
     * �汾
     */
    private String version;

    /**
     * ����
     */
    private String cardPin;

    /**
     * ״̬��N������U�Ѹ��µ�ǰ�û�
     */
    private String status;

    /**
     * ����ʱ��
     */
    private Date updateTime;

    /**
     * ������ԱID
     */
    private Integer createdUser;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(Integer createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}