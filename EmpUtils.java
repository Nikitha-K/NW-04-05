package com.deloitte.empl.utils;

public class EmpUtils {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPLBYCODE = "select * from emp where empno=?";
    public static final String UPDATEEMPLBYCODE = "update emp set sal = ? where empno =?";
    public static final String DELEMPLBYCODE = "delete from emp where empno =?";
	//public static final String GETEMPLBYCODE = null;
}