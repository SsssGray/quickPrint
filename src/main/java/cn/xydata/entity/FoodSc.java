package cn.xydata.entity;

import java.util.Date;

public class FoodSc {
    private String id;

    private Date gmtCreate;

    private Date gmtModify;

    private String productName;

    private String socialCreditCode;

    private String legalPerson;

    private String residence;

    private String productAddr;

    private String foodType;

    private String licenseNumber;

    private String dailyMechanism;

    private String dailyPerson;

    private String issuingOrgan;

    private String issuingPerson;

    private String lussingTime;

    private String termOfValidity;

    private String myId;

    private String permissionDetail;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode == null ? null : socialCreditCode.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public String getProductAddr() {
        return productAddr;
    }

    public void setProductAddr(String productAddr) {
        this.productAddr = productAddr == null ? null : productAddr.trim();
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType == null ? null : foodType.trim();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    public String getDailyMechanism() {
        return dailyMechanism;
    }

    public void setDailyMechanism(String dailyMechanism) {
        this.dailyMechanism = dailyMechanism == null ? null : dailyMechanism.trim();
    }

    public String getDailyPerson() {
        return dailyPerson;
    }

    public void setDailyPerson(String dailyPerson) {
        this.dailyPerson = dailyPerson == null ? null : dailyPerson.trim();
    }

    public String getIssuingOrgan() {
        return issuingOrgan;
    }

    public void setIssuingOrgan(String issuingOrgan) {
        this.issuingOrgan = issuingOrgan == null ? null : issuingOrgan.trim();
    }

    public String getIssuingPerson() {
        return issuingPerson;
    }

    public void setIssuingPerson(String issuingPerson) {
        this.issuingPerson = issuingPerson == null ? null : issuingPerson.trim();
    }

    public String getLussingTime() {
        return lussingTime;
    }

    public void setLussingTime(String lussingTime) {
        this.lussingTime = lussingTime == null ? null : lussingTime.trim();
    }

    public String getTermOfValidity() {
        return termOfValidity;
    }

    public void setTermOfValidity(String termOfValidity) {
        this.termOfValidity = termOfValidity == null ? null : termOfValidity.trim();
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId == null ? null : myId.trim();
    }

    public String getPermissionDetail() {
        return permissionDetail;
    }

    public void setPermissionDetail(String permissionDetail) {
        this.permissionDetail = permissionDetail == null ? null : permissionDetail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}