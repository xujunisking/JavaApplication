package com.cme.education.service;

import com.cme.education.bean.Order;
import com.cme.education.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by smlz on 2019/4/17.
 */
@Service
public class OrderServiceImpl {

    @Autowired
    private OrderMapper orderMapper;

    public void insertOrder(Order order){
        orderMapper.insertOrder(order);
    }
}
