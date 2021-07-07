package com.cme.education.bean.log;

import lombok.Data;
import java.util.Date;
import java.io.Serializable;

@Data
public class OperationLog implements Serializable {
    /// <summary>
    /// 主键Id
    /// </summary>
    private String Id;
    /// <summary>
    /// 操作人
    /// </summary>
    private String CustomerId;
    /// <summary>
    /// 操作关键字，方便日志搜索
    /// </summary>
    private String LogKey;
    /// <summary>
    /// 日志内容
    /// </summary>
    private String Comment;
    /// <summary>
    /// 请求地址
    /// </summary>
    private String PageUrl;
    /// <summary>
    /// 用户浏览器信息
    /// </summary>
    public String Borower;
    /// <summary>
    /// 用户IP
    /// </summary>
    public String IpAddress;
    /// <summary>
    /// 添加时间
    /// </summary>
    public Date AddTime;
}
