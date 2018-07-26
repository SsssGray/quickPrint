package cn.xydata.entity;

import java.util.Date;

public class TUserWallet {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String userid;

    private String password;

    private String balance;

    private String frozenbalance;

    private String idcard;

    private String cardnumber;

    private String telephone;

    private String smscode;

    private Integer issend;

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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }

    public String getFrozenbalance() {
        return frozenbalance;
    }

    public void setFrozenbalance(String frozenbalance) {
        this.frozenbalance = frozenbalance == null ? null : frozenbalance.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode == null ? null : smscode.trim();
    }

    public Integer getIssend() {
        return issend;
    }

    public void setIssend(Integer issend) {
        this.issend = issend;
    }
}