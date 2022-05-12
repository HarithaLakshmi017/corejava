package com.cainsys.variables;


import com.lessons.Demo;

/**
 * 
 * @author hari3105
 *
 */

public class VariableTester {

/**
 * @param args
 */
	public static void testGlobalVariables()
	{
		System.out.println("DataA:" + Demo.DataA);
		System.out.println("DataC: " + Demo.DataC);
		
		Demo.DataA=2345;
		System.out.println("DataA:" + Demo.DataC);
		Demo.DataA=2345;
		System.out.println("DataA:" + Demo.DataA);
	}
	


	 public static void testImmutablevariable()
	   {
		   /* Cannot make a static reference to the non-static field Demo.DataB
		   // Demo.DataB = 123;
		    /**
		     * first create an object for the class
		     * pass an int value as an argument to the constructor
		     * access the immmutable instance field using the object reference
		     * */ 
		     Demo firstObject=new Demo(123);
		     System.out.println(firstObject.DataB);
		     /**
		      * Value assigned to an immutable field can not be changed
		      * value for the immutable field can be assigned only through the constructor 
		    **/
		     firstObject.DataB
	   }











   public static void testNonStaticMethod()
   {
	   
	   //ERROR
	   //Demo.greetUser();
	   demo firstObject=new demo(111);
	   // call the non static method
	   firstObject.greetUser();
   }
   public static void testcalculaor()
   {
	   System.out.println(calculaor.add(3,6));
       System.out.println(calculaor.multiply(3,6));
       System.out.println(calculaor.subtract(9,6));
       System.out.println(calculaor.divide(18,6));
   }	
}
