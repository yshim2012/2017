package com.xybus.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TbCarrier implements Serializable {
    private Integer id;

    /**
     * 承运商名称
     */
    private String carriername;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String address;

    /**
     * 状态
     */
    private String status;

    private Date createtime;

    private Byte createuserid;

    private Date updatetime;

    private Byte updateuserid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarriername() {
        return carriername;
    }

    public void setCarriername(String carriername) {
        this.carriername = carriername;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Byte createuserid) {
        this.createuserid = createuserid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Byte updateuserid) {
        this.updateuserid = updateuserid;
    }
}