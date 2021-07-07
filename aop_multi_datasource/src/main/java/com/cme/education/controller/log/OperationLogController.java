package com.cme.education.controller.log;

import com.cme.education.bean.log.OperationLog;
import com.cme.education.service.log.OperationLogImpl;
import com.cme.multidatasource.annotation.Router;
import com.cme.multidatasource.constant.CMEConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dracula on 2020-11-23
 */
@RestController
@RequestMapping("/log")
public class OperationLogController {

    @Autowired
    private OperationLogImpl operationLogService;

    @Router(routingFiled = CMEConstant.CME_Education_Log_YN)
    @RequestMapping("/findOperLogByID")
    public OperationLog findOperationLogInfo(String Id) {
        return operationLogService.findOperationLogInfo(Id);
    }

    @Router(routingFiled = CMEConstant.CME_Education_Log_YN)
    @RequestMapping("/save")
    public OperationLog insertOperationLog(OperationLog operLog) {
        operationLogService.insertOperationLog(operLog);
        return operLog;
    }
}
