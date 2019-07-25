package com.open.boot.yw.ht.student.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "xm_student_report")
public class StudentReport {
    @Id
    private String uuid;

    /**
     * 报告时间
     */
    @Column(name = "report_time")
    private Date reportTime;

    /**
     * 报告者
     */
    @Column(name = "report_user")
    private String reportUser;

    /**
     * 标题
     */
    @Column(name = "report_title")
    private String reportTitle;

    /**
     * 学员姓名
     */
    @Column(name = "student_name")
    private String studentName;

    /**
     * 产品名号
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 上课教室
     */
    @Column(name = "class_room")
    private String classRoom;

    /**
     * 上课频次
     */
    @Column(name = "class_sequnce")
    private Integer classSequnce;

    /**
     * 任课老师
     */
    private String teacher;

    /**
     * 班主任
     */
    private String assist;

    /**
     * 课程内容
     */
    @Column(name = "cource_content")
    private String courceContent;

    /**
     * 素养-时间管理
     */
    @Column(name = "suyang_sjgl")
    private Integer suyangSjgl;

    /**
     * 素养-上课态度
     */
    @Column(name = "suyang_sktd")
    private Integer suyangSktd;

    /**
     * 素养-语言表达
     */
    @Column(name = "suyang_yybd")
    private Integer suyangYybd;

    /**
     * 素养-基本礼仪
     */
    @Column(name = "suyang_jbly")
    private Integer suyangJbly;

    /**
     * 专业-解题速度
     */
    @Column(name = "zhuanye_jtsd")
    private Integer zhuanyeJtsd;

    /**
     * 专业-解题思路
     */
    @Column(name = "zhuanye_jtsl")
    private Integer zhuanyeJtsl;

    /**
     * 专业-资源利用
     */
    @Column(name = "zhuanye_zyly")
    private Integer zhuanyeZyly;

    /**
     * 专业-求助频次
     */
    @Column(name = "zhuanye_qzpc")
    private Integer zhuanyeQzpc;

    /**
     * 学习-提问频次
     */
    @Column(name = "xuexi_twpc")
    private Integer xuexiTwpc;

    /**
     * 学习-专注力
     */
    @Column(name = "xuexi_zzl")
    private Integer xuexiZzl;

    /**
     * 学习-知识消化
     */
    @Column(name = "xuexi_zsxh")
    private Integer xuexiZsxh;

    /**
     * 学习-作业完成度
     */
    @Column(name = "xuexi_zywcd")
    private Integer xuexiZywcd;

    /**
     * 老师评价
     */
    @Column(name = "teacher_comm")
    private String teacherComm;

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取报告时间
     *
     * @return report_time - 报告时间
     */
    public Date getReportTime() {
        return reportTime;
    }

    /**
     * 设置报告时间
     *
     * @param reportTime 报告时间
     */
    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * 获取报告者
     *
     * @return report_user - 报告者
     */
    public String getReportUser() {
        return reportUser;
    }

    /**
     * 设置报告者
     *
     * @param reportUser 报告者
     */
    public void setReportUser(String reportUser) {
        this.reportUser = reportUser;
    }

    /**
     * 获取标题
     *
     * @return report_title - 标题
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * 设置标题
     *
     * @param reportTitle 标题
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * 获取学员姓名
     *
     * @return student_name - 学员姓名
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置学员姓名
     *
     * @param studentName 学员姓名
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 获取产品名号
     *
     * @return product_name - 产品名号
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名号
     *
     * @param productName 产品名号
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取上课教室
     *
     * @return class_room - 上课教室
     */
    public String getClassRoom() {
        return classRoom;
    }

    /**
     * 设置上课教室
     *
     * @param classRoom 上课教室
     */
    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    /**
     * 获取上课频次
     *
     * @return class_sequnce - 上课频次
     */
    public Integer getClassSequnce() {
        return classSequnce;
    }

    /**
     * 设置上课频次
     *
     * @param classSequnce 上课频次
     */
    public void setClassSequnce(Integer classSequnce) {
        this.classSequnce = classSequnce;
    }

    /**
     * 获取任课老师
     *
     * @return teacher - 任课老师
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * 设置任课老师
     *
     * @param teacher 任课老师
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * 获取班主任
     *
     * @return assist - 班主任
     */
    public String getAssist() {
        return assist;
    }

    /**
     * 设置班主任
     *
     * @param assist 班主任
     */
    public void setAssist(String assist) {
        this.assist = assist;
    }

    /**
     * 获取课程内容
     *
     * @return cource_content - 课程内容
     */
    public String getCourceContent() {
        return courceContent;
    }

    /**
     * 设置课程内容
     *
     * @param courceContent 课程内容
     */
    public void setCourceContent(String courceContent) {
        this.courceContent = courceContent;
    }

    /**
     * 获取素养-时间管理
     *
     * @return suyang_sjgl - 素养-时间管理
     */
    public Integer getSuyangSjgl() {
        return suyangSjgl;
    }

    /**
     * 设置素养-时间管理
     *
     * @param suyangSjgl 素养-时间管理
     */
    public void setSuyangSjgl(Integer suyangSjgl) {
        this.suyangSjgl = suyangSjgl;
    }

