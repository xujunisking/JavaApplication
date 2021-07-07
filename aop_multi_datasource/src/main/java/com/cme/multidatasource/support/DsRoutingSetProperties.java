package com.cme.multidatasource.support;

import lombok.Data;
import com.cme.multidatasource.constant.CMEConstant;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.Map;

/**
 * 该类用于配置分库的个数  以及分表的个数,以及配置路由key
 * Created by dracula on 2020-11-05
 */
@ConfigurationProperties(prefix = "education.dsroutingset")
@Data
public class DsRoutingSetProperties {
    /**
     * 默认是一个数据库 默认一个
     */
    private Integer dataSourceNum = 1;

    /**
     * 路由字段 必须在配置文件中配置(不配置会抛出异常)
     */
    private String routingFiled;

    /**
     * 所有生产写库数据有的名称
     * dataSourceKeysMapping 结构:
     *         setMappings.put(0,"dataSource00");
     *         setMappings.put(1,"dataSource01");
     */
    private Map<Integer,String> dataSourceKeysMapping;

    /**
     * 默认的路由策略
     */
    private String routingStategy = CMEConstant.ROUTING_DS_TABLE_STATEGY;

}
