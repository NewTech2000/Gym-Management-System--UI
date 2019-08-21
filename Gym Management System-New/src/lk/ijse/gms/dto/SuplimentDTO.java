package lk.ijse.gms.dto;

public class SuplimentDTO {
    private String supid;
    private String rid;
    private String brand;
    private String qly;

    public SuplimentDTO(String supid, String rid, String brand) {
        this.supid = supid;
        this.rid = rid;
        this.brand = brand;
        this.qly = qly;
    }


    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getSupid() {
        return supid;
    }

    public void setSupid(String mid) {
        this.supid = supid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQly() {
        return qly;
    }

    public String setqly() { return qly; }
}
