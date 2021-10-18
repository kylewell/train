package com.kyle.train.mbg.mapper;

import com.kyle.train.mbg.model.PmsBrand;
import com.kyle.train.mbg.model.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    long countByExample(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int deleteByExample(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int insert(PmsBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int insertSelective(PmsBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    List<PmsBrand> selectByExample(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    PmsBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByPrimaryKeySelective(PmsBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Thu Oct 21 11:01:14 CST 2021
     */
    int updateByPrimaryKey(PmsBrand record);
}