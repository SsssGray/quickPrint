package cn.xydata.entity;

import java.util.Date;

public class TFoodType {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String parentid;

    private Integer isnode;

    private String foodtypecode;

    private String foodtypename;

    private String foodtypefor;

    private String foodtyperule;

    private String remark;

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

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
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

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Integer getIsnode() {
        return isnode;
    }

    public void setIsnode(Integer isnode) {
        this.isnode = isnode;
    }

    public String getFoodtypecode() {
        return foodtypecode;
    }

    public void setFoodtypecode(String foodtypecode) {
        this.foodtypecode = foodtypecode == null ? null : foodtypecode.trim();
    }

    public String getFoodtypename() {
        return foodtypename;
    }

    public void setFoodtypename(String foodtypename) {
        this.foodtypename = foodtypename == null ? null : foodtypename.trim();
    }

    public String getFoodtypefor() {
        return foodtypefor;
    }

    public void setFoodtypefor(String foodtypefor) {
        this.foodtypefor = foodtypefor == null ? null : foodtypefor.trim();
    }

    public String getFoodtyperule() {
        return foodtyperule;
    }

    public void setFoodtyperule(String foodtyperule) {
        this.foodtyperule = foodtyperule == null ? null : foodtyperule.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}