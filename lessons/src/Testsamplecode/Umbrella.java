package Testsamplecode;

import java.util.Scanner;

 public class Umbrella {

	         public static void main(String[] args) {
	                 // TODO Auto-generated method stub
	         temp();
	         //thingsrequired();
	          
	         }
	         
	         public static void temp()
	         {
	                 Scanner s2=new Scanner(System.in);
	                 System.out.println("Enter raining or Not");
	                 String temp=s2.nextLine();
	                 s2.close();
	             System.out.println("get an Umbrella");
	            
	         }
	         public static void thingsrequired()
	         {
	                 Scanner s1=new Scanner(System.in);
	                 System.out.println("Enter a Temperature");
	                 double degree=s1.nextDouble();
	                 s1.close();
	                 
	                 if(degree<32)
	         {
	                 System.out.println("To Bring Heavy Jacket");
	         }
	         else if(degree>=32 && degree<=50)
	         {
	          System.out.println("To bring Light Jacket");        
	         }
	         else 
	         {
	                 System.out.println("No Jacket");
	         }
	                         
	         }
	 }