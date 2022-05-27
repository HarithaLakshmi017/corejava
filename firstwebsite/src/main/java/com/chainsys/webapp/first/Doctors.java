package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Doctordao;
import com.chainsys.miniproject.dao.*;
import com.chainsys.miniproject.pojo.*;

/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Doctors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee result = empIterator.next();
			out.println("<hr/>");//in emp
		
			out.println(result.getEmp_Id() +","  + result.getFirst_name() + "," + result.getLast_name() + ","
					+ result.getEmail() + "," + result.getHire_date() + "," + result.getJob_id() + ","
					+ result.getSalary() + "</p>" );
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("change").equals("Add")) {
			PrintWriter out = response.getWriter();
			try {
				Doctor newdoc = new Doctor();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();				
				}
				int docId = Integer.parseInt(id);
				newdoc.setDoc_id(Integer.parseInt(id));
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();				
				}			
				newdoc.setDoc_id(docId);
				String name = request.getParameter("name");
				try {
					Validator.checkStringOnly(name);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();				
				}
				newdoc.setDoc_name(name);
				SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String doc_HireDate = request.getParameter("date");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);

				try {
					Validator.checkDateFormat(doc_HireDate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				Date newDate = null;
				try {
					newDate = hire_dateFormate.parse(doc_HireDate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				try {
					Validator.CheckNofutureDate(newDate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}

				newdoc.setDob(newDate);
				String sp = request.getParameter("specilyst");
				try {
					Validator.checkStringOnly(sp);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setSpeciality(sp);			
				String cy = request.getParameter("city");
				try {
					Validator.checkStringOnly(cy);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setDoc_city(cy);
				String phone=request.getParameter("phone");
				try {
					Validator.checklengthOfPhno(phone);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				Long phone1=Long.parseLong(phone);
				newdoc.setPhone(phone1);
	            String fee=request.getParameter("fees");
				float fees = Float.parseFloat(fee);
				try {
					Validator.checkfee(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setStandard_fees(fees);
				int result = Doctordao.insertDoctor(newdoc);
			    out.println("Record added : " + result);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			}else if(request.getParameter("change").equals("update")) {
				doPut(request,response);
			}else if(request.getParameter("change").equals("Delete")) {
				doDelete(request,response);
			}
		}	
		protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
		try {
		Doctor newdoc = new Doctor();
			String id = request.getParameter("id");
			   try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				int docId = Integer.parseInt(id);
				newdoc.setDoc_id(docId);
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				Doctor doc = Doctordao.getDoctorById(docId);

				if (doc == null) {
					System.out.println("Doctor Doesn't Exist For Id " + docId);
					return;
				}
				newdoc.setDoc_id(docId);
				int result = Doctordao.deleteDoctor(Integer.parseInt(id));
				out.println("Deleted successfully "+result);
			} finally {
			}
		}
		

		protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			try {
				Doctor newdoc = new Doctor();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				int docId = Integer.parseInt(id);
				newdoc.setDoc_id(Integer.parseInt(id));
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				Doctor doc = Doctordao.getDoctorById(docId);
				if (doc == null) {
					System.out.println("Doctor Doesn't Exist For Id " + docId);
					return;
				}
				newdoc.setDoc_id(docId);
				String name = request.getParameter("name");
				try {
					Validator.checkStringOnly(name);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setDoc_name(name);
				SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String doc_HireDate = request.getParameter("date");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);

				try {
					Validator.checkDateFormat(doc_HireDate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				Date newDate = null;
				try {
					newDate = hire_dateFormate.parse(doc_HireDate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				try {
					Validator.CheckNofutureDate(newDate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoc.setDob(newDate);
				String sp = request.getParameter("specilyst");
				try {
					Validator.checkStringOnly(sp);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setSpeciality(sp);
				// newdoc.setSpeciality(sc.nextLine());
				String cy = request.getParameter("city");
				try {
					Validator.checkStringOnly(cy);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setDoc_city(cy);
				String phone=request.getParameter("phone");
				
				try {
					Validator.checklengthOfPhno(phone);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				Long phone1=Long.parseLong(phone);
				newdoc.setPhone(phone1);
				String feess= request.getParameter("fees");
				float fees =Float.parseFloat(feess);
				try {
					Validator.checkfee(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setStandard_fees(fees);
				int result = Doctordao.updateDoctor(newdoc);
				out.println("Update record "+result);
			} finally {
				
			}
		}

	
		
	}


