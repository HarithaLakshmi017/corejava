package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class AttributesDemo
 */
public class AttributesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AttributesDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public String salary = null;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		 response.setContentType("text/html");
		 out.println("<html><head><title>Attributes</title></head><body>");
		 String SubmitValue = request.getParameter("submit");
		 HttpSession session =request.getSession(true);
		 System.out.println(session.getId());
		 if (SubmitValue.equals("Set")) {
		 String SalaryInput = request.getParameter("salary");
		 session.setAttribute("salary", SalaryInput);
		// salary = SalaryInput;
		// salary = SalaryInput = request.getParameter("Salary");
		// salary = SalaryInput;
		 out.println("<h1>Value Set</h1>"+ SalaryInput);
		 } else if(SubmitValue.equals("fetch")){
			 String sessionSalary = session.getAttribute("salary").toString();
			// String sessionSalary = (String) session.getAttribute("Salary");
			 out.println("<h1> Value  Set</h1>" + salary);
		 } else if (SubmitValue.equals("fetch")) {
			 String sessionSalary = (String) session.getAttribute("salary");
			 out.print("<h1>Value Fetched</h1>" + sessionSalary);
		 }
		 		out.println("</body></html>");
			}

}
