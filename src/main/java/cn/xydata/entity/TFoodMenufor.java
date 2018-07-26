package cn.xydata.entity;

import java.util.Date;

public class TFoodMenufor {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String foodmenuid;

    private Integer skuforcode;

    private String skuforname;

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

    public String getFoodmenuid() {
        return foodmenuid;
    }

    public void setFoodmenuid(String foodmenuid) {
        this.foodmenuid = foodmenuid == null ? null : foodmenuid.trim();
    }

    public Integer getSkuforcode() {
        return skuforcode;
    }

    public void setSkuforcode(Integer skuforcode) {
        this.skuforcode = skuforcode;
    }

    public String getSkuforname() {
        return skuforname;
    }

    public void setSkuforname(String skuforname) {
        this.skuforname = skuforname == null ? null : skuforname.trim();
    }
}