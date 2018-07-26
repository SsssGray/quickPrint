package cn.xydata.entity;

import java.util.Date;

public class TPayLog {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private String namecreate;

    private String namemodified;

    private Integer isdeleted;

    private String payserialno;

    private String payid;

    private String payee;

    private String payeename;

    private String amount;

    private String payor;

    private String payorname;

    private String paytype;

    private Date paytime;

    private String periodcode;

    private String paylogtype;

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

    public String getPayserialno() {
        return payserialno;
    }

    public void setPayserialno(String payserialno) {
        this.payserialno = payserialno == null ? null : payserialno.trim();
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid == null ? null : payid.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public String getPayeename() {
        return payeename;
    }

    public void setPayeename(String payeename) {
        this.payeename = payeename == null ? null : payeename.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getPayor() {
        return payor;
    }

    public void setPayor(String payor) {
        this.payor = payor == null ? null : payor.trim();
    }

    public String getPayorname() {
        return payorname;
    }

    public void setPayorname(String payorname) {
        this.payorname = payorname == null ? null : payorname.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getPeriodcode() {
        return periodcode;
    }

    public void setPeriodcode(String periodcode) {
        this.periodcode = periodcode == null ? null : periodcode.trim();
    }

    public String getPaylogtype() {
        return paylogtype;
    }

    public void setPaylogtype(String paylogtype) {
        this.paylogtype = paylogtype == null ? null : paylogtype.trim();
    }
}