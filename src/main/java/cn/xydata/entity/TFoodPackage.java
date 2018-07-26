package cn.xydata.entity;

import java.util.Date;

public class TFoodPackage {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String pkgserial;

    private String pkgname;

    private String pkgtypecode;

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

    public String getPkgserial() {
        return pkgserial;
    }

    public void setPkgserial(String pkgserial) {
        this.pkgserial = pkgserial == null ? null : pkgserial.trim();
    }

    public String getPkgname() {
        return pkgname;
    }

    public void setPkgname(String pkgname) {
        this.pkgname = pkgname == null ? null : pkgname.trim();
    }

    public String getPkgtypecode() {
        return pkgtypecode;
    }

    public void setPkgtypecode(String pkgtypecode) {
        this.pkgtypecode = pkgtypecode == null ? null : pkgtypecode.trim();
    }
}