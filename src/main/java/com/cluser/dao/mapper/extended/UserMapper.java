package com.cluser.dao.mapper.extended;


import java.util.List;
import java.util.Set;

import com.cluser.dao.mapper.generated.TUserMapper;
import com.cluser.dao.model.generated.TUser;

public interface UserMapper extends TUserMapper {

    //@ResultMap("com.nationsky.edp.usercenter.dao.mapper.TUserMapper.BaseResultMap")
    TUser selectByUsername(String username);
    
    Set<Long> selectValidUserIds(List<Long> userIds);

//    @Insert("insert into t_user(" +
//            "user_name,full_name,display_name,password_meta_info," +
//            "password,password_status,salt,email,email_verify_status," +
//            "telephone,mobile,mobile_verify_status,gender,type,status," +
//            "avatar,created_by,last_login,created_time,updated_time)" +
//            "values (" +
//            "#{username},#{fullname},#{displayname},#{passwordmetainfo}," +
//            "#{password},#{passwordstatus},#{salt},#{email},#{emailverifystatus}," +
//            "#{telephone},#{mobile},#{mobileverifystatus},#{gender},#{type},#{status}," +
//            "#{avatar},#{createdby},#{lastlogin},now(),#{updatedtime}" +
//            ")")
//    public void creatUser(@Param(value = "username") String username, @Param(value = "fullname") String fullname, @Param(value = "displayname") String displayname,@Param(value = "passwordmetainfo") String passwordmetainfo,@Param(value = "password") String password,@Param(value = "passwordstatus") String passwordstatus,@Param(value = "salt") String salt,@Param(value = "email") String email,@Param(value = "emailverifystatus") String emailverifystatus,@Param(value = "telephone") String telephone,@Param(value = "mobile") String mobile,@Param(value = "mobileverifystatus") String mobileverifystatus,@Param(value = "gender") String gender,@Param(value = "type") String type,@Param(value = "status") String status,@Param(value = "avatar") String avatar,@Param(value = "createdby") Long creater,@Param(value = "lastlogin") Timestamp lastlogin,@Param(value = "updatedtime") Timestamp updatedtime);

}
