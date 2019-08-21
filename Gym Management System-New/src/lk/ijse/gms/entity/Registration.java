package lk.ijse.gms.entity;


public class Registration {
    private String Rid;
    private String Mid;
    private String Name;
    private String Address;
    private String Birthday;
    private String Age;
    private String PhoneNum;
    private String Payment;


    public Registration() {

    }

    public Registration(String rid, String mid, String name, String address, String birthday, String age, String phoneNum, String payment) {
        Rid = rid;
        Mid = mid;
        Name = name;
        Address = address;
        Birthday = birthday;
        Age = age;
        PhoneNum = phoneNum;
        Payment = payment;
    }

    public String getRid() {
        return Rid;
    }

    public void setRid(String rid) {
        Rid = rid;
    }

    public String getMid() {
        return Mid;
    }

    public void setMid(String mid) {
        Mid = mid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String payment) {
        Payment = payment;
    }

    @Override
    public String toString() {
        return "Registration{" + "Rid='" + Rid + '\'' + ", Mid='" + Mid + '\'' + ", Name='" + Name + '\'' + ", Address='" + Address + '\'' + ", Birthday='" + Birthday + '\'' + ", Age='" + Age + '\'' + ", PhoneNum='" + PhoneNum + '\'' + ", Payment='" + Payment + '\'' + '}';
    }
}









