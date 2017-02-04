package com.decoration.mapper;

import com.decoration.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by LiMeiyuan on 2017/2/4.
 * 用户操作类
 */
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User getUser(@Param("id") String id);

    User getUser2(String id);
}
