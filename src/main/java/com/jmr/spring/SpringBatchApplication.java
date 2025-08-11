package com.jmr.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;







@SpringBootApplication

//@ComponentScan({"com.jmr.*", "com.jmr.batch.entity"})
@ComponentScan({"com.jmr.batch.config", "com.jmr.batch.entity","com.jmr.batch.model","com.jmr.batch.processor","com.jmr.database.config","com.jmr.framework.service"})
public class SpringBatchApplication  {
	//	public class SpringBatchApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchApplication.class, args);
	}
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBatchApplication.class);
	}*/

	
}
