package com.chainsys.miniproject.test;

	import java.util.Calendar;
	import java.util.Iterator;
	import java.util.List;
	import com.chainsys.miniproject.dao.EmployeeDao;
	import com.chainsys.miniproject.pojo.Employee;

	public class testEmployeeDao {
	public static void testGetAllEmployees() {
	List<Employee> allEmployees = EmployeeDao.getAllEmployee();
	 Iterator<Employee> empIterator = allEmployees.iterator();
	 while(empIterator.hasNext()) {
	 Employee emp = empIterator.next();
	System.out.println(emp.getEmp_Id()+ " " + emp.getFirst_name()+" " + emp.getSalary());
	            }
	     }
	public static void testGetEmployeeById() {
	Employee emp = EmployeeDao.getEmployeeById(125);
	System.out.println(emp.getEmp_Id()+ " " + emp.getFirst_name()+" " + emp.getSalary());
	         
	     }
	public static void testInsertEmployee() {
	Employee newemp = new Employee();
	newemp.setEmp_Id(300);
	newemp.setFirst_name("Thaitheyasudan");
	newemp.setLast_name("sudan");
	newemp.setEmail("sudan25092007@gmail.com");
	Calendar c1 = Calendar.getInstance();
	java.util.Date newDate = c1.getTime();
	newemp.setHire_date(newDate);
	newemp.setJob_id("IT_PROG");
	newemp.setSalary(70000);
	int result = EmployeeDao.insertEmployee(newemp);
	System.out.println(result);
	     }
	public static void testUpdateEmployee() {
	Employee oldemp = EmployeeDao.getEmployeeById(125);
	System.out.println(oldemp.getEmp_Id()+ " " + oldemp.getFirst_name()+" " + oldemp.getSalary());
	oldemp.setFirst_name("Rishya");
	oldemp.setLast_name("sirungier");
	oldemp.setEmail("rishya123@gmail.com");
	Calendar c1 = Calendar.getInstance();
	java.util.Date newDate = c1.getTime();
	oldemp.setHire_date(newDate);
	oldemp.setJob_id("IT_PROG");
	oldemp.setSalary(70000);
	int result = EmployeeDao.updateEmployee(oldemp);
	System.out.println(result);
	     }
	public static void testDeleteEmployee() {
		int result = EmployeeDao.deleteEmployee(300);
	System.out.println(result);
	     }
	}



