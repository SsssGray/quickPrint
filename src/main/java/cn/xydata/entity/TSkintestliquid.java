package cn.xydata.entity;

import java.util.Date;

public class TSkintestliquid {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String skintestpackid;

    private String drugqrcode;

    private String drugid;

    private String drugname;

    private String delaytime;

    private String specs;

    private String origin;

    private String batchnumber;

    private String skintestresult;

    private String operatename;

    private String operateworknumber;

    private String checkname;

    private String checkworknumber;

    private Date startat;

    private Date finishat;

    private String drugcommname;

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

    public String getSkintestpackid() {
        return skintestpackid;
    }

    public void setSkintestpackid(String skintestpackid) {
        this.skintestpackid = skintestpackid == null ? null : skintestpackid.trim();
    }

    public String getDrugqrcode() {
        return drugqrcode;
    }

    public void setDrugqrcode(String drugqrcode) {
        this.drugqrcode = drugqrcode == null ? null : drugqrcode.trim();
    }

    public String getDrugid() {
        return drugid;
    }

    public void setDrugid(String drugid) {
        this.drugid = drugid == null ? null : drugid.trim();
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public String getDelaytime() {
        return delaytime;
    }

    public void setDelaytime(String delaytime) {
        this.delaytime = delaytime == null ? null : delaytime.trim();
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs == null ? null : specs.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }

    public String getSkintestresult() {
        return skintestresult;
    }

    public void setSkintestresult(String skintestresult) {
        this.skintestresult = skintestresult == null ? null : skintestresult.trim();
    }

    public String getOperatename() {
        return operatename;
    }

    public void setOperatename(String operatename) {
        this.operatename = operatename == null ? null : operatename.trim();
    }

    public String getOperateworknumber() {
        return operateworknumber;
    }

    public void setOperateworknumber(String operateworknumber) {
        this.operateworknumber = operateworknumber == null ? null : operateworknumber.trim();
    }

    public String getCheckname() {
        return checkname;
    }

    public void setCheckname(String checkname) {
        this.checkname = checkname == null ? null : checkname.trim();
    }

    public String getCheckworknumber() {
        return checkworknumber;
    }

    public void setCheckworknumber(String checkworknumber) {
        this.checkworknumber = checkworknumber == null ? null : checkworknumber.trim();
    }

    public Date getStartat() {
        return startat;
    }

    public void setStartat(Date startat) {
        this.startat = startat;
    }

    public Date getFinishat() {
        return finishat;
    }

    public void setFinishat(Date finishat) {
        this.finishat = finishat;
    }

    public String getDrugcommname() {
        return drugcommname;
    }

    public void setDrugcommname(String drugcommname) {
        this.drugcommname = drugcommname == null ? null : drugcommname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}