package com.csc.easydemo;

import com.csc.easydemo.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: csc
 * @create: 2020/7/15 23:37
 */
public class MainConfig2Test {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println("-------" + name);
//        }
        System.out.println("ioc容器创建完成....");
        Object person = annotationConfigApplicationContext.getBean("person");
        Object person2 = annotationConfigApplicationContext.getBean("person");
        System.out.println(person == person2);


    }
}
