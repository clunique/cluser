package com.cluser.dao.mapper.generated;

import com.cluser.dao.model.generated.TUser;
import com.cluser.dao.model.generated.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int countByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int deleteByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Delete({
        "delete from t_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Insert({
        "insert into t_user (user_name, full_name, ",
        "display_name, password_meta_info, ",
        "password, password_status, ",
        "salt, email, email_verify_status, ",
        "telephone, mobile, ",
        "mobile_verify_status, gender, ",
        "type, status, avatar, ",
        "created_by, last_login, ",
        "created_time, updated_time)",
        "values (#{userName,jdbcType=VARCHAR}, #{fullName,jdbcType=VARCHAR}, ",
        "#{displayName,jdbcType=VARCHAR}, #{passwordMetaInfo,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{passwordStatus,jdbcType=VARCHAR}, ",
        "#{salt,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{emailVerifyStatus,jdbcType=VARCHAR}, ",
        "#{telephone,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
        "#{mobileVerifyStatus,jdbcType=VARCHAR}, #{gender,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, #{avatar,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=BIGINT}, #{lastLogin,jdbcType=TIMESTAMP}, ",
        "#{createdTime,jdbcType=TIMESTAMP}, #{updatedTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int insertSelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Select({
        "select",
        "id, user_name, full_name, display_name, password_meta_info, password, password_status, ",
        "salt, email, email_verify_status, telephone, mobile, mobile_verify_status, gender, ",
        "type, status, avatar, created_by, last_login, created_time, updated_time",
        "from t_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    TUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Update({
        "update t_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "full_name = #{fullName,jdbcType=VARCHAR},",
          "display_name = #{displayName,jdbcType=VARCHAR},",
          "password_meta_info = #{passwordMetaInfo,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "password_status = #{passwordStatus,jdbcType=VARCHAR},",
          "salt = #{salt,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "email_verify_status = #{emailVerifyStatus,jdbcType=VARCHAR},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "mobile_verify_status = #{mobileVerifyStatus,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=BIGINT},",
          "last_login = #{lastLogin,jdbcType=TIMESTAMP},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TUser record);
}