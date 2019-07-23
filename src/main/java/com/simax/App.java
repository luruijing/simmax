package com.simax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *SpringBoot入口
 *spring boot会默认加载org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration类使用了@Configuration注解向spring注入了dataSource bean,
 *因为工程中没有关于dataSource相关的配置信息，当spring创建dataSource bean因缺少相关的信息就会报错
 *因此我们需要在Application类上面增加注解@EnableAutoConfiguration
 *不用数据源的话就加上该注解，若用数据源，则去掉该注解
 */
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}