package com.leonard.model;

import java.util.Date;

public class User {
    private int id;
    private int userId;
    private String username;
    private String sex;
    private int age;
    private Date birthday;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public User() {
    }

    public User(int userId, String username, String sex, int age, Date birthday, String email, String phone) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
