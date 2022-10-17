package com.example.meiji;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyWebMvcConfig  implements WebMvcConfigurer {

    @Override
    public  void  addViewControllers (ViewControllerRegistry registry){
        registry.addViewController("/add/add").setViewName("add");
    }



}
