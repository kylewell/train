package com.kyle.train.mbg.model;

public class UmsRolePermissionRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_permission_relation.id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_permission_relation.role_id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_permission_relation.permission_id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    private Long permissionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_permission_relation.id
     *
     * @return the value of ums_role_permission_relation.id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_permission_relation.id
     *
     * @param id the value for ums_role_permission_relation.id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_permission_relation.role_id
     *
     * @return the value of ums_role_permission_relation.role_id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_permission_relation.role_id
     *
     * @param roleId the value for ums_role_permission_relation.role_id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_permission_relation.permission_id
     *
     * @return the value of ums_role_permission_relation.permission_id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_permission_relation.permission_id
     *
     * @param permissionId the value for ums_role_permission_relation.permission_id
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}