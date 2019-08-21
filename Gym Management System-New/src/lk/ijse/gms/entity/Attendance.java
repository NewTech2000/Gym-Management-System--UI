package lk.ijse.gms.entity;

public class Attendance {
    private String aid;
    private String rid;
    private String name;
    private String date;
    private String arrivalTime;
    private String depatureTime;

    public Attendance() {
    }

    public Attendance(String aid, String rid, String name, String date, String arrivalTime, String depatureTime) {
        this.aid = aid;
        this.rid = rid;
        this.name = name;
        this.date = date;
        this.arrivalTime = arrivalTime;
        this.depatureTime = depatureTime;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "aid='" + aid + '\'' +
                ", rid='" + rid + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", depatureTime='" + depatureTime + '\'' +
                '}';
    }
}

