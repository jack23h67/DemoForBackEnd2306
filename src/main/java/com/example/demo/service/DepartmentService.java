package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {
    Integer insert(Department department);

    void update(Department department);

    void deleteById(Integer id);

    Department getById(Integer id);
    
    List<Department> findAll();
}
