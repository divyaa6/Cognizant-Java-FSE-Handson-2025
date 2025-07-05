package com.cognizant.EmployeeJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import com.cognizant.EmployeeJPA.model.Employee;
import com.cognizant.EmployeeJPA.service.EmployeeService;

@SpringBootApplication
public class EmployeeJpaApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee();
        emp.setName("Divyasri");
        emp.setSalary(70000);
        employeeService.addEmployee(emp);

        System.out.println("Employee saved: " + emp);
    }
}
