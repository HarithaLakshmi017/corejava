package Testsamplecode;

public class Threedigitnumber {

	public static void main(String[] args) {
		Threedigitnumber();
	}
	public static void Threedigitnumber()
	{
		int h,a,r,i=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		h=sc.nextInt();
		r=h;
		while(h>0)
		{
			a=h%10;
			i=i+(a*a*a);
			h=h/10;
		}
		if(i==r)
		{
			System.out.println("same as input");
		}
		else
		{
			System.out.println("Different number");
		}
	}
		
		

	}


