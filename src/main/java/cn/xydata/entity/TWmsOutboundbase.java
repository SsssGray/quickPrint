package cn.xydata.entity;

import java.util.Date;

public class TWmsOutboundbase {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String outboundno;

    private Date outboundplantime;

    private Date outboundtime;

    private Integer status;

    private String outboundtype;

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

    public String getOutboundno() {
        return outboundno;
    }

    public void setOutboundno(String outboundno) {
        this.outboundno = outboundno == null ? null : outboundno.trim();
    }

    public Date getOutboundplantime() {
        return outboundplantime;
    }

    public void setOutboundplantime(Date outboundplantime) {
        this.outboundplantime = outboundplantime;
    }

    public Date getOutboundtime() {
        return outboundtime;
    }

    public void setOutboundtime(Date outboundtime) {
        this.outboundtime = outboundtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOutboundtype() {
        return outboundtype;
    }

    public void setOutboundtype(String outboundtype) {
        this.outboundtype = outboundtype == null ? null : outboundtype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}