package com.alivin.dao;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao{
    @Override
    public void show() {
        System.out.println("Dao 层的方法");
    }
}
