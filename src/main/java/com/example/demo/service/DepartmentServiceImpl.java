package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.model.Department;

@Component
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
    private DepartmentDao departmentDao;

	@Override
	public Integer insert(Department department) {
		return departmentDao.insert(department);
	}

	@Override
	public void update(Department department) {
		departmentDao.update(department);		
	}

	@Override
	public void deleteById(Integer departmentId) {
		departmentDao.deleteById(departmentId);		
	}

	@Override
	public Department getById(Integer departmentId) {
		return departmentDao.getById(departmentId);
	}

	@Override
	public List<Department> findAll() {
		return departmentDao.getList();
	}
}
