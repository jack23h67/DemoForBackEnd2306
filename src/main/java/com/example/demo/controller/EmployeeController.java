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

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class EmployeeController {
	@Autowired
    private EmployeeService employeeService;
	@PostMapping("/employees")
    @Operation(summary = "新增某一筆員工資料", description = "")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {

        Integer employeeId = employeeService.insert(employee);

        Employee newEmployee = employeeService.getById(employeeId);

        return ResponseEntity.status(HttpStatus.CREATED).body(newEmployee);
    }

    @PutMapping("/employees/{employeeId}")
    @Operation(summary = "用id去更新某一筆員工資料", description = "")
    public ResponseEntity<?> update(@PathVariable Integer employeeId,
                                    @RequestBody Employee employee) {

    	employee.setEmployeeId(employeeId);
    	employeeService.update(employee);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/employees/{employeeId}")
    @Operation(summary = "用id去刪除某一筆員工資料", description = "")
    public ResponseEntity<?> delete(@PathVariable Integer employeeId) {

    	employeeService.deleteById(employeeId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/employees/{employeeId}")
    @Operation(summary = "用id去取得某一筆員工資料", description = "")
    public ResponseEntity<Employee> findById(@PathVariable Integer employeeId) {

    	Employee employee = employeeService.getById(employeeId);

        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
    
    @GetMapping("/employees")
    @Operation(summary = "取得部門列表", description = "")
    public List<Employee> findAll() {

        List<Employee> EmployeeList = employeeService.findAll();

        return EmployeeList;
    }
}
