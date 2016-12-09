package com.cluser.dao.mapper.extended;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserExtMapper
 *
 * @author Anbang Wang
 * @date 2016/11/7
 */
//@Mapper
public interface UserExtMapper {
//    @Insert("insert into t_user_ext(#{columns}) values(#{values})")
    public void insertUserExt(String colums, String values);
}
