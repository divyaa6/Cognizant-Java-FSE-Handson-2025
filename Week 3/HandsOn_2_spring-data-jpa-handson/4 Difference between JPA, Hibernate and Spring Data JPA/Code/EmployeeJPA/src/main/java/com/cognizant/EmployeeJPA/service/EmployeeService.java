package com.cognizant.EmployeeJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.EmployeeJPA.model.Employee;
import com.cognizant.EmployeeJPA.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee emp) {
        employeeRepository.save(emp);
    }
}
