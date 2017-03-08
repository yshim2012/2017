package com.xybus.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class TMonthSummary implements Serializable {
    private Integer id;

    /**
     * �˿�ID
     */
    private Integer tPassengerId;

    /**
     * ʵ�ʳ˳��Ĵ�����ID
     */
    private Integer ticketTimesId;

    /**
     * ��Ч�·�
     */
    private String validMonth;

    /**
     * �̶��˳�����
     */
    private Integer uiFreeTimes;

    /**
     * �̶��˳�ʵ�ʳ˳�����
     */
    private Integer uiFreeAfterTimes;

    /**
     * ������˾�˳�����
     */
    private Integer uiOthersTimes;

    /**
     * ������˾ʵ�ʳ˳�����
     */
    private Integer uiOthersAfterTimes;

    /**
     * ��ʱ�˳�����
     */
    private Integer uiOvertimeTimes;

    /**
     * ��ʱ�˳�ʵ�ʳ˳�����
     */
    private Integer uiOvertimeAfterTimes;

    /**
     * ���ֿ��˳�����
     */
    private Integer uiSpecialTimes;

    /**
     * ���ֿ��˳�ʵ�ʳ˳�����
     */
    private Integer uiSpecialAfterTimes;

    /**
     * �ؿ���ֵ�˳�����
     */
    private Integer uiRechargeTimes;

    /**
     * �ؿ��˳�ʵ�ʳ˳�����
     */
    private Integer uiRechargeAfterTimes;

    /**
     * �˳�����ֵ�˳�����
     */
    private Integer uiCardRechargeTimes;

    /**
     * �˳�����ֵ�˳�ʵ�ʳ˳�����
     */
    private Integer uiCardRechargeAfterTimes;

    /**
     * ��˾������
     */
    private BigDecimal companyMoney;

    /**
     * ���˽�����
     */
    private BigDecimal personalMoney;

    private Integer pTotalTimesA;

    /**
     * 0
     */
    private Integer pTotalTimesB;

    private Integer pTotalTimesC;

    /**
     * �ù�ʽƱ�ּ���Ĵ���
     */
    private Integer calTicketTypeTimes;

    /**
     * ��ʽƱ��
     */
    private String calTicketType;

    /**
     * Υ��״̬ N'��Υ��'��Y'Υ��'
     */
    private String wrongStatus;

    /**
     * ����AƱ�ִ���
     */
    private Integer totalTimesA;

    /**
     * ����BƱ�ִ���
     */
    private Integer totalTimesB;

    /**
     * ����CƱ�ִ���
     */
    private Integer totalTimesC;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * ������Ա
     */
    private Short createUser;

    private Short updateUser;

    /**
     * ����ʱ��
     */
    private Date updateTime;

    /**
     * ����״̬
     */
    private String summaryStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettPassengerId() {
        return tPassengerId;
    }

    public void settPassengerId(Integer tPassengerId) {
        this.tPassengerId = tPassengerId;
    }

    public Integer getTicketTimesId() {
        return ticketTimesId;
    }

    public void setTicketTimesId(Integer ticketTimesId) {
        this.ticketTimesId = ticketTimesId;
    }

    public String getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(String validMonth) {
        this.validMonth = validMonth;
    }

    public Integer getUiFreeTimes() {
        return uiFreeTimes;
    }

    public void setUiFreeTimes(Integer uiFreeTimes) {
        this.uiFreeTimes = uiFreeTimes;
    }

    public Integer getUiFreeAfterTimes() {
        return uiFreeAfterTimes;
    }

    public void setUiFreeAfterTimes(Integer uiFreeAfterTimes) {
        this.uiFreeAfterTimes = uiFreeAfterTimes;
    }

    public Integer getUiOthersTimes() {
        return uiOthersTimes;
    }

    public void setUiOthersTimes(Integer uiOthersTimes) {
        this.uiOthersTimes = uiOthersTimes;
    }

    public Integer getUiOthersAfterTimes() {
        return uiOthersAfterTimes;
    }

    public void setUiOthersAfterTimes(Integer uiOthersAfterTimes) {
        this.uiOthersAfterTimes = uiOthersAfterTimes;
    }

    public Integer getUiOvertimeTimes() {
        return uiOvertimeTimes;
    }

    public void setUiOvertimeTimes(Integer uiOvertimeTimes) {
        this.uiOvertimeTimes = uiOvertimeTimes;
    }

    public Integer getUiOvertimeAfterTimes() {
        return uiOvertimeAfterTimes;
    }

    public void setUiOvertimeAfterTimes(Integer uiOvertimeAfterTimes) {
        this.uiOvertimeAfterTimes = uiOvertimeAfterTimes;
    }

    public Integer getUiSpecialTimes() {
        return uiSpecialTimes;
    }

    public void setUiSpecialTimes(Integer uiSpecialTimes) {
        this.uiSpecialTimes = uiSpecialTimes;
    }

    public Integer getUiSpecialAfterTimes() {
        return uiSpecialAfterTimes;
    }

    public void setUiSpecialAfterTimes(Integer uiSpecialAfterTimes) {
        this.uiSpecialAfterTimes = uiSpecialAfterTimes;
    }

    public Integer getUiRechargeTimes() {
        return uiRechargeTimes;
    }

    public void setUiRechargeTimes(Integer uiRechargeTimes) {
        this.uiRechargeTimes = uiRechargeTimes;
    }

    public Integer getUiRechargeAfterTimes() {
        return uiRechargeAfterTimes;
    }

    public void setUiRechargeAfterTimes(Integer uiRechargeAfterTimes) {
        this.uiRechargeAfterTimes = uiRechargeAfterTimes;
    }

    public Integer getUiCardRechargeTimes() {
        return uiCardRechargeTimes;
    }

    public void setUiCardRechargeTimes(Integer uiCardRechargeTimes) {
        this.uiCardRechargeTimes = uiCardRechargeTimes;
    }

    public Integer getUiCardRechargeAfterTimes() {
        return uiCardRechargeAfterTimes;
    }

    public void setUiCardRechargeAfterTimes(Integer uiCardRechargeAfterTimes) {
        this.uiCardRechargeAfterTimes = uiCardRechargeAfterTimes;
    }

    public BigDecimal getCompanyMoney() {
        return companyMoney;
    }

    public void setCompanyMoney(BigDecimal companyMoney) {
        this.companyMoney = companyMoney;
    }

    public BigDecimal getPersonalMoney() {
        return personalMoney;
    }

    public void setPersonalMoney(BigDecimal personalMoney) {
        this.personalMoney = personalMoney;
    }

    public Integer getpTotalTimesA() {
        return pTotalTimesA;
    }

    public void setpTotalTimesA(Integer pTotalTimesA) {
        this.pTotalTimesA = pTotalTimesA;
    }

    public Integer getpTotalTimesB() {
        return pTotalTimesB;
    }

    public void setpTotalTimesB(Integer pTotalTimesB) {
        this.pTotalTimesB = pTotalTimesB;
    }

    public Integer getpTotalTimesC() {
        return pTotalTimesC;
    }

    public void setpTotalTimesC(Integer pTotalTimesC) {
        this.pTotalTimesC = pTotalTimesC;
    }

    public Integer getCalTicketTypeTimes() {
        return calTicketTypeTimes;
    }

    public void setCalTicketTypeTimes(Integer calTicketTypeTimes) {
        this.calTicketTypeTimes = calTicketTypeTimes;
    }

    public String getCalTicketType() {
        return calTicketType;
    }

    public void setCalTicketType(String calTicketType) {
        this.calTicketType = calTicketType;
    }

    public String getWrongStatus() {
        return wrongStatus;
    }

    public void setWrongStatus(String wrongStatus) {
        this.wrongStatus = wrongStatus;
    }

    public Integer getTotalTimesA() {
        return totalTimesA;
    }

    public void setTotalTimesA(Integer totalTimesA) {
        this.totalTimesA = totalTimesA;
    }

    public Integer getTotalTimesB() {
        return totalTimesB;
    }

    public void setTotalTimesB(Integer totalTimesB) {
        this.totalTimesB = totalTimesB;
    }

    public Integer getTotalTimesC() {
        return totalTimesC;
    }

    public void setTotalTimesC(Integer totalTimesC) {
        this.totalTimesC = totalTimesC;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Short createUser) {
        this.createUser = createUser;
    }

    public Short getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Short updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSummaryStatus() {
        return summaryStatus;
    }

    public void setSummaryStatus(String summaryStatus) {
        this.summaryStatus = summaryStatus;
    }
}