package com.deloitte.empl.appln;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/UpdateEmp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out = response.getWriter();
		
		int empcode = Integer.parseInt(request.getParameter("empno"));
		//String name = request.getParameter("ename");
		//String job = request.getParameter("job");
		//int mgr = Integer.parseInt(request.getParameter("mgr"));
		//String hiredate = request.getParameter("hiredate");
		int salary = Integer.parseInt(request.getParameter("sal"));
		//int comm = Integer.parseInt(request.getParameter("comm"));
		//int deptno = Integer.parseInt(request.getParameter("deptno"));
		
		EmpDao dao = new EmpDaoImpl();
		try{
		     int result = dao.updateEmpByCode(4000,7499);
		     if(result==1)
		    	 System.out.println("updated");
		     Emp e = dao.getEmpByCode(empcode);
	 	     System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob()+" "+
				e.getMgr()+" "+e.getHiredate()+" "+e.getSal()+" "+e.getComm()+" "+
				e.getDeptno());
	 	   }
		catch(NullPointerException e){
			System.out.println("Employee not found");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
