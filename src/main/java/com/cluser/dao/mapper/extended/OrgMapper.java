package com.cluser.dao.mapper.extended;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.cluser.dao.enums.OrgType;
import com.cluser.dao.mapper.generated.TOrganizationMapper;
import com.cluser.dao.model.extended.TOrganizationWithParent;
import com.cluser.dao.model.generated.TOrganization;


public interface OrgMapper extends TOrganizationMapper {

    @SelectProvider(type=OrgSqlProvider.class, method="selectDescendant")
    List<TOrganizationWithParent> selectDescendant(@Param("ancestor") Long ancestor,
            @Param("depth") Short depth);

    @Select({
            "select o.*, t.* from t_org_tree_path t join t_organization o on o.id = t.descendant where descendant = #{descendant,jdbcType=BIGINT} order by depth desc;"})
    List<TOrganizationWithParent> selectAncestor(@Param("descendant") Long descendant);

    @Select({"select * from t_organization where type=#{type,jdbcType=VARCHAR};"})
    TOrganization getOneOrgByType(@Param("type") OrgType type);

    @Delete({
            "delete o from uc.t_organization o, uc.t_org_tree_path t where o.id = t.descendant and t.ancestor = #{id,jdbcType=BIGINT};"})
    int deleteCascade(@Param("id") Long id);
    
    @Select({
    "select o.* from t_organization o where o.name like #{filterStr,jdbcType=VARCHAR} or o.description like #{filterStr,jdbcType=VARCHAR} order by o.name desc;"})
    List<TOrganization> searchOrg(@Param("filterStr") String filterStr);
}
