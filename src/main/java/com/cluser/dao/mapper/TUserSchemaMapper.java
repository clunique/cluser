package com.cluser.dao.mapper;

import com.cluser.dao.model.TUserSchema;
import com.cluser.dao.model.TUserSchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TUserSchemaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    int countByExample(TUserSchemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    int deleteByExample(TUserSchemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    @Delete({
        "delete from t_user_schema",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    @Insert({
        "insert into t_user_schema (basic_attribute, display_name, ",
        "domain_name, column_name, ",
        "data_type, mandatory, ",
        "searchable, maint_level, ",
        "constraint_rule, description)",
        "values (#{basicAttribute,jdbcType=BIT}, #{displayName,jdbcType=VARCHAR}, ",
        "#{domainName,jdbcType=VARCHAR}, #{columnName,jdbcType=VARCHAR}, ",
        "#{dataType,jdbcType=VARCHAR}, #{mandatory,jdbcType=BIT}, ",
        "#{searchable,jdbcType=BIT}, #{maintLevel,jdbcType=VARCHAR}, ",
        "#{constraintRule,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TUserSchema record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    int insertSelective(TUserSchema record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    List<TUserSchema> selectByExample(TUserSchemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    @Select({
        "select",
        "id, basic_attribute, display_name, domain_name, column_name, data_type, mandatory, ",
        "searchable, maint_level, constraint_rule, description",
        "from t_user_schema",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    TUserSchema selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    int updateByExampleSelective(@Param("record") TUserSchema record, @Param("example") TUserSchemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    int updateByExample(@Param("record") TUserSchema record, @Param("example") TUserSchemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    int updateByPrimaryKeySelective(TUserSchema record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Mon Dec 12 09:41:52 CST 2016
     */
    @Update({
        "update t_user_schema",
        "set basic_attribute = #{basicAttribute,jdbcType=BIT},",
          "display_name = #{displayName,jdbcType=VARCHAR},",
          "domain_name = #{domainName,jdbcType=VARCHAR},",
          "column_name = #{columnName,jdbcType=VARCHAR},",
          "data_type = #{dataType,jdbcType=VARCHAR},",
          "mandatory = #{mandatory,jdbcType=BIT},",
          "searchable = #{searchable,jdbcType=BIT},",
          "maint_level = #{maintLevel,jdbcType=VARCHAR},",
          "constraint_rule = #{constraintRule,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TUserSchema record);
}