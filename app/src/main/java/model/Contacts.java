package model;

public class Contacts {

    private String name;
    private String phoneNo;
    private String email;
    private String location;
    private int imageId;


    public Contacts(String name, String phoneNo, String email, String location, int imageId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.location = location;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImageId() { return imageId; }

    public void setImageId(int imageId) { this.imageId = imageId; }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

