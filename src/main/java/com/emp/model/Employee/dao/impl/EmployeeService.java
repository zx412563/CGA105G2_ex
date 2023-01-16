//package com.emp.model.Employee.dao.impl;
//
//import java.util.List;
//
//import com.emp.model.Employee.dao.EmployeeDAO_interface;
//import com.emp.model.Employee.pojo.Employee;
//
//public class EmployeeService {
//	private EmployeeDAO_interface dao;
//	
//	public EmployeeService() {
//		dao = new EmployeeJDBCDAO();
//	}
//	
//	public Employee getOneEmp(Integer empId) {
//		return dao.findByEMP_ID(empId);
//	}
//	public Employee addEmp(String acc, String pwd) {
//		Employee employee = new Employee();
//		employee.setEmpAcc(acc);
//		employee.setEmpPwd(pwd);
//		dao.insert(employee);
//		return employee;
//	}
//	public Employee updateEmp(Employee employee) {
//		return dao.update(employee);
//		
//	}
//	public List<Employee> all() {
//		return dao.getAll();
//
//	}
//
//}
