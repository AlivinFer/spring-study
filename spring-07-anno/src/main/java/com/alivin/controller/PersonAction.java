package com.alivin.controller;

import com.alivin.service.PersonService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("personAction")
public class PersonAction {

    @Resource(name = "personService")
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void show() {
        personService.show();
        System.out.println("controller 层的方法");
    }
}
