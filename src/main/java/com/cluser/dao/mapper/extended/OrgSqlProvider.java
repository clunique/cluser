package com.cluser.dao.mapper.extended;

import org.apache.ibatis.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrgSqlProvider {

    private static Logger logger = LoggerFactory.getLogger(OrgSqlProvider.class);

    public String selectDescendant(Long ancestor, Short depth) {
        String sql = new SQL() {
            {
                SELECT("o.*");
                SELECT("t1.*");
                FROM("t_organization o");
                INNER_JOIN("t_org_tree_path t1 on o.id = t1.descendant");
                INNER_JOIN("t_org_tree_path t2 on t1.descendant = t2.descendant");
                WHERE("t2.ancestor=#{ancestor,jdbcType=BIGINT}");
                WHERE("t2.depth > 0");
                if (depth > 0) {
                    WHERE("t2.depth <= #{depth,jdbcType=SMALLINT}");
                }
                WHERE("t1.depth = 1");
            }
        }.toString();

        logger.info(sql);
        return sql;
    }
}
