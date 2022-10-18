package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	List<Employee>list;
	
	public EmployeeServiceImpl()
	{
		list=new ArrayList<>();
		
		list.add(new Employee(101,"Anand","Trainee"));
		list.add(new Employee(102,"Rahul","Junior Developer"));
		list.add(new Employee(103,"Sagar","HR"));
		list.add(new Employee(104,"Pramod","<Manager"));
		list.add(new Employee(105,"Jay","Senior Developer"));
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Employee getEmployee(long employeeId) {
		Employee e=null;
		for(Employee employee:list)
		{
			if(employee.getId()==employeeId)
			{
				e=employee;
				break;
			}
		}
		return e;
	}
	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		list.forEach(e->{
			if(e.getId()==employee.getId())
			{
				e.setName("Ashok");
				e.setDesignation(employee.getDesignation());
			}
		});
		
		return employee;
	}
	@Override
	public Employee deleteEmployee(Long employee) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delEmployee(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}

}
