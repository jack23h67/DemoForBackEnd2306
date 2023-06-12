package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Department;
@Mapper
public interface DepartmentDao {
	@Insert(" INSERT INTO DEPARTMENT ( "
	          + "	   DEPARTMENTNAME "
			  + " ) "
			  + " VALUES ( "
			  + "	   #{DepartmentName} "
			  + " ) ")
		public Integer insert(Department department);
		
		@Select(" SELECT "
			  + "	   DEPARTMENTID, DEPARTMENTNAME "
			  + " FROM "
			  + "	   DEPARTMENT "
			  + " WHERE "
			  + "	   DEPARTMENTNAME = #{DepartmentName} ")
		public Department findDepartmentByName(String DepartmentName);
		
		@Update(" UPDATE "
			  + "	DEPARTMENT "
			  + " SET "
			  + "	DEPARTMENTNAME = #{DepartmentName}  "
			  + " WHERE 1=1 "
			  + "	AND DEPARTMENTID = #{DepartmentId} ")
		public Integer update(Department department);
		
		@Delete("DELETE FROM DEPARTMENT Where DepartmentId = #{DepartmentId}")
		public int deleteById(Integer DepartmentId);
		
		@Select("SELECT * FROM DEPARTMENT")
		public List<Department> getList();

		@Select("SELECT * FROM DEPARTMENT WHERE DepartmentId = #{DepartmentId}")
		public Department getById(Integer DepartmentId);
}
