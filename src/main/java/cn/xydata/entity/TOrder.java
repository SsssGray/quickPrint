package cn.xydata.entity;

import java.util.Date;

public class TOrder {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private String namecreate;

    private String namemodified;

    private Integer isdeleted;

    private String orderaddr;

    private String totalprice;

    private String paytype;

    private String status;

    private String statustext;

    private String totalpriceoff;

    private String totaldiscount;

    private String paysubject;

    private String remark;

    private String telephone;

    private String ordersource;

    private String orderno;

    private String ordersubject;

    private String content;

    private String periodcode;

    private String ordername;

    private String payname;

    private String sentouttime;

    private String sentouttype;

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

    public String getOrderaddr() {
        return orderaddr;
    }

    public void setOrderaddr(String orderaddr) {
        this.orderaddr = orderaddr == null ? null : orderaddr.trim();
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatustext() {
        return statustext;
    }

    public void setStatustext(String statustext) {
        this.statustext = statustext == null ? null : statustext.trim();
    }

    public String getTotalpriceoff() {
        return totalpriceoff;
    }

    public void setTotalpriceoff(String totalpriceoff) {
        this.totalpriceoff = totalpriceoff == null ? null : totalpriceoff.trim();
    }

    public String getTotaldiscount() {
        return totaldiscount;
    }

    public void setTotaldiscount(String totaldiscount) {
        this.totaldiscount = totaldiscount == null ? null : totaldiscount.trim();
    }

    public String getPaysubject() {
        return paysubject;
    }

    public void setPaysubject(String paysubject) {
        this.paysubject = paysubject == null ? null : paysubject.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getOrdersource() {
        return ordersource;
    }

    public void setOrdersource(String ordersource) {
        this.ordersource = ordersource == null ? null : ordersource.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getOrdersubject() {
        return ordersubject;
    }

    public void setOrdersubject(String ordersubject) {
        this.ordersubject = ordersubject == null ? null : ordersubject.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPeriodcode() {
        return periodcode;
    }

    public void setPeriodcode(String periodcode) {
        this.periodcode = periodcode == null ? null : periodcode.trim();
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname == null ? null : payname.trim();
    }

    public String getSentouttime() {
        return sentouttime;
    }

    public void setSentouttime(String sentouttime) {
        this.sentouttime = sentouttime == null ? null : sentouttime.trim();
    }

    public String getSentouttype() {
        return sentouttype;
    }

    public void setSentouttype(String sentouttype) {
        this.sentouttype = sentouttype == null ? null : sentouttype.trim();
    }
}