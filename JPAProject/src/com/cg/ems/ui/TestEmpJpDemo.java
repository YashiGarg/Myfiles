package com.cg.ems.ui;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmpJpDemo {

	public static void main(String[] args) {
		EmployeeService empSer = new EmployeeServiceImpl();
				Employee e1= new Employee(444,"Tanu Sharma",4500.0F,null);
				Employee e2= new Employee(555,"Vikash Sharma",8900.0F,null);
				Employee ee1=empSer.addEmp(e1);
				Employee ee2=empSer.addEmp(e2);
				System.out.println(ee1 + "\n and" + ee2 + "are inserted in the table");
				
	}

}
