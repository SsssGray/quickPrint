package cn.xydata.entity;

public class TBaseSndata {
    private String snname;

    private Long current;

    public String getSnname() {
        return snname;
    }

    public void setSnname(String snname) {
        this.snname = snname == null ? null : snname.trim();
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }
}