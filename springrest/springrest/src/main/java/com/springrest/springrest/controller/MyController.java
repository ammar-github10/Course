package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Employee;
import com.springrest.springrest.services.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String gethome() {
		return "This is home page";
	}

	// To get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {

		return this.employeeService.getAllEmployee();

	}

	// To get specific employee
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		return this.employeeService.getEmployee(Long.parseLong(employeeId));
	}

	// To add new employee
	@PostMapping("employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);

	}

	// To update existing employee
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}

	/*
	 * @DeleteMapping("/employees/{employeeId}") public Employee
	 * deleteEmployee(@PathVariable Long employee) { return
	 * this.employeeService.deleteEmployee(employee); }
	 */

	@DeleteMapping("/employees/{employeeId}")
			public ResponseEntity<HttpStatus> delEmployee(@PathVariable String employeeId){
				
				try {
					this.employeeService.delEmployee(Long.parseLong(employeeId));
					return new ResponseEntity<>(HttpStatus.OK);
				}
				catch(Exception e)
				{
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
}
