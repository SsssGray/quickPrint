package cn.xydata.entity;

import java.util.Date;

public class HtBaseDrug {
    private String id;

    private Date gmtcreate;

    private Date gmtmodified;

    private Integer isdeleted;

    private String namecreate;

    private String namemodified;

    private String drugname;

    private String drugcode;

    private String drugtype;

    private String spec;

    private String unit;

    private String storageunit;

    private String storagequantity;

    private String dispenseunit;

    private String dispensequantity;

    private String origin;

    private String dosageforms;

    private String dosage;

    private String dosageunit;

    private String commonname;

    private String approvalno;

    private String usebyfront;

    private String usebybackend;

    private String price;

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

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public String getDrugcode() {
        return drugcode;
    }

    public void setDrugcode(String drugcode) {
        this.drugcode = drugcode == null ? null : drugcode.trim();
    }

    public String getDrugtype() {
        return drugtype;
    }

    public void setDrugtype(String drugtype) {
        this.drugtype = drugtype == null ? null : drugtype.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getStorageunit() {
        return storageunit;
    }

    public void setStorageunit(String storageunit) {
        this.storageunit = storageunit == null ? null : storageunit.trim();
    }

    public String getStoragequantity() {
        return storagequantity;
    }

    public void setStoragequantity(String storagequantity) {
        this.storagequantity = storagequantity == null ? null : storagequantity.trim();
    }

    public String getDispenseunit() {
        return dispenseunit;
    }

    public void setDispenseunit(String dispenseunit) {
        this.dispenseunit = dispenseunit == null ? null : dispenseunit.trim();
    }

    public String getDispensequantity() {
        return dispensequantity;
    }

    public void setDispensequantity(String dispensequantity) {
        this.dispensequantity = dispensequantity == null ? null : dispensequantity.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getDosageforms() {
        return dosageforms;
    }

    public void setDosageforms(String dosageforms) {
        this.dosageforms = dosageforms == null ? null : dosageforms.trim();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getDosageunit() {
        return dosageunit;
    }

    public void setDosageunit(String dosageunit) {
        this.dosageunit = dosageunit == null ? null : dosageunit.trim();
    }

    public String getCommonname() {
        return commonname;
    }

    public void setCommonname(String commonname) {
        this.commonname = commonname == null ? null : commonname.trim();
    }

    public String getApprovalno() {
        return approvalno;
    }

    public void setApprovalno(String approvalno) {
        this.approvalno = approvalno == null ? null : approvalno.trim();
    }

    public String getUsebyfront() {
        return usebyfront;
    }

    public void setUsebyfront(String usebyfront) {
        this.usebyfront = usebyfront == null ? null : usebyfront.trim();
    }

    public String getUsebybackend() {
        return usebybackend;
    }

    public void setUsebybackend(String usebybackend) {
        this.usebybackend = usebybackend == null ? null : usebybackend.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }
}