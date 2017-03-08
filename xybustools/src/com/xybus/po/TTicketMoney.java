package com.xybus.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class TTicketMoney implements Serializable {
    private Integer id;

    /**
     * Ʊ��ID
     */
    private String ticketType;

    /**
     * ��˾����
     */
    private String co;

    /**
     * Ʊ�ֽ��
     */
    private BigDecimal money;

    private String status;

    /**
     * ������ԱID
     */
    private Integer createdUser;

    /**
     * ����ʱ��
     */
    private Date createdTime;

    /**
     * ��������Ա
     */
    private Integer updatedUser;

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

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(Integer updatedUser) {
        this.updatedUser = updatedUser;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}