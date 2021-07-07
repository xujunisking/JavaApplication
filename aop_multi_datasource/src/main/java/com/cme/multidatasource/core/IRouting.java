package com.cme.multidatasource.core;

import com.cme.multidatasource.exception.FormatTableSuffixException;
import com.cme.multidatasource.exception.LoadRoutingStategyUnMatch;
import com.cme.multidatasource.exception.RoutingFiledArgsIsNull;

/**
 * 路由接口
 * Create by dracula on 2020-11-05
 */
public interface IRouting {
    /**
     * 根据规则计算出
     * @param routingFiled
     * @return
     */
    void setDataSourceKey(String routingFiled) throws LoadRoutingStategyUnMatch,RoutingFiledArgsIsNull;

    /**
     * 根据规则计算出数据库
     * @param routingFiled
     * @return
     */
    String getDataSourceByKey(String routingFiled) throws LoadRoutingStategyUnMatch, RoutingFiledArgsIsNull;
}
