package com.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSpApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepositoryImpl EmployeeRepositoryImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Employee> list = EmployeeRepositoryImpl.getAllEmployees();
		for (Employee employee : list) {
			System.out.println(employee.getFullName());
		}
	}
}
