package com.test.pojo;

public class User {
    public User()
    {
        super();
    }

    public User(String telephoneNumber, String userName)
    {
        super();
        this.telephoneNumber = telephoneNumber;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private Integer userId;
    private String telephoneNumber;
    private String userName;

}
