package com.cme.education.controller;

import com.cme.education.bean.Order;
import com.cme.education.service.OrderServiceImpl;
import com.cme.multidatasource.annotation.Router;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smlz on 2019/4/17.
 */
@RestController
@RequestMapping("/order")

public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @Router
    @RequestMapping("/save")
    public Order insertOrder(Order order) {
        orderService.insertOrder(order);
        System.out.printf("");
        return order;
    }
}
