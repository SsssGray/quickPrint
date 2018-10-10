package cn.xydata.entity;

import java.util.Date;

public class DrugDomestic {
    private String id;

    private Date gmtCreate;

    private Date gmtModify;

    private Integer isDeleted;

    private String myId;

    private String approvalNumber;

    private String productName;

    private String englishName;

    private String commodityName;

    private String dosage;

    private String specifications;

    private String productUnit;

    private String productAddr;

    private String productType;

    private String approvalTime;

    private String originalApprovalNumber;

    private String drugStandardCode;

    private String drugStandardCodeRemark;

    private String relatedDatabase;

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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId == null ? null : myId.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public String getProductAddr() {
        return productAddr;
    }

    public void setProductAddr(String productAddr) {
        this.productAddr = productAddr == null ? null : productAddr.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime == null ? null : approvalTime.trim();
    }

    public String getOriginalApprovalNumber() {
        return originalApprovalNumber;
    }

    public void setOriginalApprovalNumber(String originalApprovalNumber) {
        this.originalApprovalNumber = originalApprovalNumber == null ? null : originalApprovalNumber.trim();
    }

    public String getDrugStandardCode() {
        return drugStandardCode;
    }

    public void setDrugStandardCode(String drugStandardCode) {
        this.drugStandardCode = drugStandardCode == null ? null : drugStandardCode.trim();
    }

    public String getDrugStandardCodeRemark() {
        return drugStandardCodeRemark;
    }

    public void setDrugStandardCodeRemark(String drugStandardCodeRemark) {
        this.drugStandardCodeRemark = drugStandardCodeRemark == null ? null : drugStandardCodeRemark.trim();
    }

    public String getRelatedDatabase() {
        return relatedDatabase;
    }

    public void setRelatedDatabase(String relatedDatabase) {
        this.relatedDatabase = relatedDatabase == null ? null : relatedDatabase.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}