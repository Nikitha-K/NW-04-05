package com.deloitte.empl.appln;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class GetDepts
 */
@WebServlet("/GetDepts")
public class GetDepts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		
		PrintWriter out = response.getWriter();
		   DeptDao dao = new DeptDaoImpl();
		   List<Dept> deptlist = dao.getDepts();
		   out.println("<table border=2>");
		   out.println("<tr><th>DEPT NO<th>DEPT NAME<TH>LOC<th></tr>");
		   
		   
			   for(Dept e : deptlist){
			out.println("<tr>");
			out.println("<td>"+e.getDeptno()+"</td>");
			out.println("<td>"+e.getDname()+"</td>");
			out.println("<td>"+e.getLoc()+"</td>");
			
			out.println("</tr>");}
			out.println("</table>");

}
		
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
