package com.springbootSwagger.BootSwagger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootSwagger.BootSwagger.entity.Employee;
import com.springbootSwagger.BootSwagger.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()  
	{    
	List<Employee>emp = new ArrayList<>();    
	employeeRepository.findAll().forEach(emp::add);    
	return emp;    
	}    

	
	public void addEmployee(Employee employee)  
	{    
		employeeRepository.save(employee);    
	}


	public Employee getEmployeeById(long employeeid) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeid).get();  
	}


	public void deleteEmployee(long employeeid) {
		employeeRepository.deleteById(employeeid);  
		
	}


	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee); 
		
	}    
	
}
