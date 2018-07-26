package cn.xydata.entity;

import java.util.Date;

public class TOrderDetail {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private String namecreate;

    private String namemodified;

    private Integer isdeleted;

    private String orderid;

    private String foodmenuid;

    private String active;

    private String remark;

    private Integer number;

    private String skufrom;

    private String skuid;

    private String historyprice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getGmtcreate() {
        return gmtcreate;
    }

    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
    }

    public Date getGmtmodified() {
        return gmtmodified;
    }

    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
    }

    public String getNamecreate() {
        return namecreate;
    }

    public void setNamecreate(String namecreate) {
        this.namecreate = namecreate == null ? null : namecreate.trim();
    }

    public String getNamemodified() {
        return namemodified;
    }

    public void setNamemodified(String namemodified) {
        this.namemodified = namemodified == null ? null : namemodified.trim();
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getFoodmenuid() {
        return foodmenuid;
    }

    public void setFoodmenuid(String foodmenuid) {
        this.foodmenuid = foodmenuid == null ? null : foodmenuid.trim();
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSkufrom() {
        return skufrom;
    }

    public void setSkufrom(String skufrom) {
        this.skufrom = skufrom == null ? null : skufrom.trim();
    }

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid == null ? null : skuid.trim();
    }

    public String getHistoryprice() {
        return historyprice;
    }

    public void setHistoryprice(String historyprice) {
        this.historyprice = historyprice == null ? null : historyprice.trim();
    }
}