package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UiFreeOthers implements Serializable {
    private Integer id;

    /**
     * ��Ч�·�
     */
    private String validMonth;

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
     * ����
     */
    private String dept;

    /**
     * �³˳�����
     */
    private Integer times;

    /**
     * ��Ч��ʼ����
     */
    private Date beginDate;

    /**
     * ��Ч����
     */
    private Date endDate;

    /**
     * �˳������
     */
    private String cardNo;

    /**
     * �����־ Nδ���� Y�Ѵ���
     */
    private String isProcessed;

    /**
     * ��Ч��־
     */
    private String isValid;

    /**
     * ��ע
     */
    private String memo;

    /**
     * ������ԱID
     */
    private Short createdUser;

    /**
     * ����ʱ��
     */
    private Date createdTime;

    /**
     * ��˾
     */
    private String co;

    /**
     * Ʊ��
     */
    private String ticketType;

    /**
     * �ֻ���
     */
    private String mobile;

    private String updatedUser;

    private Date updatedTime;

    /**
     * �Ƿ��ǳ���֤Ա�� ;Y��ʾ����֤Ա�� ""Ϊ������˾Ա��
     */
    private String isPass;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(String validMonth) {
        this.validMonth = validMonth;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getIsPass() {
        return isPass;
    }

    public void setIsPass(String isPass) {
        this.isPass = isPass;
    }
}