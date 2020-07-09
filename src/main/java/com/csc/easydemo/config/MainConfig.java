package com.csc.easydemo.config;

import com.csc.easydemo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: csc
 * @create: 2020/7/9 23:46
 */
@Configuration
public class MainConfig {
//    @Bean
//    public Person person() {
//        return new Person(20, "lisi");
//    }

//    @Bean
//    public Person person1() {
//        return new Person(20, "lisi");
//    }

    @Bean("person2")
    public Person person() {
        return new Person(20, "lisi");
    }
}
