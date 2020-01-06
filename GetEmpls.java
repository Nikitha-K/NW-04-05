package com.deloitte.empl.appln;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

@WebServlet(urlPatterns={"/GetEmpls"},initParams=
{@WebInitParam(name="mobile",value="12345")})
public class GetEmpls extends HttpServlet {
private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			   ServletContext ctx = getServletContext();
			   out.println("City = "+ctx.getInitParameter("City")+"<br>");
			   ServletConfig cfg = getServletConfig();
			   out.println("mobile = "+cfg.getInitParameter("mobile")+"<br>");
			   
			   
			   EmpDao dao = new EmpDaoImpl();
			   List<Emp> emplist = dao.getEmpls();
			   out.println("<table border=2>");
			   out.println("<tr><th>EMPNO<th>EMPNAME<TH>JOB<th>MGR<th>DOJ<th>SALARY<th>COMM<th>Department</tr>");
			   
			   
				   for(Emp e : emplist){
				out.println("<tr>");
				out.println("<td>"+e.getEmpno()+"</td>");
				out.println("<td>"+e.getEname()+"</td>");
				out.println("<td>"+e.getJob()+"</td>");
				out.println("<td>"+e.getMgr()+"</td>");
				out.println("<td>"+e.getHiredate()+"</td>");
				out.println("<td>"+e.getSal()+"</td>");
				out.println("<td>"+e.getComm()+"</td>");
				out.println("<td>"+e.getDeptno()+"</td>");
				out.println("</tr>");}
				out.println("</table>");

}

}
