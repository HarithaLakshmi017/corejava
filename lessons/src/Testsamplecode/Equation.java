package Testsamplecode;
import java.math.*;
import java.util.Scanner;
public class Equation {

	public static void main(String[] args) {
		
		solvingEquation();
	}
	public static void solvingEquation()
	{
	Scanner sc=new Scanner(System.in);
	int a=0;
	System.out.println("Enter a number 5 to 10:");
	a=sc.nextInt();
	sc.close();
	int x=a;
	int y=(2*(x*x))+x+5;
	System.out.println(y+"");
	

	}

}
