package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Employee;

@Mapper
public interface EmployeeDao {
	@Insert(" INSERT INTO EMPLOYEE ( "
	          + "	    EmployeeName, department, dateOfJoining "
			  + "	   "
			  + " ) "
			  + " VALUES ( "
			  + "	    #{EmployeeName}, #{department}, NOW() "
			  + "	    "
			  + " ) ")
		public Integer insert(Employee employee);
		
		@Select(" SELECT "
			  + "	   EmployeeId, EmployeeName, department, dateOfJoining "
			  + " FROM "
			  + "	   Employee "
			  + " WHERE "
			  + "	   NAME = #{EmployeeName} ")
		public Employee findStudentByName(String EmployeeName);
		
		@Update(" UPDATE "
			  + "	Employee "
			  + " SET "
			  + "	EmployeeName = #{EmployeeName}, department = #{department},  "
			  + "   dateOfJoining = NOW()  "
			  + " WHERE 1=1 "
			  + "	AND EmployeeId = #{EmployeeId} ")
		public Integer update(Employee employee);
		
		@Delete("DELETE FROM Employee Where  EmployeeId = #{EmployeeId}")
		public int deleteById(Integer EmployeeId);
		
		@Select("SELECT * FROM Employee")
		public List<Employee> getList();

		@Select("SELECT * FROM Employee WHERE EmployeeId = #{EmployeeId}")
		public Employee getById(Integer EmployeeId);
}
