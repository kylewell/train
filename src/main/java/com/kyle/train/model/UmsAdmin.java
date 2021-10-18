package com.kyle.train.model;

import lombok.Data;

import java.util.Date;

@Data
public class UmsAdmin {
    private Long id;
    private String username;
    private String password;
    private String icon; // 头像
    private String email;
    private String nickName;
    private String note;
    private Date createTime;
    private Date loginTime; // 最后登录时间
    private Integer status; // 帐号启用状态：0->禁用；1->启用
    private static final long serialVersionUID = 1l;
}
