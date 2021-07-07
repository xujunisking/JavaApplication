package com.cme.education.service.base;

import com.cme.education.bean.base.Person;
import com.cme.education.dao.base.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dracula on 2020-11-05
 */
@Service
public class PersonServiceImpl {
    @Autowired
    private PersonMapper personMapper;

    public Person findPersonInfo(String PersonID){
        return personMapper.findPersonInfo(PersonID);
    }
}
