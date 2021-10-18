package com.kyle.train.mbg.mapper;

import com.kyle.train.mbg.model.UmsPermission;
import com.kyle.train.mbg.model.UmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    long countByExample(UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int deleteByExample(UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int insert(UmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int insertSelective(UmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    List<UmsPermission> selectByExample(UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    UmsPermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByExample(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByPrimaryKeySelective(UmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByPrimaryKey(UmsPermission record);
}