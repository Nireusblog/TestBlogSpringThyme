package com.example.springbootblogapplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/**")
            .addResourceLocations("classpath:/static/");

    }
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry){
//        registry.react().prefic("classpath:/static/").suffix("html");
//    }
}
