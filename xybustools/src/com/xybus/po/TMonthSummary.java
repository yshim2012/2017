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
     * 乘客ID
     */
    private Integer tPassengerId;

    /**
     * 实际乘车的次数表ID
     */
    private Integer ticketTimesId;

    /**
     * 有效月份
     */
    private String validMonth;

    /**
     * 固定乘车次数
     */
    private Integer uiFreeTimes;

    /**
     * 固定乘车实际乘车次数
     */
    private Integer uiFreeAfterTimes;

    /**
     * 其他公司乘车次数
     */
    private Integer uiOthersTimes;

    /**
     * 其他公司实际乘车次数
     */
    private Integer uiOthersAfterTimes;

    /**
     * 错时乘车次数
     */
    private Integer uiOvertimeTimes;

    /**
     * 错时乘车实际乘车次数
     */
    private Integer uiOvertimeAfterTimes;

    /**
     * 特种卡乘车次数
     */
    private Integer uiSpecialTimes;

    /**
     * 特种卡乘车实际乘车次数
     */
    private Integer uiSpecialAfterTimes;

    /**
     * 胸卡充值乘车次数
     */
    private Integer uiRechargeTimes;

    /**
     * 胸卡乘车实际乘车次数
     */
    private Integer uiRechargeAfterTimes;

    /**
     * 乘车卡充值乘车次数
     */
    private Integer uiCardRechargeTimes;

    /**
     * 乘车卡充值乘车实际乘车次数
     */
    private Integer uiCardRechargeAfterTimes;

    /**
     * 公司结算金额
     */
    private BigDecimal companyMoney;

    /**
     * 个人结算金额
     */
    private BigDecimal personalMoney;

    private Integer pTotalTimesA;

    /**
     * 0
     */
    private Integer pTotalTimesB;

    private Integer pTotalTimesC;

    /**
     * 用公式票种计算的次数
     */
    private Integer calTicketTypeTimes;

    /**
     * 公式票种
     */
    private String calTicketType;

    /**
     * 违规状态 N'不违规'，Y'违规'
     */
    private String wrongStatus;

    /**
     * 结算A票种次数
     */
    private Integer totalTimesA;

    /**
     * 结算B票种次数
     */
    private Integer totalTimesB;

    /**
     * 结算C票种次数
     */
    private Integer totalTimesC;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人员
     */
    private Short createUser;

    private Short updateUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 结算状态
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