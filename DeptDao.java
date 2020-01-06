package com.deloitte.empl.dao;


//package com.deloitte.empl.dao;

	import java.util.List;

import com.deloitte.empl.beans.Dept;
import com.deloitte.empl.beans.Emp;

	
		public interface DeptDao {
		void openConnection();
		void close();
		int addDept(Dept dept); 
		List<Dept> getDepts();
		Dept getDeptByCode(int deptno);
		//int updateEmpByCode(int salary,int empcode,String job, int sal, int deptno);
		int delDeptByCode(int deptno);
		//int updateEmpByCode(int salary, int empcode, String job, int sal, int deptno);
		int updateDeptByCode(int deptno, String dname);
	
	}


