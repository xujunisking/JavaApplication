package com.cme.multidatasource.exception;

import lombok.Data;
import com.cme.multidatasource.enumuration.MultiDsErrorEnum;

/**
 * 加载路由策略和配置配置文件不匹配
 * Created by dracula on 2020-11-05
 */
@Data
public class LoadRoutingStategyUnMatch extends MultiDsError {
    public LoadRoutingStategyUnMatch(MultiDsErrorEnum multiDsErrorEnum) {
        super();
        setErrorCode(multiDsErrorEnum.LOADING_STATEGY_UN_MATCH.getCode());
        setErrorMsg(multiDsErrorEnum.LOADING_STATEGY_UN_MATCH.getMsg());
    }
}
