package Testsamplecode;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++)
		{
			if(i%3==0)
			{
				System.out.println("Multiples of Three" + " - " + i + " = Fizz");
			}
			if(i%5==0)
			{
				System.out.println("Multiples of Five" + " - " + i +" = Buzz");
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println("Multiples of Three & Five" + " - " + i +" = FizzBuzz");
			}
			}

	}

}
