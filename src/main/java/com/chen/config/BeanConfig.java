package com.chen.config;

import com.chen.bean.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Title: BeanConfig
 * @ProjectName springannotation
 * @Description: TODO
 * @author chen
 * @date 2018/8/517:09
 */

@Configurable
@ComponentScan(value = "com.chen")
public class BeanConfig {

    @Bean(name = "person")
    public Person getPerson(){
        return new Person("李四",18,1);
    }

}
