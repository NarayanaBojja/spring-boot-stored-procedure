package com.server;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;

public interface EmployeeRepositoryCustom {
	//@Procedure(name = "getAllEmployees")
	List<Employee> getAllEmployees();
}
