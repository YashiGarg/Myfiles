package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.dto.Employee;
import com.cg.ems.util.JPAUtil;

public class EmployeyDaoImpl implements EmployeeDao {

    EntityManager em=null;
    EntityTransaction entityTran=null;
    public EmployeyDaoImpl() {
		em=JPAUtil.getEntityManager();
		entityTran=em.getTransaction();
		
	}
	
	@Override
	public Employee addEmp(Employee emp) {
		entityTran.begin();
		em.persist(emp);
		entityTran.commit();
		return emp;
	}

	@Override
	public ArrayList<Employee> fetchALLemp() {
		
		return null;
	}

	@Override
	public Employee deleteEmp(int empId) {
	
		return null;
	}

	@Override
	public Employee getEmpbyEid(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return null;
	}

	}