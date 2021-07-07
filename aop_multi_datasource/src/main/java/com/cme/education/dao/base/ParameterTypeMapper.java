package com.cme.education.dao.base;

import com.cme.education.bean.base.ParameterType;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by dracula on 2020-11-24
 */
@Mapper
@CacheNamespace
public interface ParameterTypeMapper {
    List<ParameterType> getParameterTypeInfo();

    ParameterType findParameterType(int ParameterTypeID);

    List<ParameterType> getTypeInfoByPage();
}
