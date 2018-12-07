package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public static Logger logger = LoggerFactory.getLogger(EmployeeService.class);


	public void getEnploye() {
		
		logger.info("employee");
	}

}
