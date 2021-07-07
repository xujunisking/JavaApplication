package com.cme.education.controller.base;

import com.cme.education.bean.base.Person;
import com.cme.education.service.base.PersonServiceImpl;
import com.cme.multidatasource.annotation.Router;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by dracula on 2020-11-05
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @Router
    @RequestMapping("/findByID")
    public Person findPersonInfo(String PersonID) {
        return personService.findPersonInfo(PersonID);
    }
}
