package com.deloitte.empl.dao;

import java.util.List;

import com.deloitte.empl.beans.Emp;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	//int updateEmpByCode(int salary,int empcode,String job, int sal, int deptno);
	int delEmpByCode(int empcode);
	//int updateEmpByCode(int salary, int empcode, String job, int sal, int deptno);
	int updateEmpByCode(int salary, int empcode);
}