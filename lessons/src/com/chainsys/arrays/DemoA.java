package com.chainsys.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DemoA {
	public static void CreatingSingleDimensionInArrays()
	{
		int firstintArray[]=new int[10];
		
 int lengthofnumbers=firstintArray.length;
 System.out.println(lengthofnumbers);
 for(int x:firstintArray)
	{
	 System.out.println(x+",");
	}
		
		
		}
		
	//public static void creatingDimensionArray()
	//public static void creatingintArrays()
	public static void creatingAnotherArray()
	{
		int days[];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size for days");
		int size=scanner.nextInt();
		scanner.close();
		days=new int[size];
		int lengthofday=days.length;
		System.out.println("no of days" +lengthofday);
		
	}


public static void CreateMonthArray()
{
	int month[]= new int[12];
	int lengthofmontharray= month.length;
	System.out.println("Array length is"+lengthofmontharray);
	for(int i=0; i<lengthofmontharray; i++) 
	{
	System.out.println(i+"_"+month[i]+",");
}
	System.out.println();
	month[1]=31;
	for(int i=0; i<lengthofmontharray; i++)
	{
		System.out.println(i+"_"+month[i]+",");
		
	}
	try {
		month[12]=31;
		month[11]=31;
		System.out.println("Hi....");
	}
	catch(Exception err) {
		System.out.println("ERROR!!!" +err.getMessage());
	}
}
public static void WorkingwithArrays()
{
	int numberArray[]= new int[10];
	//int numArray[]= {2,4,6,8,9};
	for (int i=0; i<10; i++)
	{
		numberArray[i]=-3*i;
	System.out.println("original Contents:");
	int lengthofthearray = numberArray.length;
	System.out.println("Array Length is:" + lengthofthearray);
	for(int i1=0;i1<lengthofthearray;i1++)
	{
		System.out.println(numberArray[i]+ " ");
		
	}
	System.out.println();
	Arrays.sort(numberArray);
	System.out.println("sorted:");
	for (int j=0; j<lengthofthearray; j++) {
		System.out.println(numberArray[i]+"");
	}
	System.out.println(numberArray[i]+"");
	}
}

public static void WorkingwithcharArray()
{
	String s1= "Today is a very hot day";
	char[] data = s1.toCharArray();
	int count = data.length;
	System.out.println("Array length"+ count);
	for(int i=0; i<count; i++)
	{
		System.out.println(data[i]+" "+(int)data[i]);
	}
}

public static void bubbleSort()
{
int[]  nos= {11,23,4,56,32,43,323,76,8,54,56};
System.out.println("Original Values Before");
for (int index=0; index< nos.length; index++)
{
	System.out.println(nos [index]+ ",");
}
System.out.println();
int count= nos.length;
int temp = 0;
for(int i=0; i<count; i++)
{
	for(int j=0;j<(count-1); j++)
	{
		if(nos[j+1]<nos[j])
		{
			temp= nos[j];
			nos[j]=nos[j+1];
			nos[j+1]=temp;
			temp=0;
		}
	}
}


System.out.println("Values after SORT");
for(int index=0; index<nos.length; index++)
{
	//String[] nos;
	System.out.println(nos[index]+ ",");
}
}
}


	


	



		
	
	
		
		
	


	
	
