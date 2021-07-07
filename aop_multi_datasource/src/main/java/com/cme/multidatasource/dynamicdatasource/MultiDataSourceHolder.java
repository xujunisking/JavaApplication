package com.cme.multidatasource.dynamicdatasource;

import com.cme.multidatasource.enumuration.DataBaseType;
import lombok.extern.slf4j.Slf4j;

/**
 * 多数据源key 缓存类
 * Created by dracula on 2020-11-05
 */
@Slf4j
public class MultiDataSourceHolder {
    private static final ThreadLocal<String> dataSourceHolder = new ThreadLocal<>();

    /**
     * 保存数据源的key
     * @param dsKey
     */
    public static void setDataSourceKey(String dsKey) {
        dataSourceHolder.set(dsKey);
    }

    /**
     * 从threadLocal中取出key
     * @return
     */
    public static String getDataSourceKey() {
        return dataSourceHolder.get();
    }

    /**
     * 清除key
     */
    public static void clearDataSourceKey() {
        dataSourceHolder.remove();
    }
}
