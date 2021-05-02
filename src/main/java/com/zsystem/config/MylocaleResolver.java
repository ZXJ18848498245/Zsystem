package com.zsystem.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MylocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
       //获取语言参数
        String language = httpServletRequest.getParameter("l");
        Locale locale = Locale.getDefault();//如果没有获取默认值

        if(!StringUtils.isEmpty(language)){
            //zh_Cn
            String[] split = language.split("_");
            //语言 国家
             locale = new Locale(split[0], split[1]);
        }
        return locale;

    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
