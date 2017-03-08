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
     * POS��ID
     */
    private String posNo;

    /**
     * ����
     */
    private String cardPin;

    /**
     * �ϳ�����
     */
    private BigDecimal boardingLongitude;

    /**
     * �ϳ�γ��
     */
    private BigDecimal boardingLatitude;

    /**
     * �³�����
     */
    private BigDecimal alightingLongitude;

    /**
     * �³�γ��
     */
    private BigDecimal alightingLatitude;

    /**
     * �ϳ�ˢ��ʱ��
     */
    private Date boardingTime;

    /**
     * �³�ˢ��ʱ��
     */
    private Date alightingTime;

    /**
     * �³�վ��
     */
    private Integer alightingLocId;

    /**
     * �ϳ�վ��
     */
    private Integer boardingLocId;

    /**
     * ·��
     */
    private Short routeId;

    /**
     * Ʊ��
     */
    private String ticketType;

    /**
     * ���
     */
    private BigDecimal amount;

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
     * ��˾
     */
    private String co;

    /**
     * ������
     */
    private String cardType;

    /**
     * �˳�����
     */
    private String commuteType;

    /**
     * ���˵�λ
     */
    private Short carrierId;

    /**
     * N:�����ֹ����룬����ֵΪ�ӿ�
     */
    private String sourceType;

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

    /**
     * ״̬N:����E:�쳣
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