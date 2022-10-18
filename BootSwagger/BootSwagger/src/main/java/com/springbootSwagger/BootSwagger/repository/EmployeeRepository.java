package com.springbootSwagger.BootSwagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootSwagger.BootSwagger.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
