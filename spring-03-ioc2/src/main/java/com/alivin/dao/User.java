package com.alivin.dao;

public class User {

    // 无参构造
    /*public User() {
        System.out.println("无参构造方法");
    }*/

    // 有参构造
    public User(String name) {
        this.name = name;
        System.out.println("有参构造方法");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
