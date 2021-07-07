package com.cme.multidatasource.exception;

import com.cme.multidatasource.enumuration.MultiDsErrorEnum;

/**
 * 格式化表后缀名称异常
 * Created by dracula on 2020-11-05
 */

public class FormatTableSuffixException extends MultiDsError {
    public FormatTableSuffixException(MultiDsErrorEnum formatTableSuffixError) {
        super();
        setErrorCode(formatTableSuffixError.FORMAT_TABLE_SUFFIX_ERROR.getCode());
        setErrorMsg(formatTableSuffixError.FORMAT_TABLE_SUFFIX_ERROR.getMsg());
    }
}
