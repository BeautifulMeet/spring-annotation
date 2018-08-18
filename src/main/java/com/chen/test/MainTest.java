package com.chen.test;

import com.chen.bean.Person;
import com.chen.config.BeanConfig;
import com.chen.config.ComponentScanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title: MainTest
 * @ProjectName springannotation
 * @Description: TODO
 * @author chen
 * @date 2018/8/517:01
 */
public class MainTest {


    /**
     * 获取 配置 bean
     */
    @Test
    public void beanTest(){

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Person person = (Person) context.getBean("person");
        System.out.println("person:"+person);
    }


    @Test
    public void componentScanTest(){

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        String[] names = context.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }

    }

}
