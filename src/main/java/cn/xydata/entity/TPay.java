package cn.xydata.entity;

import java.util.Date;

public class TPay {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private String namecreate;

    private String namemodified;

    private Integer isdeleted;

    private String payserialno;

    private String payee;

    private String payeename;

    private String amount;

    private String payor;

    private String payorname;

    private String paytype;

    private Date paytime;

    private String paystatus;

    private String paystatustext;

    private String remark;

    private String retid;

    private String orderid;

    private String periodcode;

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

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus == null ? null : paystatus.trim();
    }

    public String getPaystatustext() {
        return paystatustext;
    }

    public void setPaystatustext(String paystatustext) {
        this.paystatustext = paystatustext == null ? null : paystatustext.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRetid() {
        return retid;
    }

    public void setRetid(String retid) {
        this.retid = retid == null ? null : retid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getPeriodcode() {
        return periodcode;
    }

    public void setPeriodcode(String periodcode) {
        this.periodcode = periodcode == null ? null : periodcode.trim();
    }
}