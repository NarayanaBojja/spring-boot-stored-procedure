package com.server;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Employee> getAllEmployees() {
		StoredProcedureQuery findByYearProcedure = em
				.createNamedStoredProcedureQuery("getAllEmployees");
		return findByYearProcedure.getResultList();
	}
}