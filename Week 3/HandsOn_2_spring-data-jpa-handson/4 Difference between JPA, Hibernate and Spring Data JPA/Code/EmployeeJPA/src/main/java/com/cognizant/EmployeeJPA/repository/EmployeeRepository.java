package com.cognizant.EmployeeJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.EmployeeJPA.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
