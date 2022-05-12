package com.chainsys.introdction;

import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		checkUserName();
	}
	public static void checkUserName() 
	{
		
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter your Name");
	    String userName = sc.nextLine();
	    sc.close();
	    System.out.println("Name is " + userName);
	    char[] nameAsCharacters = userName.toCharArray();
	    int lengthofCharArray=nameAsCharacters.length;
	    System.out.println("Length of your name is: "+ lengthofCharArray);
	    for(int index=0;index<lengthofCharArray;index++)
	    
	    {
	       System.out.println(index +" " +nameAsCharacters[index]);
	    }
	}
	
	

}
