package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
    Integer insert(Employee employee);

    void update(Employee employee);

    void deleteById(Integer id);

    Employee getById(Integer id);
    
    List<Employee> findAll();
}
