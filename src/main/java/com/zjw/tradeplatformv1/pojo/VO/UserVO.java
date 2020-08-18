package com.zjw.tradeplatformv1.pojo.VO;

public class UserVO {
    private String userImage;
    private String userName;
    private Integer balance;
    private String place;

    public UserVO(String userImage, String userName, Integer balance, String place) {
        this.userImage = userImage;
        this.userName = userName;
        this.balance = balance;
        this.place = place;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
