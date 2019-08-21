package lk.ijse.gms.dto;

import java.security.PrivateKey;

public class AttendanceDTO {
    private String rid;
    private String mid;
    private String name;
    private String address;
    private String birthday;
    private String contact;

    public AttendanceDTO() {
    }

    public AttendanceDTO(String rid, String mid, String name, String address, String birthday, String contact) {
        this.rid = rid;
        this.mid = mid;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.contact = contact;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "AttendanceDTO{" +
                "rid='" + rid + '\'' +
                ", mid='" + mid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

