package com.cme.common;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private int code;  //编码
    private String message; //提醒信息
    private T data; //结果对象

    public Result(int code) {
        this(code, null);
    }

    public Result(int code, String message) {
        this(code, message, null);
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result ok() {
        return ok(null);
    }

    public static Result ok(String message) {
        return ok(message, null);
    }

    public static <T> Result ok(T data) {
        return ok("", data);
    }

    public static <T> Result ok(String message, T data) {
        return new Result(CommonEnum.ApiState.Success.getCode(), message, data);
    }

    public static Result error() {
        return error(CommonEnum.ApiState.Error.getCode());
    }

    public static Result error(int code) {
        return error(code, null);
    }

    public static Result error(String message) {
        return error(CommonEnum.ApiState.Error.getCode(), message);
    }

    public static Result error(int code, String message) {
        return error(code, message, null);
    }

    public static <T> Result error(int code, String message, T data) {
        return new Result(code, message, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
