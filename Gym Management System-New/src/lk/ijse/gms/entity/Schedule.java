package lk.ijse.gms.entity;

public class Schedule {
    private String scid;
    private String bmid;
    private String arms;
    private String chest;
    private String waist;
    private String thigh;
    private String calf;

    public Schedule() {
    }

    public Schedule(String scid, String bmid, String arms, String chest, String waist, String thigh, String calf) {
        this.scid = scid;
        this.bmid = bmid;
        this.arms = arms;
        this.chest = chest;
        this.waist = waist;
        this.thigh = thigh;
        this.calf = calf;
    }

    public String getScid() {
        return scid;
    }

    public void setScid(String scid) {
        this.scid = scid;
    }

    public String getBmid() {
        return bmid;
    }

    public void setBmid(String bmid) {
        this.bmid = bmid;
    }

    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getThigh() {
        return thigh;
    }

    public void setThigh(String thigh) {
        this.thigh = thigh;
    }

    public String getCalf() {
        return calf;
    }

    public void setCalf(String calf) {
        this.calf = calf;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scid='" + scid + '\'' +
                ", bmid='" + bmid + '\'' +
                ", arms='" + arms + '\'' +
                ", chest='" + chest + '\'' +
                ", waist='" + waist + '\'' +
                ", thigh='" + thigh + '\'' +
                ", calf='" + calf + '\'' +
                '}';
    }
}


