package com.test.serverwebservice.controller;

import com.test.serverwebservice.model.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class HelloController {

    @GetMapping("/")
    public List<Employee> greet() {
        Employee varun = new Employee("Varun", "Kacholiya", 26);
        Employee ishan = new Employee("Ishan", "Govindan", 34);
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(varun);
        employeeList.add(ishan);
        return employeeList;
    }
}
