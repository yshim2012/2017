package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UiOvertime implements Serializable {
    private Integer id;

    /**
     * ����
     */
    private String batch;

    /**
     * ����
     */
    private String jobNumber;

    /**
     * ����
     */
    private String name;

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
     * ��Ч��ʼ����
     */
    private Date beginDate;

    /**
     * ��Ч����
     */
    private Date endDate;

    /**
     * �����־
     */
    private String isProcessed;

    /**
     * ��Ч��־
     */
    private String isValid;

    /**
     * ������ԱID
     */
    private Short createdUser;

    /**
     * ����ʱ��
     */
    private Date createdTime;

    /**
     * �ֻ���
     */
    private String mobile;

    private Short updatedUser;

    private Date updatedTime;

    /**
     * ��Ч�·�
     */
    private String validMonth;

    /**
     * �³˳�����
     */
    private Short times;

    /**
     * ��ע
     */
    private String memo;

    /**
     * ���� :C ��ʱ���ֲ�Ա�� D ��ʱԱ��
     */
    private String type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
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

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(String isProcessed) {
        this.isProcessed = isProcessed;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(String validMonth) {
        this.validMonth = validMonth;
    }

    public Short getTimes() {
        return times;
    }

    public void setTimes(Short times) {
        this.times = times;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}