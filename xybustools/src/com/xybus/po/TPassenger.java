package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TPassenger implements Serializable {
    private Integer id;

    /**
     * ����
     */
    private String jobNumber;

    /**
     * ����
     */
    private String name;

    /**
     * �ֻ���
     */
    private String mobile;

    /**
     * ����
     */
    private String email;

    /**
     * ���֤��
     */
    private String idCardNo;

    /**
     * Ʊ��
     */
    private String ticketType;

    /**
     * ����
     */
    private String dept;

    /**
     * ��˾
     */
    private String co;

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

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
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