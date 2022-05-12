package com.chainsys.Interface;

public class TestCalculator {
	 public static void main(String[] args) {
		 Calculator cal= new Calculator();
		 int A=cal.add(10, 5);
		 System.out.println(A);
		 A = cal.multiply (10, 5);
		 System.out.println(A);
		 A=cal.divide (10, 5);
		 System.out.println(A);
		 }

}
