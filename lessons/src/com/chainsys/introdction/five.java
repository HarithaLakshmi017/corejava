package com.chainsys.introdction;

public class five {

	public static void main(String[] args) {
           
           printTriangleB();
			}
			
				public static void printTriangleB() {
				
				int countA =0;
				for(countA =1;countA<=10;countA++)
				{
					for(int countB  =1;countB<countA;countB++)
					{
					System.out.println(".");
					
				}
					for(int countc =countA;countc>=1;countc--)
					System.out.println(countc);
				
				}
				System.out.println();
			}
		
	

	}


