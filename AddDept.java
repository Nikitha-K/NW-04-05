package com.deloitte.empl.appln;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Dept;
import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.DeptDao;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.DeptDaoImpl;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddDept")
public class AddDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String dname = request.getParameter("dname");
		
		
		String loc = request.getParameter("loc");
		
		
		Dept dept = new Dept(deptno,dname,loc);
		DeptDao dao = new DeptDaoImpl();
		int rows = dao.addDept(dept);
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
