package com.chainsys.bankdetails;

public class Banktest1 {

	public static void testDeposit() {
		System.out.println("Before Balance " + Bank1.currentBalance);
		Bank1.deposit(60000);
		System.out.println("After Balance " + Bank1.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank1.currentBalance);
		int withdraw = Bank1.withdraw1(7000);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Bank1.currentBalance);
	}

	public static void testOpenaccount() {
		Bank1.openAccount("haritha", 879056789, null);
		System.out.println(Bank1.customerName);
		System.out.println(Bank1.accountNumber);

	}
}

