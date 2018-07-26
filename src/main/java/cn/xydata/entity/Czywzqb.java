package cn.xydata.entity;

public class Czywzqb {
    private String bqh;

    private String bqmc;

    private String cw;

    private String zyh;

    public String getBqh() {
        return bqh;
    }

    public void setBqh(String bqh) {
        this.bqh = bqh == null ? null : bqh.trim();
    }

    public String getBqmc() {
        return bqmc;
    }

    public void setBqmc(String bqmc) {
        this.bqmc = bqmc == null ? null : bqmc.trim();
    }

    public String getCw() {
        return cw;
    }

    public void setCw(String cw) {
        this.cw = cw == null ? null : cw.trim();
    }

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh == null ? null : zyh.trim();
    }
}