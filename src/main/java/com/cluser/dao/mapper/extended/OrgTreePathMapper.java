package com.cluser.dao.mapper.extended;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.cluser.dao.mapper.generated.TOrgTreePathMapper;

public interface OrgTreePathMapper extends TOrgTreePathMapper {
    @Insert({"INSERT INTO t_org_tree_path (ancestor, descendant, depth)",
            "SELECT t.ancestor, #{descendant,jdbcType=BIGINT}, t.depth+1", "FROM t_org_tree_path AS t",
            "WHERE t.descendant = #{ancestor,jdbcType=BIGINT}", "UNION ALL",
            "SELECT #{descendant,jdbcType=BIGINT}, #{descendant,jdbcType=BIGINT}, 0"})
    int insertParentChild(@Param("ancestor") Long ancestor, @Param("descendant") Long descendant);

    @Delete({"DELETE a FROM t_org_tree_path AS a", "JOIN t_org_tree_path AS d ON a.descendant = d.descendant",
            "LEFT JOIN t_org_tree_path AS x", "ON x.ancestor = d.ancestor AND x.descendant = a.ancestor",
            "WHERE d.ancestor = #{descendant,jdbcType=BIGINT} AND x.ancestor IS NULL;"})
    int deleteFromBranch(@Param("descendant") Long descendant);

    @Insert({"INSERT INTO t_org_tree_path (ancestor, descendant, depth)",
            "SELECT supertree.ancestor, subtree.descendant,", "supertree.depth+subtree.depth+1",
            "FROM t_org_tree_path AS supertree JOIN t_org_tree_path AS subtree",
            "WHERE subtree.ancestor = #{descendant,jdbcType=BIGINT}",
            "AND supertree.descendant = #{ancestor,jdbcType=BIGINT}"})
    int addToNewBranch(@Param("ancestor") Long ancestor, @Param("descendant") Long descendant);
}
