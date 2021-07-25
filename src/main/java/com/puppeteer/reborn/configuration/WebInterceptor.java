package com.puppeteer.reborn.configuration;


import com.puppeteer.reborn.framework.converter.IdNameConverter;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebInterceptor implements WebMvcConfigurer {
    @Autowired
    private List<HandlerInterceptor> interceptors;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new IdNameConverter());
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if (CollectionUtils.isNotEmpty(interceptors)) {
            interceptors.forEach(registry::addInterceptor);
        }
    }
}
