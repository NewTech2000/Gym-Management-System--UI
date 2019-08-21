package lk.ijse.gms.entity;

public class Bodymeasurement {
    private String rid;
    private String scheid;
    private String name;
    private String weight;
    private String height;

    public Bodymeasurement() {
    }

    public Bodymeasurement(String rid, String scheid, String name, String weight, String height) {
        this.rid = rid;
        this.scheid = scheid;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getScheid() {
        return scheid;
    }

    public void setScheid(String scheid) {
        this.scheid = scheid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bodymeasurement{" +
                "rid='" + rid + '\'' +
                ", scheid='" + scheid + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
