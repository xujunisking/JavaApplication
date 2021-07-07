package com.cme.multidatasource.exception;

import lombok.Data;

/**
 * 所有异常的父类
 * Created by dracula on 2020-11-05
 */
@Data
public class MultiDsError extends RuntimeException{
    private Integer errorCode;

    private String errorMsg;
}
