package cn.xydata.entity;

import java.util.Date;

public class TWmsMenu {
    private String id;

    private Date gmtcreate;

    private String namecreate;

    private Date gmtmodified;

    private String namemodified;

    private Integer isdeleted;

    private String wmsid;

    private String menuserial;

    private String menuname;

    private String price;

    private Integer status;

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

    public String getNamecreate() {
        return namecreate;
    }

    public void setNamecreate(String namecreate) {
        this.namecreate = namecreate == null ? null : namecreate.trim();
    }

    public Date getGmtmodified() {
        return gmtmodified;
    }

    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
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

    public String getWmsid() {
        return wmsid;
    }

    public void setWmsid(String wmsid) {
        this.wmsid = wmsid == null ? null : wmsid.trim();
    }

    public String getMenuserial() {
        return menuserial;
    }

    public void setMenuserial(String menuserial) {
        this.menuserial = menuserial == null ? null : menuserial.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}