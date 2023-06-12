package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Component
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
    private EmployeeDao employeeDao;
	@Override
	public Integer insert(Employee employee) {
		return employeeDao.insert(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);
	}

	@Override
	public void deleteById(Integer employeeId) {
		employeeDao.deleteById(employeeId);
	}

	@Override
	public Employee getById(Integer employeeId) {
		return employeeDao.getById(employeeId);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDao.getList();
	}

}
