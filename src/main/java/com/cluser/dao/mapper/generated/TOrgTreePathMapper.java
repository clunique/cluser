package com.cluser.dao.mapper.generated;

import com.cluser.dao.model.generated.TOrgTreePath;
import com.cluser.dao.model.generated.TOrgTreePathExample;
import com.cluser.dao.model.generated.TOrgTreePathKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TOrgTreePathMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int countByExample(TOrgTreePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int deleteByExample(TOrgTreePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Delete({
        "delete from t_org_tree_path",
        "where ancestor = #{ancestor,jdbcType=BIGINT}",
          "and descendant = #{descendant,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TOrgTreePathKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Insert({
        "insert into t_org_tree_path (ancestor, descendant, ",
        "depth)",
        "values (#{ancestor,jdbcType=BIGINT}, #{descendant,jdbcType=BIGINT}, ",
        "#{depth,jdbcType=SMALLINT})"
    })
    int insert(TOrgTreePath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int insertSelective(TOrgTreePath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    List<TOrgTreePath> selectByExample(TOrgTreePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Select({
        "select",
        "ancestor, descendant, depth",
        "from t_org_tree_path",
        "where ancestor = #{ancestor,jdbcType=BIGINT}",
          "and descendant = #{descendant,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    TOrgTreePath selectByPrimaryKey(TOrgTreePathKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int updateByExampleSelective(@Param("record") TOrgTreePath record, @Param("example") TOrgTreePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int updateByExample(@Param("record") TOrgTreePath record, @Param("example") TOrgTreePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    int updateByPrimaryKeySelective(TOrgTreePath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org_tree_path
     *
     * @mbggenerated Fri Dec 09 11:08:47 CST 2016
     */
    @Update({
        "update t_org_tree_path",
        "set depth = #{depth,jdbcType=SMALLINT}",
        "where ancestor = #{ancestor,jdbcType=BIGINT}",
          "and descendant = #{descendant,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TOrgTreePath record);
}