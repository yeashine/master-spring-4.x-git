package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yangyueming
 */
@SpringBootApplication
@EnableTransactionManagement
//public class Application  extends SpringBootServletInitializer implements WebApplicationInitializer {
public class Ch3Application {
//
//    @Bean
//    public PlatformTransactionManager txManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Ch3Application.class, args);
    }
}

