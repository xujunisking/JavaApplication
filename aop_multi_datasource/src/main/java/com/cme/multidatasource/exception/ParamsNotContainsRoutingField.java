package com.cme.multidatasource.exception;

import com.cme.multidatasource.enumuration.MultiDsErrorEnum;

/**
 * 入参中没有包含路由字段异常
 * Create by dracula on 2020-11-05
 */
public class ParamsNotContainsRoutingField extends MultiDsError {
    public ParamsNotContainsRoutingField(MultiDsErrorEnum paramsNotContainsRouting) {
        super();
        setErrorCode(paramsNotContainsRouting.PARAMS_NOT_CONTAINS_ROUTINGFIELD.getCode());
        setErrorMsg(paramsNotContainsRouting.PARAMS_NOT_CONTAINS_ROUTINGFIELD.getMsg());
    }
}
