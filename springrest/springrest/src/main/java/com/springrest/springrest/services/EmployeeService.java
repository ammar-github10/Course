package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(long employeeId);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee deleteEmployee(Long employee);

	public void delEmployee(long parseLong);

}
