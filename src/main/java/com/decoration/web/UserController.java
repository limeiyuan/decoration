package com.decoration.web;

import com.decoration.dto.BaseDto;
import com.decoration.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by LiMeiyuan on 2017/2/4.
 * description:
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("getUser")
    @ResponseBody
    public BaseDto getUser(String id) {
        BaseDto dto = new BaseDto();
        dto.setSuccess(true);
        dto.setResult(userService.getUser(id));
        return dto;
    }
}
