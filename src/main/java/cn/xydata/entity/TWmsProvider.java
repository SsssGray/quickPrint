package cn.xydata.entity;

import java.util.Date;

public class TWmsProvider {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String providername;

    private String providercontact;

    private String providertel;

    private String provideremail;

    private String provideraddr;

    private String providerno;

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

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername == null ? null : providername.trim();
    }

    public String getProvidercontact() {
        return providercontact;
    }

    public void setProvidercontact(String providercontact) {
        this.providercontact = providercontact == null ? null : providercontact.trim();
    }

    public String getProvidertel() {
        return providertel;
    }

    public void setProvidertel(String providertel) {
        this.providertel = providertel == null ? null : providertel.trim();
    }

    public String getProvideremail() {
        return provideremail;
    }

    public void setProvideremail(String provideremail) {
        this.provideremail = provideremail == null ? null : provideremail.trim();
    }

    public String getProvideraddr() {
        return provideraddr;
    }

    public void setProvideraddr(String provideraddr) {
        this.provideraddr = provideraddr == null ? null : provideraddr.trim();
    }

    public String getProviderno() {
        return providerno;
    }

    public void setProviderno(String providerno) {
        this.providerno = providerno == null ? null : providerno.trim();
    }
}