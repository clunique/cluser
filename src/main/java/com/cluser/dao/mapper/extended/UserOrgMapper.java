package com.cluser.dao.mapper.extended;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import com.cluser.dao.mapper.generated.TUserOrgMapper;
import com.cluser.dao.model.generated.TUserOrgKey;

public interface UserOrgMapper extends TUserOrgMapper {

    @Delete({"delete from t_user_org where org_id = #{orgId,jdbcType=BIGINT}"})
    int removeUsersFromOrg(@Param("orgId") Long orgId);
    
    Set<Long> selectUsersInOrg(@Param("userIds") Set<Long> userIds, @Param("orgId") Long orgId);
    
    int insertList(@Param("userOrgs") List<TUserOrgKey> userOrgs);
    
    int removeList(@Param("userIds") Set<Long> usersToLeaveOrg, @Param("orgId") String orgId);
}
