package com.cme.education.dao.base;

import com.cme.education.bean.base.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by dracula on 2020-11-05
 */
@Mapper
public interface PersonMapper {
    Person findPersonInfo(@Param(value="PersonID")String PersonID);
}
