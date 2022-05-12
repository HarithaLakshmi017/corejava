package com.chainsys.strings;

public class Samplestring {
	public static void verifyString(String s1) //verify and print
	{
		if(null==s1)
		{
			System.out.println("String is Null");
			return;
		}
		else
			System.out.println("String is NOT Null" + s1);
		if(!s1.isEmpty())
			System.out.println("\t Not Empty"+s1);
		else
			System.out.println("\t String is Empty");
		
		}
	}
		
		


