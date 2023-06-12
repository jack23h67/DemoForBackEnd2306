package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DEPARTMENT")
public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="DEPARTMENTID", nullable=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	
	@Column(name="DEPARTMENTNAME", nullable=false)
	private String departmentName;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
