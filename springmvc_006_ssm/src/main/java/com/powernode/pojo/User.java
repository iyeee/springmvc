package com.powernode.pojo;

public class User {
    private String userId;
    private String carType;
    private String cardNo;
    private String userName;
    private String userSex;
    private String userAge;
    private String userRole;

    public User(String userId, String carType, String cardNo, String userName, String userSex, String userAge, String userRole) {
        this.userId = userId;
        this.carType = carType;
        this.cardNo = cardNo;
        this.userName = userName;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userRole = userRole;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", carType='" + carType + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
