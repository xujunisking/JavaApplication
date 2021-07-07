package com.cme.education.dao;

import com.cme.education.bean.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by smlz on 2019/4/17.
 */
public interface OrderMapper {
    void insertOrder(Order order);
}
