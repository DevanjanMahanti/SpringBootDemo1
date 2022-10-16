package com.demo.demo1.controller;

import com.demo.demo1.model.Employee;
import com.demo.demo1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
        @Autowired
        EmployeeService employeeService;

        @GetMapping("/{id}")
        public Employee getEmployee(@PathVariable Integer id) {
        Employee emp = employeeService.getEmployeeById(id);
        return emp;
        }
}
