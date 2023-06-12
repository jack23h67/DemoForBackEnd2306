package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="EMPLOYEEID", nullable=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(name="EMPLOYEENAME", nullable=false)
	private String employeeName;
	
	@Column(name="DEPARTMENTNAME", nullable=false)
	private String department;
	
	@Column(name="DATEOFJOINING", nullable=false)
	private Date dateOfJoining;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}