    /**
     * 获取素养-上课态度
     *
     * @return suyang_sktd - 素养-上课态度
     */
    public Integer getSuyangSktd() {
        return suyangSktd;
    }

    /**
     * 设置素养-上课态度
     *
     * @param suyangSktd 素养-上课态度
     */
    public void setSuyangSktd(Integer suyangSktd) {
        this.suyangSktd = suyangSktd;
    }

    /**
     * 获取素养-语言表达
     *
     * @return suyang_yybd - 素养-语言表达
     */
    public Integer getSuyangYybd() {
        return suyangYybd;
    }

    /**
     * 设置素养-语言表达
     *
     * @param suyangYybd 素养-语言表达
     */
    public void setSuyangYybd(Integer suyangYybd) {
        this.suyangYybd = suyangYybd;
    }

    /**
     * 获取素养-基本礼仪
     *
     * @return suyang_jbly - 素养-基本礼仪
     */
    public Integer getSuyangJbly() {
        return suyangJbly;
    }

    /**
     * 设置素养-基本礼仪
     *
     * @param suyangJbly 素养-基本礼仪
     */
    public void setSuyangJbly(Integer suyangJbly) {
        this.suyangJbly = suyangJbly;
    }

    /**
     * 获取专业-解题速度
     *
     * @return zhuanye_jtsd - 专业-解题速度
     */
    public Integer getZhuanyeJtsd() {
        return zhuanyeJtsd;
    }

    /**
     * 设置专业-解题速度
     *
     * @param zhuanyeJtsd 专业-解题速度
     */
    public void setZhuanyeJtsd(Integer zhuanyeJtsd) {
        this.zhuanyeJtsd = zhuanyeJtsd;
    }

    /**
     * 获取专业-解题思路
     *
     * @return zhuanye_jtsl - 专业-解题思路
     */
    public Integer getZhuanyeJtsl() {
        return zhuanyeJtsl;
    }

    /**
     * 设置专业-解题思路
     *
     * @param zhuanyeJtsl 专业-解题思路
     */
    public void setZhuanyeJtsl(Integer zhuanyeJtsl) {
        this.zhuanyeJtsl = zhuanyeJtsl;
    }

    /**
     * 获取专业-资源利用
     *
     * @return zhuanye_zyly - 专业-资源利用
     */
    public Integer getZhuanyeZyly() {
        return zhuanyeZyly;
    }

    /**
     * 设置专业-资源利用
     *
     * @param zhuanyeZyly 专业-资源利用
     */
    public void setZhuanyeZyly(Integer zhuanyeZyly) {
        this.zhuanyeZyly = zhuanyeZyly;
    }

    /**
     * 获取专业-求助频次
     *
     * @return zhuanye_qzpc - 专业-求助频次
     */
    public Integer getZhuanyeQzpc() {
        return zhuanyeQzpc;
    }

    /**
     * 设置专业-求助频次
     *
     * @param zhuanyeQzpc 专业-求助频次
     */
    public void setZhuanyeQzpc(Integer zhuanyeQzpc) {
        this.zhuanyeQzpc = zhuanyeQzpc;
    }

    /**
     * 获取学习-提问频次
     *
     * @return xuexi_twpc - 学习-提问频次
     */
    public Integer getXuexiTwpc() {
        return xuexiTwpc;
    }

    /**
     * 设置学习-提问频次
     *
     * @param xuexiTwpc 学习-提问频次
     */
    public void setXuexiTwpc(Integer xuexiTwpc) {
        this.xuexiTwpc = xuexiTwpc;
    }

    /**
     * 获取学习-专注力
     *
     * @return xuexi_zzl - 学习-专注力
     */
    public Integer getXuexiZzl() {
        return xuexiZzl;
    }

    /**
     * 设置学习-专注力
     *
     * @param xuexiZzl 学习-专注力
     */
    public void setXuexiZzl(Integer xuexiZzl) {
        this.xuexiZzl = xuexiZzl;
    }

    /**
     * 获取学习-知识消化
     *
     * @return xuexi_zsxh - 学习-知识消化
     */
    public Integer getXuexiZsxh() {
        return xuexiZsxh;
    }

    /**
     * 设置学习-知识消化
     *
     * @param xuexiZsxh 学习-知识消化
     */
    public void setXuexiZsxh(Integer xuexiZsxh) {
        this.xuexiZsxh = xuexiZsxh;
    }

    /**
     * 获取学习-作业完成度
     *
     * @return xuexi_zywcd - 学习-作业完成度
     */
    public Integer getXuexiZywcd() {
        return xuexiZywcd;
    }

    /**
     * 设置学习-作业完成度
     *
     * @param xuexiZywcd 学习-作业完成度
     */
    public void setXuexiZywcd(Integer xuexiZywcd) {
        this.xuexiZywcd = xuexiZywcd;
    }

    /**
     * 获取老师评价
     *
     * @return teacher_comm - 老师评价
     */
    public String getTeacherComm() {
        return teacherComm;
    }

    /**
     * 设置老师评价
     *
     * @param teacherComm 老师评价
     */
    public void setTeacherComm(String teacherComm) {
        this.teacherComm = teacherComm;
    }
}