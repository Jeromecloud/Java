package com.cloud.bean;

/*用户实体类设计*/
public class User {
    private int id;
    private String user;
    private String password;

    public int getId() { return id; }

    public void serId(int id) { this.id = id; }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
