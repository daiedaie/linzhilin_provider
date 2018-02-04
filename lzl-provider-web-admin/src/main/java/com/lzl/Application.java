package com.lzl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * Applicaton

 */
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement 
@ServletComponentScan
public class Application extends SpringBootServletInitializer {
    protected static final Logger log = LoggerFactory.getLogger(Application.class);
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
