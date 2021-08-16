package com.alivin.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add 方法");
    }

    @Override
    public void delete() {
        System.out.println("delete 方法");
    }

    @Override
    public void update() {
        System.out.println("update 方法");
    }

    @Override
    public void select() {
        System.out.println("select 方法");
    }
}
