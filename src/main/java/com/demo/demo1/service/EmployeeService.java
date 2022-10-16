package com.demo.demo1.service;


import com.demo.demo1.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee getEmployeeById(Integer id) {
        Employee emp = new Employee("diksha",123);
        return emp;
    }
}
