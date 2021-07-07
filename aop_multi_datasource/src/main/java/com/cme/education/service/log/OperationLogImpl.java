package com.cme.education.service.log;

import com.cme.education.bean.log.OperationLog;
import com.cme.education.dao.log.OperationLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dracula on 2020-11-23
 */
@Service
public class OperationLogImpl {
    @Autowired
    private OperationLogMapper operationLogMapper;

    public OperationLog findOperationLogInfo(String Id) { return operationLogMapper.findOperationLogInfo(Id); }

    public void insertOperationLog(OperationLog operLog){
        operationLogMapper.insertOperationLog(operLog);
    }
}
