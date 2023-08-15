package com.example.SecurityUse.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户
 * @TableName user
 */
@Data
public class UserVo implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 头像
     */
    private Long avatarId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态：1启用、0禁用
     */
    private Integer enabled;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    private String username;

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 岗位名称
     */
    private Long jobId;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 0女1男
     */
    private Integer sex;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 0正常1删除
     */
    private Integer isDel;

    /**
     * 工号
     */
    private String number;

    /**
     * 员工姓名
     */
    private String realName;

    /**
     * 数据权限
     */
    private String dataScope;

    /**
     * 门店数据权限
     */
    private String storeDataScope;


    private String token;

    private static final long serialVersionUID = 1L;


    }