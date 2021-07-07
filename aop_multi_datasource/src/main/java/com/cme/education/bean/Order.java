package com.cme.education.bean;

import lombok.Data;

/**
 * Created by smlz on 2019/4/17.
 */
@Data
public class Order {

    private Long orderId;

    private String userId;

    private double money;
}
