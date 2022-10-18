package com.springbootSwagger.BootSwagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootSwagger.BootSwagger.entity.Employee;
import com.springbootSwagger.BootSwagger.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
		
	}
	
	
	@GetMapping("/employees/{employeeid}")  
	private Employee getEmployee(@PathVariable("employeeid") int employeeid)   
	{  
	return employeeService.getEmployeeById(employeeid);  
	}  
	
	@PostMapping("/employees")
	public  void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@DeleteMapping("/employees/{employeeid}")  
	private void deleteEmployee(@PathVariable("employeeid") int employeeid)   
	{  
		employeeService.deleteEmployee(employeeid);  
	}  
	
	//creating put mapping that updates the book detail   
	@PutMapping("/employees")  
	private Employee updateEmployee(@RequestBody Employee employee)   
	{  
		employeeService.updateEmployee(employee);  
	return employee;  
	}  

}
