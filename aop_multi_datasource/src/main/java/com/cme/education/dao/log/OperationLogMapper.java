package com.cme.education.dao.log;

import com.cme.education.bean.log.OperationLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by dracula on 2020-11-23
 */
@Mapper
public interface OperationLogMapper {
    OperationLog findOperationLogInfo(@Param(value="Id")String Id);

    void insertOperationLog(OperationLog OperLog);
}
