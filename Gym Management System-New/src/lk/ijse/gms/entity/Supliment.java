package lk.ijse.gms.entity;

public class Supliment {
    private String supid;
    private String rid;
    private String brand;
    private String qiy;

    public Supliment() {
    }

    public Supliment(String supid, String rid, String brand, String qiy) {
        this.supid = supid;
        this.rid = rid;
        this.brand = brand;
        this.qiy = qiy;
    }

    public String getSupid() {
        return supid;
    }

    public void setSupid(String supid) {
        this.supid = supid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQiy() {
        return qiy;
    }

    public void setQiy(String qiy) {
        this.qiy = qiy;
    }

    @Override
    public String toString() {
        return "Supliment{" +
                "supid='" + supid + '\'' +
                ", rid='" + rid + '\'' +
                ", brand='" + brand + '\'' +
                ", qiy='" + qiy + '\'' +
                '}';
    }
}
