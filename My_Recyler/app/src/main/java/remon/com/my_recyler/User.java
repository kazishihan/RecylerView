package remon.com.my_recyler;

public class User {
    private String name;
    private String gender;
    private String phoneNumber;
    private int userPhoto;


    public User(String name, String gender, String phoneNumber, int userPhoto) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.userPhoto = userPhoto;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getUserPhoto() {
        return userPhoto;
    }
}
