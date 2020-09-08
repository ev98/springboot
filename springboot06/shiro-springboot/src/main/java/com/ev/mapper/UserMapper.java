package com.ev.mapper;

import com.ev.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from login where username=#{username}")
    User queryUserByName(String username);

}
