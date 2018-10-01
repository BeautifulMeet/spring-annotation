package com.chen.config;

import com.chen.aop.AsepctDemo;
import com.chen.aop.MathUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public MathUtil mathUtil(){
        return new MathUtil();
    }

    @Bean
    public AsepctDemo asepctDemo(){
        return new AsepctDemo();
    }

}
