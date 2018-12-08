package com.example.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmployeeDaoImpl implements EmployeeDao {

	public static Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Override
	public void getEmployee() {

		logger.info("This is DAO layer");

	}

}
