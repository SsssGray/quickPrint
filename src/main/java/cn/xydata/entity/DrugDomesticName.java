package cn.xydata.entity;

import java.util.Date;

public class DrugDomesticName {
    private String id;

    private Date gmtCreate;

    private Date gmtModify;

    private Integer isDeleted;

    private String myId;

    private String approvalNumber;

    private String approvalNumberRemark;

    private String productNameCn;

    private String productNameEn;

    private String commodityName;

    private String productUnit;

    private String dosage;

    private String specifications;

    private String productType;

    private String approvalTime;

    private String originalApprovalNumber;

    private String drugStandardCode;

    private String drugStandardCodeRemark;

    private String productAddr;

    private String relatedDatabase;

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

    public String getApprovalNumberRemark() {
        return approvalNumberRemark;
    }

    public void setApprovalNumberRemark(String approvalNumberRemark) {
        this.approvalNumberRemark = approvalNumberRemark == null ? null : approvalNumberRemark.trim();
    }

    public String getProductNameCn() {
        return productNameCn;
    }

    public void setProductNameCn(String productNameCn) {
        this.productNameCn = productNameCn == null ? null : productNameCn.trim();
    }

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn == null ? null : productNameEn.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
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

    public String getProductAddr() {
        return productAddr;
    }

    public void setProductAddr(String productAddr) {
        this.productAddr = productAddr == null ? null : productAddr.trim();
    }

    public String getRelatedDatabase() {
        return relatedDatabase;
    }

    public void setRelatedDatabase(String relatedDatabase) {
        this.relatedDatabase = relatedDatabase == null ? null : relatedDatabase.trim();
    }
}