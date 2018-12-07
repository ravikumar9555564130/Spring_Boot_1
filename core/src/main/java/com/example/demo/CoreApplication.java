package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.service")
public class CoreApplication {

	public static Logger logger = LoggerFactory.getLogger(CoreApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);

		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			logger.info("beanDefinitionNames :: " + beanDefinitionName);
		}

		logger.info("count :: " + ctx.getBeanDefinitionCount());

		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		employeeService.getEnploye();

	}
}
