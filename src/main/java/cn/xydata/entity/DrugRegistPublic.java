package cn.xydata.entity;

import java.util.Date;

public class DrugRegistPublic {
    private String id;

    private Date gmtCreate;

    private Date gmtModify;

    private Integer isDeleted;

    private String myId;

    private String admissibleNumber;

    private String recordNumber;

    private String drugNameCn;

    private String drugNameEn;

    private String drugType;

    private String dosage;

    private String specifications;

    private String pkgSpec;

    private String approvalNumber;

    private String drugStandard;

    private String recordContent;

    private String productUnit;

    private String recordDept;

    private String recordTime;

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

    public String getAdmissibleNumber() {
        return admissibleNumber;
    }

    public void setAdmissibleNumber(String admissibleNumber) {
        this.admissibleNumber = admissibleNumber == null ? null : admissibleNumber.trim();
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber == null ? null : recordNumber.trim();
    }

    public String getDrugNameCn() {
        return drugNameCn;
    }

    public void setDrugNameCn(String drugNameCn) {
        this.drugNameCn = drugNameCn == null ? null : drugNameCn.trim();
    }

    public String getDrugNameEn() {
        return drugNameEn;
    }

    public void setDrugNameEn(String drugNameEn) {
        this.drugNameEn = drugNameEn == null ? null : drugNameEn.trim();
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType == null ? null : drugType.trim();
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

    public String getPkgSpec() {
        return pkgSpec;
    }

    public void setPkgSpec(String pkgSpec) {
        this.pkgSpec = pkgSpec == null ? null : pkgSpec.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getDrugStandard() {
        return drugStandard;
    }

    public void setDrugStandard(String drugStandard) {
        this.drugStandard = drugStandard == null ? null : drugStandard.trim();
    }

    public String getRecordContent() {
        return recordContent;
    }

    public void setRecordContent(String recordContent) {
        this.recordContent = recordContent == null ? null : recordContent.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public String getRecordDept() {
        return recordDept;
    }

    public void setRecordDept(String recordDept) {
        this.recordDept = recordDept == null ? null : recordDept.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }
}