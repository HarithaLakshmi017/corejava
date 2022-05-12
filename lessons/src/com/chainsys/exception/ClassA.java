package com.chainsys.exception
public class ClassA {
	public static void m1()
	public static void m2()
	public static void m3()
	
	public static void m4() throws Exception
	{
		Exception e1=new Exception("Error 1");
		Exception e2=new Exception("Error 2",e1);
		throw e2;
	}

}
