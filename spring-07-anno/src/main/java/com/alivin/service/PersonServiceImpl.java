package com.alivin.service;

import com.alivin.dao.PersonDao;
import com.alivin.dao.PersonDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("personService")
public class PersonServiceImpl implements PersonService{

    @Resource(name="personDao")
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    @Override
    public void show() {
        personDao.show();
        System.out.println("Service 层方法");
    }
}
