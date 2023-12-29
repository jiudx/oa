package com.oracle.pojo;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable {
    private Integer cid;

    private String carnum;

    private Integer state;

    private Date createtime;

    private Integer fromsid;

    private Integer tosid;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFromsid() {
        return fromsid;
    }

    public void setFromsid(Integer fromsid) {
        this.fromsid = fromsid;
    }

    public Integer getTosid() {
        return tosid;
    }

    public void setTosid(Integer tosid) {
        this.tosid = tosid;
    }
}