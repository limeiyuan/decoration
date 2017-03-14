package com.decoration.web;

import com.decoration.domain.JsonData;
import com.decoration.service.JsonDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by LiMeiyuan on 2017/3/14.
 * description: 前段页面映射
 */
@Controller
public class FrontPageController {
    @Resource
    private JsonDataService jsonDataService;

    @RequestMapping()
    public ModelAndView redirect(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        String uri = request.getRequestURI();
        String url = uri.substring(0, uri.indexOf("."));
        if (uri.endsWith("htm") || url.endsWith("html")) {
            return new ModelAndView(url);
        }
        if (uri.endsWith("action")) {
            JsonData data = jsonDataService.queryByUrl(url);
            if (data == null) {
                data = new JsonData();
            }
            ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
            mav.addObject("123", data.getData());
            return mav;
        }
        return new ModelAndView("404");
    }

    @RequestMapping("test.action")
    @ResponseBody
    public String test() {
        return "123";
    }
}
