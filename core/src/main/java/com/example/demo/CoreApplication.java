package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);

		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println("beanDefinitionNames :: " + beanDefinitionName);
		}

		System.out.println("count :: " + ctx.getBeanDefinitionCount());

		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		employeeService.getEnploye();

	}
}
