package com.cme.multidatasource.enumuration;

import lombok.Getter;

@Getter
public enum DataBaseType {
    CME_EDUCATION_W_YN(0, "Education","主数据库(Education)"),

    CME_Education_Log_YN(1, "Education_log","日志库(Education_log)"),

    CME_Education_R_YN(2, "Education", "从数据库(Education)");

    private Integer code;

    private String key;

    private String msg;

    DataBaseType(Integer code, String key, String msg) {
        this.code = code;
        this.key = key;
        this.msg = msg;
    }
}
