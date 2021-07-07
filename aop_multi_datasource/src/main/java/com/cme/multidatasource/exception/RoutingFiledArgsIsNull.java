package com.cme.multidatasource.exception;

import lombok.Data;
import com.cme.multidatasource.enumuration.MultiDsErrorEnum;

/**
 * 路由key 为空异常
 * Created by dracula on 2020-11-05
 */
@Data
public class RoutingFiledArgsIsNull extends MultiDsError {
    public RoutingFiledArgsIsNull(MultiDsErrorEnum multiDsErrorEnum) {
        super();
        setErrorCode(multiDsErrorEnum.ROUTINGFIELD_ARGS_ISNULL.getCode());
        setErrorMsg(multiDsErrorEnum.ROUTINGFIELD_ARGS_ISNULL.getMsg());
    }
}
