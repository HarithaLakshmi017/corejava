/**
 * 
 */
package com.chainsys.bankdetails;
/**
 * @author hari3105
 *
 */
public class Bank1 {
	public static int currentBalance;
	public static String customerName;
	public static int accountNumber;
	
	public static void deposit(int paramAmount) {
		currentBalance = currentBalance + paramAmount;
	}
	
	public static int withdraw1(int paramAmount) {
		currentBalance = currentBalance - paramAmount;
		return paramAmount;
}

	/**
	 * @param paramName 
	 * @param args
	 */
	public static void openAccount(String paramAmount, int paramAccountNumber, String paramName) {
		
		
		customerName = paramName;
		accountNumber = paramAccountNumber;
		


	}

}
