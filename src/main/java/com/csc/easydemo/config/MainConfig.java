package com.csc.easydemo.config;

import com.csc.easydemo.bean.Person;
import com.csc.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: csc
 * @create: 2020/7/9 23:46
 */
@Configuration
//@ComponentScan(value="com.csc")

//@ComponentScan(value="com.csc",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//})

//@ComponentScan(value="com.csc",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//},useDefaultFilters = false)

@ComponentScans(
        value = {
                @ComponentScan(value = "com.csc", includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
                        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
                }, useDefaultFilters = false)
        }
)
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {
    @Bean
    public Person person() {
        return new Person(20, "lisi");
    }

//    @Bean
//    public Person person1() {
//        return new Person(20, "lisi");
//    }

//    @Bean("person2")
//    public Person person() {
//        return new Person(20, "lisi");
//    }
}
