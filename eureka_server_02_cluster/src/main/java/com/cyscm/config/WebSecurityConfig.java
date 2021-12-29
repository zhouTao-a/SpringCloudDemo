package com.cyscm.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全认证配置类
 * @author zhoutao
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        //访问eureka控制台和 actuator时能做安全控制
        super.configure(http);
        //忽略 /eureka/** 的所有请求
        http.csrf().ignoringAntMatchers("/eureka/**");
    }

}
