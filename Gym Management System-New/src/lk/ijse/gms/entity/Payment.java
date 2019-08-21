package lk.ijse.gms.entity;

public class Payment {
    private String pid;
    private String rid;
    private String name;
    private String total;
    private String date;

    public Payment() {
    }

    public Payment(String pid, String rid, String name, String total, String date) {
        this.pid = pid;
        this.rid = rid;
        this.name = name;
        this.total = total;
        this.date = date;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "pid='" + pid + '\'' +
                ", rid='" + rid + '\'' +
                ", name='" + name + '\'' +
                ", total='" + total + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
