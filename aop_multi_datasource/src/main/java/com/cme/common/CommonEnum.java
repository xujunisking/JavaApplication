package com.cme.common;

/**
 * create by dracula on 2020-12-09
 */
public class CommonEnum {
    public interface INumberEnum {
        int getCode();
        String getDescription();
    }

    public interface ICharEnum {
        char getCode();
        String getDescription();
    }

    /// <summary>
    /// 人员类别
    /// </summary>
    public enum UserType implements INumberEnum
    {
        Admin(1, "单位管理员"),
        Student(2, "学员"),
        Expert(3, "专家"),
        Dept(4, "科室");

        UserType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 单位级别
    /// </summary>
    public enum UnitGrade implements INumberEnum
    {
        Department(1, "部级"),
        Province(2, "省级"),
        Prefecture(3, "州(市)级"),
        County(4, "县级"),
        Towns(5, "乡镇级"),
        Village(6, "村级");

        UnitGrade(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 单位级别2
    /// </summary>
    public enum HospitalLevel implements INumberEnum
    {
        Province(125, "省级"),
        Prefecture(124, "州(市)级"),
        County(123, "县级"),
        Towns(800, "乡镇级"),
        Village(801, "村级");

        HospitalLevel(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 单位类别
    /// </summary>
    public enum UnitType implements INumberEnum
    {
        SinglePerson(-1, "个人"),
        Gov(0, "行政"),
        Com(1, "综合"),
        Mid(2, "中医"),
        AcademicGroups(3, "学术团体"),
        EduBase(4, "继教基地"),
        PublicUnit(5, "公共卫生"),
        Creater(6, "立项单位");

        UnitType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 角色级别
    /// </summary>
    public enum RoleGrade implements INumberEnum
    {
        Admin(1, "系统管理员"),
        Gov(2, "行政部门"),
        Unit(3, "医疗机构");

        RoleGrade(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 人员状态
    /// </summary>
    public enum UserState implements INumberEnum
    {
        CallOut(0, "调出待确认"),
        Normal(1, "正常"),
        Canceled(2, "注销"),
        NonJob(3, "非工作岗位"),
        NoCountStandard(4, "不计达标");

        UserState(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 项目类型
    /// </summary>
    public enum ProjectType implements INumberEnum
    {
        Project(1, "继教项目"),
        Action(2, "单位活动"),
        Person(3, "个人活动"),
        BaseProject(4, "基地继教项目"),
        SupplementApp(5, "增补项目");

        ProjectType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 审核类型
    /// </summary>
    public enum AuditType implements ICharEnum
    {
        ProjectApp('1', "申报"),
        ExpertAudit('2', "专家审核"),
        ProjectDelay('3', "延期"),
        ProjectReback('4', "备案"),
        ScoreAudit('5', "学分审核"),
        coreCheck_User('6', "学分验证_人员"),
        ScoreCheck_Score('7', "学分验证_学分");

        AuditType(char character, String description) {
            this.code = character;
            this.description = description;
        }

        private char code;
        private String description;

        @Override
        public char getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 项目状态
    /// </summary>
    public enum ProjectState implements INumberEnum
    {
        Create(-1, "起草"),
        BaseFinish(0, "基本信息完整"),
        Finish(1, "可上报"),
        Submit(2, "已上报"),
        ReturnEdit(3, "申报发回重改"),
        AppNoPass(4, "申报不通过"),
        AppPass(5, "申报通过"),
        Delay(20, "延期申请"),
        Rebacking(24, "备案中"),
        RebackReturn(25, "备案返回修改"),
        RebackUnPass(26, "备案不通过"),
        Reback(30, "已备案");

        ProjectState(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 学分申领核销项目汇报状态
    /// </summary>
    public enum ProjectScoreHoldState implements INumberEnum
    {
        UnDistribute(0, "未分配"),
        UnApp(5, "未申请办班"),
        AppChecking(10, "办班申请审核中"),
        AppReback(15, "办班申请返回修改"),
        AppPass(20, "办班申请审核通过,未授分"),
        AppUnPass(25, "办班申请审核不通过"),
        GiveScore(30, "已授学分,未申请学分核销"),
        VerificationChecking(40, "学分核销审核中"),
        VerificationReback(45, "学分核销返回修改"),
        VerificationPass(50, "学分核销审核通过,未上报项目执行情况"),
        VerificationUnPass(55, "学分核销审核不通过"),
        Reporting(56, "项目执行情况汇报审核中"),
        ReportReback(57, "项目执行情况汇报返回修改"),
        ReportUnPass(58, "项目执行情况汇报不通过"),
        Reported(60, "项目执行情况汇报通过");

        ProjectScoreHoldState(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    ///延期申请结果
    /// </summary>
    public enum ProjectDelayState implements INumberEnum
    {
        NoDelay(1, "未延期"),
        Submit(2, "申请中"),
        AppPass(3, "延期申请通过"),
        AppNoPass(4, "延期申请不通过");

        ProjectDelayState(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 跳转页面类型
    /// </summary>
    public enum RediectPageType implements INumberEnum
    {
        GenericError(0, "一般错误"),
        NoAccess(1, "无权限");

        RediectPageType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// JavaScript提示框类型
    /// </summary>
    public enum ScriptAlertType implements INumberEnum
    {
        Normal(0, "一般提示"),
        Error(1, "错误提示"),
        Success(2, "成功提示"),
        Warn(3, "警告提示"),
        NoAccess(4, "无权限提示");

        ScriptAlertType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 系统类别
    /// </summary>
    public enum SystemType implements INumberEnum
    {
        Admin(1, "管理系统"),
        KJ(2, "继教系统"),
        CME(3, "申报系统"),
        ScoreCheck(4, "学分验证系统"),
        Student(5, "学员中心"),
        STA(6, "科技成果奖申报");

        SystemType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 系统模块
    /// </summary>
    public enum SystemModel implements INumberEnum
    {
        Base_SystemMaanage(101, "公共_系统管理"),
        Kj_Gov(201, "科教_行政版"),
        Kj_Unit(202, "科教_单位版"),
        kj_Department(203, "科教_科室版"),
        kj_User(204, "科教_个人版"),
        Cme_Gov(301, "申报_行政版"),
        Cme_Create(302, "申报_立项版"),
        Cme_Expert(303, "申报_专家版");

        SystemModel(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 系统功能
    /// </summary>
    public enum SystemFunction implements INumberEnum
    {
        Admin_InfoManage(101, "管理系统_信息发布管理"),
        Admin_ProjectManage(102, "管理系统_项目活动管理_继教项目管理"),
        Admin_ProjectManage_Action(103, "管理系统_项目活动管理_集体活动管理"),
        Admin_ScoreManage_Project(104, "管理系统_学分管理_按项目修改学分"),
        Admin_ScoreManage_User(105, "管理系统_学分管理_按人员修改学分"),
        Admin_UnitManage(106, "管理系统_单位管理"),
        Admin_SystemSet_Formula(107, "管理系统_系统设置_达标公式"),
        Admin_SystemSet_HospitalFormula(108, "管理系统_系统设置_单位自定义达标标准"),
        Admin_SystemSet_Role(109, "管理系统_系统设置_角色管理"),
        Admin_SystemSet_InfoManage(110, "管理系统_系统设置_信息分类管理"),
        Admin_SystemSet_Standard(111, "管理系统_系统设置_学分验证标准"),
        Admin_SystemSet_Parameter(112, "管理系统_系统设置_参数管理"),
        Admin_SystemLog(113, "管理系统_系统设置_日志查看"),
        Admin_DataCount(114, "管理系统_数据统计"),
        KJ_Goverment_Audit_commentsList(201, "科教_行政_评审意见"),
        KJ_Goverment_Audit_byPersonnel(202, "科教_行政_人员方式"),
        KJ_Goverment_Audit_byProject(203, "科教_行政_继教项目"),
        KJ_Goverment_Audit_byGroupProject(204, "科教_行政_集体活动"),
        KJ_Goverment_Audit_byPersonnelProject(205, "科教_行政_个人活动"),
        KJ_Goverment_ScoreReport_scoreReportVerifySummary(206, "科教_行政_学分上报验证汇总"),
        KJ_Goverment_ScoreReport(207, "科教_行政_学分上报/补报"),
        KJ_Goverment_ScoreReport_scoreReportSet(208, "科教_行政_上报时间设置"),
        KJ_Goverment_StatReport_personSearch(209, "科教_行政_单位人员查询"),
        KJ_Goverment_StatReport_personScoreSearch(210, "科教_行政_个人学分查询"),
        KJ_Goverment_StatReport_personScoreEligibilitySearch(211, "科教_行政_个人达标查询"),
        KJ_Goverment_StatReport_personScoreEligibilityStat(212, "科教_行政_个人达标统计"),
        KJ_Goverment_StatReport_unitToStandardStat(213, "科教_行政_单位达标统计"),
        KJ_Goverment_StatReport_List1(214, "科教_行政_多年度达标查询"),
        KJ_Goverment_StatReport_unitFinishStatistics(215, "科教_行政_单位职称学分完成人数统计"),
        KJ_Goverment_StatReport_titleEducationCount(216, "科教_行政_职称学历统计"),
        KJ_Goverment_StatReport_projectStatisticsList(217, "科教_行政_项目参加人员职称统计"),
        KJ_Goverment_StatReport_projectDetailSearch(218, "科教_行政_项目明细查询"),
        KJ_Goverment_StatReport_projectSortStatistics(219, "科教_行政_项目分类统计"),
        KJ_Goverment_StatReport_verifySummary(220, "科教_行政_学分验证汇总表"),
        KJ_Goverment_StatReport_Statistics(221, "科教_行政_上报统计"),
        KJ_Goverment_Assign_List1(222, "科教_行政_信息发布"),
        KJ_Goverment_Assign_List2(223, "科教_行政_通知公告"),
        KJ_Unit_CompanyManage_DepartmentManage(224, "科教_单位_科室管理"),
        KJ_Unit_CompanyManage_DepartmentPersonManage(226, "科教_单位_科室人员管理"),
        KJ_Unit_ProjectManage_Project(227, "科教_单位_继教项目管理"),
        KJ_Unit_ProjectManage_Action(228, "科教_单位_集体活动管理"),
        KJ_Unit_ScoreManage_ScoreManage(229, "科教_单位_个人学分管理"),
        KJ_Unit_ScoreManage_Input02(230, "科教_单位_向导录入个人学分"),
        KJ_Unit_ScoreManage_Input01(231, "科教_单位_非向导录入个人学分"),
        KJ_Unit_ScoreManage_Project(232, "科教_单位_集体活动/继教项目参加者授分"),
        KJ_Unit_ScoreManage_Audit_List(233, "科教_单位_学分审核情况查询"),
        KJ_Unit_ScoreManage_Audit_Audit(234, "科教_单位_审核科室录入学分"),
        KJ_Unit_SocreAssign(239, "科教_单位_学分验证信息上报"),
        KJ_Unit_Report(240, "科教_单位_统计查询"),
        KJ_Unit_Department_ScoreManage_UserSearch(235, "科教_科室_人员查询"),
        KJ_Unit_Department_Input02(236, "科教_科室_向导录入个人学分"),
        KJ_Unit_Department_scoreManage(237, "科教_科室_个人学分管理"),
        KJ_Unit_Department_Input01(238, "科教_科室_非向导录入个人学分"),
        KJ_Unit_Department_DepartmentReport(225, "科教_科室_统计查询"),
        KJ_User_All(241, "科教_个人_所有权限"),
        CME_Create_App(301, "申报_立项版_项目申报"),
        CME_Create_Search(302, "申报_立项版_申报项目查询"),
        CME_Create_Delay(303, "申报_立项版_延期申请"),
        CME_Create_Reback(304, "申报_立项版_项目备案"),
        CME_Create_Report(305, "申报_立项版_项目汇报"),
        CME_Expert_Audit(306, "申报_专家版_项目审核"),
        CME_Expert_List(307, "申报_专家版_审核项目查询"),
        CME_Goverment_UserManage(308, "申报_行政版_人员管理"),
        CME_Goverment_CmeYear(309, "申报_行政版_申报时间设置"),
        CME_Goverment_Assign(310, "申报_行政版_项目分配"),
        CME_Goverment_Audit(311, "申报_行政版_项目审核"),
        CME_Goverment_Delay(312, "申报_行政版_延期举办项目审核"),
        CME_Goverment_Reaback(313, "申报_行政版_项目备案"),
        CME_Goverment_Report(314, "申报_行政版_项目汇报"),
        CME_Goverment_Search(315, "申报_行政版_项目查询"),
        CME_Goverment_Statistics(316, "申报_行政版_项目统计"),
        CME_SinglePerson_Create(318, "申报_行政版_个人项目录入"),
        CME_SinglePerson_Query(319, "申报_行政版_个人项目查询");

        SystemFunction(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 系统级别
    /// </summary>
    public enum SystemLevel implements INumberEnum
    {
        education(-1, "继续教育系统"),
        admin(0, "管理系统"),
        ProvinceApply(1, "省级"),
        PrefectureApply(2, "州(市)级"),
        ProvinceActive(3, "省直团体活动"),
        PrefectureActive(4, "州(市)团体活动");

        SystemLevel(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 项目预审状态
    /// </summary>
    public enum PreCheckState implements INumberEnum
    {
        UnChecked(1, "未审核"),
        Pass(2, "通过"),
        NoPass(3, "不通过"),
        returnEdit(4, "返回修改");

        PreCheckState(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 系统角色
    /// </summary>
    public enum SystemRole implements INumberEnum
    {
        Admin(0, "超级管理角色"),
        ProvinceAppAdminX(1, "省级申报行政用户(西医)"),
        ProvinceAppEstablish(2, "省级申报立项用户"),
        ProvinceAppAdminZ(3, "省级申报行政用户(中医)"),
        ProvinceBaseAppEstablish(4, "省级基地申报立项用户"),
        EvaluateExpert(5, "评审专家"),
        KJAdminZ(6, "科教行政管理员(中医)"),
        KJAdminX(7, "科教行政管理员(西医)"),
        KJUnitAdmin(8, "科教单位管理员"),
        KJDeptAdmin(9, "科教科室管理员"),
        Student(10, "学员"),
        PrefectureAppEstablish(11, "州(市)级申报立项用户"),
        PrefectureAppAdminZ(12, "州(市)级申报行政用户(中医)"),
        PrefectureAppAdminX(13, "州(市)级申报行政用户(西医)"),
        ProvinceAppActiveEstablish(14, "省直学术团体活动(立项用户)"),
        ProvinceAppActiveAdminZ(15, "省直学术团体活动(行政中医)"),
        ProvinceAppActiveAdminX(16, "省直学术团体活动(行政西医)"),
        PrefectureAppActiveEstablish(17, "州(市)学术团体活动(立项用户)"),
        PrefectureAppActiveAdminZ(18, "州(市)学术团体活动(行政中医)"),
        PrefectureAppActiveAdminX(19, "州(市)学术团体活动(行政西医)"),
        SystemParamaterManager(20, "系统参数管理"),
        UnitManager(21, "单位管理"),
        ServiceManager(22, "服务管理"),
        ServiceNoticeManager(23, "服务公告管理"),
        NetworkCompany(24, "网络培训公司管理员"),
        ScoreInportQuery(25, "接口数据导入查询管理"),
        FinancialAffairs(26, "财务管理角色"),
        YNManagementSociety(27, "云南省卫生科技教育管理协会");

        SystemRole(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 中西医
    /// </summary>
    public enum MedicalType implements INumberEnum
    {
        SinglePerson(-1, "个人或所有（包含中西医）"),
        ChineseMedical(1, "中医"),
        WesternMedical(2, "西医");

        MedicalType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 支付类型
    /// </summary>
    public enum PayType implements INumberEnum
    {
        Alipay(1, "支付宝"),
        BankOnLine(2, "网银在线"),
        Remittance(3, "汇款支付"),
        Cash(4, "现金支付"),
        WXPay(5, "微信支付");

        PayType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// API状态
    /// </summary>
    public enum ApiState implements INumberEnum
    {
        Success(1, "成功"),
        Faild(2, "失败"),
        Error(3, "错误");

        ApiState(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 系统公告推送到的系统
    /// </summary>
    public enum NoticeToSystem implements INumberEnum
    {
        AllSystem(0, "所有系统"),
        ScoreManagerAdmin(1, "学分管理系统(行政版)"),
        ScoreManagerUnit(2, "学分管理系统(单位版)"),
        ScoreManagerDept(3, "学分管理系统(科室版)"),
        ProjectApplyAdmin(4, "项目申报系统(行政版)"),
        ProjectApplyUnit(5, "项目申报系统(单位版)"),
        ProjectApplyCreator(6, "项目申报系统(立项版)"),
        StudentCenter(7, "学员中心"),
        ExpertEvaluate(8, "专家项目评审"),
        ProjectApplyBase(9, "项目申报系统(基地立项版)");

        NoticeToSystem(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 系统通知类型
    /// </summary>
    public enum AdviceType implements INumberEnum
    {
        SystemCallBoard(1, "系统公告"),
        UnitNotice(2, "单位通知");

        AdviceType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 项目类别
    /// </summary>
    public enum ProjectClass implements INumberEnum
    {
        ProjectAttended(1, "继教项目"),
        ProjectLongRange(2, "继教项目(远程)");

        ProjectClass(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 缴费方式
    /// </summary>
    public enum PayWay implements INumberEnum
    {
        UnitPay(1, "单位缴费"),
        PersonPay(2, "个人缴费");

        PayWay(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 控制模块类型
    /// </summary>
    public enum ModuleType implements INumberEnum
    {
        Other(0, "其他模块"),
        AppScore(1, "App模块");

        ModuleType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 提示类型
    /// </summary>
    public enum TipType implements INumberEnum
    {
        SystemTip(1, "系统信息提示"),
        PayTip(2, "系统缴费提示");

        TipType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
    /// <summary>
    /// 欠费限制模块
    /// </summary>
    public enum PayLimitModuleType implements INumberEnum
    {
        AppModule(1, "手机App模块"),
        /// <summary>
        /// 学分上报模块（包含验证上报、补验上报、特殊上报）
        /// </summary>
        ScoreReportModule(2,  "学分上报模块");

        PayLimitModuleType(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
}
