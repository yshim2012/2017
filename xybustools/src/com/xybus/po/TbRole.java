package com.xybus.po;

import java.io.Serializable;

/**
 * @author 
 */
public class TbRole implements Serializable {
    private Integer id;

    private String name;

    private String nmDisplay;

    /**
     * N:承运商 Y:管理员
     */
    private String flgSystem;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNmDisplay() {
        return nmDisplay;
    }

    public void setNmDisplay(String nmDisplay) {
        this.nmDisplay = nmDisplay;
    }

    public String getFlgSystem() {
        return flgSystem;
    }

    public void setFlgSystem(String flgSystem) {
        this.flgSystem = flgSystem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}