package cn.xydata.entity;

import java.util.Date;

public class TFoodMenu {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String skuid;

    private String menuserial;

    private String skutype;

    private String skutypename;

    private String menudate;

    private String menuperiod;

    private Date menustarttime;

    private Date menuendtime;

    private String statustext;

    private Integer status;

    private String price;

    private String off;

    private String menuname;

    private String skufrom;

    private String skufor;

    private String skuforname;

    private String menudatetext;

    private String menuperiodtext;

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

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid == null ? null : skuid.trim();
    }

    public String getMenuserial() {
        return menuserial;
    }

    public void setMenuserial(String menuserial) {
        this.menuserial = menuserial == null ? null : menuserial.trim();
    }

    public String getSkutype() {
        return skutype;
    }

    public void setSkutype(String skutype) {
        this.skutype = skutype == null ? null : skutype.trim();
    }

    public String getSkutypename() {
        return skutypename;
    }

    public void setSkutypename(String skutypename) {
        this.skutypename = skutypename == null ? null : skutypename.trim();
    }

    public String getMenudate() {
        return menudate;
    }

    public void setMenudate(String menudate) {
        this.menudate = menudate == null ? null : menudate.trim();
    }

    public String getMenuperiod() {
        return menuperiod;
    }

    public void setMenuperiod(String menuperiod) {
        this.menuperiod = menuperiod == null ? null : menuperiod.trim();
    }

    public Date getMenustarttime() {
        return menustarttime;
    }

    public void setMenustarttime(Date menustarttime) {
        this.menustarttime = menustarttime;
    }

    public Date getMenuendtime() {
        return menuendtime;
    }

    public void setMenuendtime(Date menuendtime) {
        this.menuendtime = menuendtime;
    }

    public String getStatustext() {
        return statustext;
    }

    public void setStatustext(String statustext) {
        this.statustext = statustext == null ? null : statustext.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off == null ? null : off.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getSkufrom() {
        return skufrom;
    }

    public void setSkufrom(String skufrom) {
        this.skufrom = skufrom == null ? null : skufrom.trim();
    }

    public String getSkufor() {
        return skufor;
    }

    public void setSkufor(String skufor) {
        this.skufor = skufor == null ? null : skufor.trim();
    }

    public String getSkuforname() {
        return skuforname;
    }

    public void setSkuforname(String skuforname) {
        this.skuforname = skuforname == null ? null : skuforname.trim();
    }

    public String getMenudatetext() {
        return menudatetext;
    }

    public void setMenudatetext(String menudatetext) {
        this.menudatetext = menudatetext == null ? null : menudatetext.trim();
    }

    public String getMenuperiodtext() {
        return menuperiodtext;
    }

    public void setMenuperiodtext(String menuperiodtext) {
        this.menuperiodtext = menuperiodtext == null ? null : menuperiodtext.trim();
    }
}