package com.cme.education.service.base;

import com.cme.education.bean.base.ParameterType;
import com.cme.education.dao.base.ParameterTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParameterTypeServiceImpl {
    @Autowired
    private ParameterTypeMapper parameterTypeMapper;

    public List<ParameterType> getParameterTypeInfo() {
        return parameterTypeMapper.getParameterTypeInfo();
    }

    public ParameterType findParameterType(int ParameterTypeID) {
        return parameterTypeMapper.findParameterType(ParameterTypeID);
    }

    public List<ParameterType> getTypeInfoByPage() {
        return parameterTypeMapper.getTypeInfoByPage();
    }
}
