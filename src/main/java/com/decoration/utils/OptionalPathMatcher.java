package com.decoration.utils;

import org.springframework.util.AntPathMatcher;

import java.util.Map;

/**
 * Created by LiMeiyuan on 2017/3/14.
 * description:
 */
public class OptionalPathMatcher extends AntPathMatcher {
    @Override
    protected boolean doMatch(String pattern, String path, boolean fullMatch, Map<String, String> uriTemplateVariables) {
        if (path.startsWith("/front/redirect")) {
            return true;
        }
        return super.doMatch(pattern, path, fullMatch, uriTemplateVariables);
    }
}
