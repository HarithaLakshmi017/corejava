package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUI;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {
	public static void main(String[] args) throws Exception {
		//loadMenu();
		EmployeeUi.addNewEmployee();
}

	private static void loadMenu() {
	 System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
	java.util.Scanner sc = new java.util.Scanner(System.in);
	 try {
	int call = sc.nextInt();
	switch (call) {
 case 1:
	 loadMenu();
 break;
 case 2:
	loadMenu();
	break;
 case 3:
	loadAppointmentMenu1();
	break;
 }
 }finally {
 sc.close();
}
}
private static void loadEmployeeMenu() {
System.out.println("Enter Employee Method : 1=addEmployee, 2=updateEmployee");

java.util.Scanner sc = new java.util.Scanner(System.in);
try {
int call = sc.nextInt();

switch (call) {
case 1:
EmployeeUi.addNewEmployee();
break;
case 2:
EmployeeUi.updateEmployee();
break;
}
} finally {
	sc.close();
	}
	}

	private static void loadDoctorMenu() {
	System.out.println("Enter Doctor Method : 1=addNewDoctor,2=updateDoctor , 3=deleteDoctor ");
	java.util.Scanner sc = new java.util.Scanner(System.in);
	try {
	int call = sc.nextInt();
	switch (call) {
	case 1:
	DoctorUI.addNewDoctor();
	break;
	case 2:
	DoctorUI.updateDoctor();
	break;
	case 3:
	DoctorUI.deleteDoctor();
	break;

	}
	}
	finally 
	{
    sc.close();
	}
	}
	private static void loadAppointmentMenu1() {
	 System.out.println("Enter Method : 1=addNewAppointment , 2=updateAppointment, 3=deleteAppointment");
	 java.util.Scanner sc = new java.util.Scanner(System.in);
	try {
	int op = sc.nextInt();
	switch (op) {
    case 1:
	AppointmentUi.addNewAppointment();
	break;
	case 2:
	AppointmentUi.updateAppointment();
	break;	
	    case 3:
		AppointmentUi.deleteAppointment();
		break;
	
	}
}
finally {
	sc.close();
}
	}
private static void loadAppointmentMenu() {
		// TODO Auto-generated method stub

}

}
