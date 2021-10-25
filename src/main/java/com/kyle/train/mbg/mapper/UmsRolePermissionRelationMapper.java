package com.kyle.train.mbg.mapper;

import com.kyle.train.mbg.model.UmsRolePermissionRelation;
import com.kyle.train.mbg.model.UmsRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRolePermissionRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    long countByExample(UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int deleteByExample(UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int insert(UmsRolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int insertSelective(UmsRolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    List<UmsRolePermissionRelation> selectByExample(UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int updateByExampleSelective(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int updateByExample(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbg.generated Thu Oct 21 13:33:02 CST 2021
     */
    int updateByPrimaryKey(UmsRolePermissionRelation record);
}