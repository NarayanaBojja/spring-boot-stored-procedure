package com.server;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "getAllEmployees", procedureName = "getAllEmployees", resultClasses = Employee.class) })
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "full_name")
	private String fullName;
	private String email;
	private String address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
