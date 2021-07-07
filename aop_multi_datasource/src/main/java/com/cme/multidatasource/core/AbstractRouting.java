package com.cme.multidatasource.core;

import com.cme.multidatasource.dynamicdatasource.MultiDataSourceHolder;
import com.cme.multidatasource.enumuration.DataBaseType;
import com.cme.multidatasource.support.DsRoutingSetProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import com.cme.multidatasource.constant.CMEConstant;
import com.cme.multidatasource.enumuration.MultiDsErrorEnum;
import com.cme.multidatasource.exception.LoadRoutingStategyUnMatch;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 路由规则抽象类
 * Created by dracula on 2020-11-05
 */
@Slf4j
@EnableConfigurationProperties(value = {DsRoutingSetProperties.class})
@Data
public abstract class AbstractRouting implements IRouting, InitializingBean {
    @Autowired
    private DsRoutingSetProperties dsRoutingSetProperties;

    /**
     * 工程在启动的时候 检查配置路由参数和 策略是否相匹配
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws LoadRoutingStategyUnMatch {

        switch (getDsRoutingSetProperties().getRoutingStategy()) {
            case CMEConstant.ROUTING_DS_TABLE_STATEGY:
                checkRoutingDsTableStategyConfig();
                break;
//            case CMEConstant.ROUTGING_DS_STATEGY:
//                checkRoutingDsStategyConfig();
//                break;
//            case CMEConstant.ROUTGIN_TABLE_STATEGY:
//                checkRoutingTableStategyConfig();
//                break;
        }
    }

    /**
     * 检查多库 多表配置
     */
    private void checkRoutingDsTableStategyConfig() {
        if(dsRoutingSetProperties.getDataSourceNum()<=1){
            log.error("你的配置项routingStategy:{}是多库多表配置,数据库个数>1," +
                            "每一个库中表的个数必须>1,您的配置:数据库个数:{}",dsRoutingSetProperties.getRoutingStategy(),
                    dsRoutingSetProperties.getDataSourceNum());
            throw new LoadRoutingStategyUnMatch(MultiDsErrorEnum.LOADING_STATEGY_UN_MATCH);
        }
    }

    /**
     * 检查多库一表的路由配置项
     */
//    private void checkRoutingDsStategyConfig() {
//        if(dsRoutingSetProperties.getTableNum()!=1 || dsRoutingSetProperties.getDataSourceNum()<=1){
//            log.error("你的配置项routingStategy:{}是多库一表配置,数据库个数>1," +
//                            "每一个库中表的个数必须=1,您的配置:数据库个数:{},表的个数:{}", dsRoutingSetProperties.getRoutingStategy(),
//                    dsRoutingSetProperties.getDataSourceNum(),dsRoutingSetProperties.getTableNum());
//            throw new LoadRoutingStategyUnMatch(MultiDsErrorEnum.LOADING_STATEGY_UN_MATCH);
//        }
//    }

    /**
     * 检查一库多表的路由配置项
     */
//    private void checkRoutingTableStategyConfig() {
//        if(dsRoutingSetProperties.getTableNum()<=1 || dsRoutingSetProperties.getDataSourceNum()!=1){
//            log.error("你的配置项routingStategy:{}是一库多表配置,数据库个数=1," +
//                            "每一个库中表的个数必须>1,您的配置:数据库个数:{},表的个数:{}", dsRoutingSetProperties.getRoutingStategy(),
//                    dsRoutingSetProperties.getDataSourceNum(), dsRoutingSetProperties.getTableNum());
//            throw new LoadRoutingStategyUnMatch(MultiDsErrorEnum.LOADING_STATEGY_UN_MATCH);
//        }
//    }
}
