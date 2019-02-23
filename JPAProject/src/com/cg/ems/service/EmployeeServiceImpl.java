package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeyDaoImpl;
import com.cg.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	
   EmployeeDao empDao=null;
   public EmployeeServiceImpl() {
	   empDao=new EmployeyDaoImpl();
   }

public Employee addEmp(Employee emp) {
	// TODO Auto-generated method stub
	return empDao.addEmp(emp);
}

public ArrayList<Employee> fetchALLemp() {
	// TODO Auto-generated method stub
	return empDao.fetchALLemp();
}

public Employee deleteEmp(int empId) {
	// TODO Auto-generated method stub
	return empDao.deleteEmp(empId);
}

public Employee getEmpbyEid(int empId) {
	// TODO Auto-generated method stub
	return empDao.getEmpbyEid(empId);
}

public Employee updateEmp(int empId, String newName, float newSal) {
	// TODO Auto-generated method stub
	return empDao.updateEmp(empId, newName, newSal);
			
}
}

