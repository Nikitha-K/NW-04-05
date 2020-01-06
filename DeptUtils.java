package com.deloitte.empl.utils;

public class DeptUtils {
	
		public static String insertqry="insert into dept values(?,?,?)";
		public static final String GETDEPTS = "select * from dept";
		public static final String GETDEPTBYCODE = "select * from dept where deptno=?";
	    public static final String UPDATEDEPTBYCODE = "update dept set loc = ? where deptno =?";
	    public static final String DELDEPTBYCODE = "delete from emp where deptno =?";
	}


