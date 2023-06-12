package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class DepartmentController {
	@Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    @Operation(summary = "新增某一筆部門資料", description = "")
    public ResponseEntity<Department> create(@RequestBody Department department) {

        Integer departmentId = departmentService.insert(department);

        Department newDepartment = departmentService.getById(departmentId);

        return ResponseEntity.status(HttpStatus.CREATED).body(newDepartment);
    }

    @PutMapping("/departments/{departmentId}")
    @Operation(summary = "用id去更新某一筆部門資料", description = "")
    public ResponseEntity<?> update(@PathVariable Integer departmentId,
                                    @RequestBody Department department) {

    	department.setDepartmentId(departmentId);
    	departmentService.update(department);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/departments/{departmentId}")
    @Operation(summary = "用id去刪除某一筆部門資料", description = "")
    public ResponseEntity<?> delete(@PathVariable Integer departmentId) {

    	departmentService.deleteById(departmentId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/departments/{departmentId}")
    @Operation(summary = "用id去取得某一筆部門資料", description = "")
    public ResponseEntity<Department> findById(@PathVariable Integer departmentId) {

    	Department department = departmentService.getById(departmentId);

        return ResponseEntity.status(HttpStatus.OK).body(department);
    }
    
    @GetMapping("/departments")
    @Operation(summary = "取得部門列表", description = "")
    public List<Department> findAll() {

        List<Department> departmentList = departmentService.findAll();

        return departmentList;
    }
}
