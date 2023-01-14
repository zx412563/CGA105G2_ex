package com.emp.model.Employee.dao;

import com.emp.model.Employee.pojo.Employee;

import java.util.List;

public interface EmployeeDAO_interface {
	 public void insert(Employee EmployeeVO);
     public void update(Employee EmployeeVO);
     public Employee findByEMP_ID(Integer emp_id);
     public List<Employee> getAll();

}
