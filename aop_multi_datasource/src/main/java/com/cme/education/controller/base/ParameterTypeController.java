package com.cme.education.controller.base;

import com.cme.common.CommonEnum;
import com.cme.education.bean.base.ParameterType;
import com.cme.education.service.base.ParameterTypeServiceImpl;
import com.cme.multidatasource.annotation.Router;
import com.github.pagehelper.PageHelper;
import com.cme.common.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dracula on 2020-11-24
 */
@RestController
@RequestMapping("/parameterType")
public class ParameterTypeController {
    @Autowired
    private ParameterTypeServiceImpl parameterTypeServiceImpl;

    @Router
    @RequestMapping("/getParameterType")
    public List<ParameterType> getParameterTypeInfo() {
        return parameterTypeServiceImpl.getParameterTypeInfo();
    }

    @Router
    @RequestMapping("/findByTypeID")
    public ParameterType findParameterType(int ParameterTypeID) {
        return parameterTypeServiceImpl.findParameterType(ParameterTypeID);
    }

    @RequestMapping("/getTypeInfoByPage")
    public Result getTypeInfoByPage(int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<ParameterType> parameterList = parameterTypeServiceImpl.getTypeInfoByPage();
        //PageInfo<ParameterType> page = new PageInfo<>(parameterList);
        return new Result(CommonEnum.ApiState.Success.hashCode(), "获取数据成功！", parameterList);
        //return parameterList;
    }
}
