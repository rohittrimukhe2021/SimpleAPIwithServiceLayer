package com.example.SimpleAPIwithServiceLayer.Employee;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService   {
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(
                        101L,
                        "Employee1",
                        "Employee1@gmail.com"
                )
        );
    }
}
