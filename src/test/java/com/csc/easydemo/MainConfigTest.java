package com.csc.easydemo;

import com.csc.easydemo.bean.Person;
import com.csc.easydemo.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: csc
 * @create: 2020/7/9 23:47
 */
public class MainConfigTest {
    @Test
    public void xmlTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object person = applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void Annotation() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);
        System.out.println(annotationConfigApplicationContext.getBeanDefinitionNames());
        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType)
            System.out.println(s);
    }
}
