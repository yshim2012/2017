package com.xybus.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class TRideData implements Serializable {
    private Integer id;

    /**
     * POS机ID
     */
    private String posNo;

    /**
     * 卡号
     */
    private String cardPin;

    /**
     * 上车经度
     */
    private BigDecimal boardingLongitude;

    /**
     * 上车纬度
     */
    private BigDecimal boardingLatitude;

    /**
     * 下车经度
     */
    private BigDecimal alightingLongitude;

    /**
     * 下车纬度
     */
    private BigDecimal alightingLatitude;

    /**
     * 上车刷卡时间
     */
    private Date boardingTime;

    /**
     * 下车刷卡时间
     */
    private Date alightingTime;

    /**
     * 下车站点
     */
    private Integer alightingLocId;

    /**
     * 上车站点
     */
    private Integer boardingLocId;

    /**
     * 路线
     */
    private Short routeId;

    /**
     * 票种
     */
    private String ticketType;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 姓名
     */
    private String name;

    /**
     * 部门
     */
    private String dept;

    /**
     * 公司
     */
    private String co;

    /**
     * 卡类型
     */
    private String cardType;

    /**
     * 乘车类型
     */
    private String commuteType;

    /**
     * 承运单位
     */
    private Short carrierId;

    /**
     * N:代表手工导入，不赋值为接口
     */
    private String sourceType;

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

    /**
     * 状态N:正常E:异常
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    public BigDecimal getBoardingLongitude() {
        return boardingLongitude;
    }

    public void setBoardingLongitude(BigDecimal boardingLongitude) {
        this.boardingLongitude = boardingLongitude;
    }

    public BigDecimal getBoardingLatitude() {
        return boardingLatitude;
    }

    public void setBoardingLatitude(BigDecimal boardingLatitude) {
        this.boardingLatitude = boardingLatitude;
    }

    public BigDecimal getAlightingLongitude() {
        return alightingLongitude;
    }

    public void setAlightingLongitude(BigDecimal alightingLongitude) {
        this.alightingLongitude = alightingLongitude;
    }

    public BigDecimal getAlightingLatitude() {
        return alightingLatitude;
    }

    public void setAlightingLatitude(BigDecimal alightingLatitude) {
        this.alightingLatitude = alightingLatitude;
    }

    public Date getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(Date boardingTime) {
        this.boardingTime = boardingTime;
    }

    public Date getAlightingTime() {
        return alightingTime;
    }

    public void setAlightingTime(Date alightingTime) {
        this.alightingTime = alightingTime;
    }

    public Integer getAlightingLocId() {
        return alightingLocId;
    }

    public void setAlightingLocId(Integer alightingLocId) {
        this.alightingLocId = alightingLocId;
    }

    public Integer getBoardingLocId() {
        return boardingLocId;
    }

    public void setBoardingLocId(Integer boardingLocId) {
        this.boardingLocId = boardingLocId;
    }

    public Short getRouteId() {
        return routeId;
    }

    public void setRouteId(Short routeId) {
        this.routeId = routeId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCommuteType() {
        return commuteType;
    }

    public void setCommuteType(String commuteType) {
        this.commuteType = commuteType;
    }

    public Short getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Short carrierId) {
        this.carrierId = carrierId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}