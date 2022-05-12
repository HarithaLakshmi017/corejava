package com.chainsys.introdction;

import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		findEvenNumbers();

	}
	public static void findEvenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 digit Number");
		long value=sc.nextLong();
		sc.close();
		long num=value;
		long remainder=0;
		while(num>0)
		{
			remainder=num%10;
			if(remainder%2==0)
			{
				System.out.println(remainder);
			}
			num=num/10;
	}

	}
}
