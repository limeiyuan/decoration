package com.decoration.service;

import com.decoration.domain.JsonData;
import com.decoration.mapper.JsonDataMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LiMeiyuan on 2017/3/14.
 * description:
 */
@Service
public class JsonDataService {
    @Resource
    private JsonDataMapper jsonDataMapper;

    public JsonData queryByUrl(String url) {
        return jsonDataMapper.query(url);
    }
}
