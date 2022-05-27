package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

/**
 * Servlet implementation class InitParam
 */
public class RequestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost Called");
		response.setContentType("text/html");// we need give contentType
		PrintWriter out = response.getWriter();
		String str_name = (String)request.getParameter("Name");
		out.println("<div>"+str_name+"</div>");
		String str_company = (String)request.getParameter("Company");
		out.println("<div>"+str_company+"</div>");
		
		//Enumeration enu = getInitParameterNames(); //enumeration is like iterator
		//  while(enu.hasMoreElements())
		//    {
		//  		String init = (String)enu.nextElement();
		//  		out.println(init+" : " +getInitParameter(init)+"<br>");
		//  	}
	 out.println("inside");
	}
	}

