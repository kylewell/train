package com.kyle.train.model;

import lombok.Data;

import java.util.Date;

@Data
public class UmsPermission {
    private Long id;
    private Long pid; // 父级权限id
    private String name; // 名称
    private String value; //权限值
    private String icon; // 图标
    private Integer type; // 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
    private String uri; // 前端资源路径
    private Integer status; // 启用状态；0->禁用；1->启用
    private Date createTime; // 创建时间
    private Integer sort; // 排序
    private static final long serialVersionUID = 1L;
}
