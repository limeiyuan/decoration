package com.decoration.mapper;

import com.decoration.domain.JsonData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by LiMeiyuan on 2017/3/14.
 * description:
 */
public interface JsonDataMapper {
    @Select("select * from json_data where url = #{url} limit 1")
    JsonData query(@Param("url") String url);

    @Insert(value = "")
    void save();
}
