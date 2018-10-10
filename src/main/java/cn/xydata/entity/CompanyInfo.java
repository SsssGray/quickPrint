package cn.xydata.entity;

public class CompanyInfo {
    private String id;

    private String gmtCreate;

    private String gmtModify;

    private String socialCreditCode;

    private String name;

    private String type;

    private String legalPerson;

    private String registeredCapital;

    private String foundingTime;

    private String businessStart;

    private String businessEnd;

    private String registAuthority;

    private String approvalTime;

    private String status;

    private String address;

    private String scopeOperation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : gmtCreate.trim();
    }

    public String getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify == null ? null : gmtModify.trim();
    }

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode == null ? null : socialCreditCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    public String getFoundingTime() {
        return foundingTime;
    }

    public void setFoundingTime(String foundingTime) {
        this.foundingTime = foundingTime == null ? null : foundingTime.trim();
    }

    public String getBusinessStart() {
        return businessStart;
    }

    public void setBusinessStart(String businessStart) {
        this.businessStart = businessStart == null ? null : businessStart.trim();
    }

    public String getBusinessEnd() {
        return businessEnd;
    }

    public void setBusinessEnd(String businessEnd) {
        this.businessEnd = businessEnd == null ? null : businessEnd.trim();
    }

    public String getRegistAuthority() {
        return registAuthority;
    }

    public void setRegistAuthority(String registAuthority) {
        this.registAuthority = registAuthority == null ? null : registAuthority.trim();
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime == null ? null : approvalTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getScopeOperation() {
        return scopeOperation;
    }

    public void setScopeOperation(String scopeOperation) {
        this.scopeOperation = scopeOperation == null ? null : scopeOperation.trim();
    }
}