package com.chainsys.datelessons;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class WorkingWithDate {


	public static void displayCurrentDate()
	{
		Calendar vCalender = Calendar.getInstance();
		Date date = vCalender.getTime();
		System.out.println(date);
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd");
		System.out.println(dateFormat.format(date));
	}
	public static void displayDOB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your DOB: (yyyy-mm-dd");
		String dob=sc.nextLine();
		sc.close();
		int year = Integer.parseInt(dob.substring(0, 4));
		int month = Integer.parseInt(dob.substring(5, 7))-1;
	
		int day = Integer.parseInt(dob.substring(8,10));
		System.out.println(year+"-"+month+"-"+day);
		
	}
   public static void simpleDateFormat() {
	
		int year = 0;
		int month = 0;
		int day = 0;
		// TODO Auto-generated method stub
		Calendar date = new GregorianCalendar(year,month,day);
		Date dob=date.getTime();
		SimpleDateFormat f1=new SimpleDateFormat("yyyy-mmm-dd");
		System.out.println("DOB"+f1.format(dob));
		// Retirement date
		date.add(Calendar.YEAR, 60);
		date.add(Calendar.MONTH, 1);
		date.set(Calendar.DAY_OF_MONTH, 1);
		date.add(Calendar.DATE, -1);
		System.out.println("DOB" + f1.format(date.getTime()));
		
	}

}


