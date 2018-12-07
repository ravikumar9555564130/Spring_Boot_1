package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmployeeService {

	public static Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	public void getEnploye() {

		logger.info("employee");
	}

}
