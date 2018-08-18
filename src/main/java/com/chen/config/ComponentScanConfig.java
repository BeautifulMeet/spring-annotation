package com.chen.config;

import com.chen.filter.MyFilter;
import com.chen.service.BookService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = {
        "com.chen.controller",
        "com.chen.service",
        "com.chen.dao",
},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyFilter.class)
})
public class ComponentScanConfig {



}
