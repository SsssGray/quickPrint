package cn.xydata.entity;

import java.util.Date;

public class TFoodMenuperiod {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String foodmenuid;

    private Integer periodcode;

    private String periodname;

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

    public Integer getPeriodcode() {
        return periodcode;
    }

    public void setPeriodcode(Integer periodcode) {
        this.periodcode = periodcode;
    }

    public String getPeriodname() {
        return periodname;
    }

    public void setPeriodname(String periodname) {
        this.periodname = periodname == null ? null : periodname.trim();
    }
}