package edu.lessons.threads;  // youtube 


	class harry {

	public void show()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("harry");
		}
		try {
			Thread.sleep(1000); //used for suspending the code
	}
		catch(Exception e) {}
		}
		
		}
	


class haritha 
{
	public void show()
	{
		for(int i=1;1<=5;i++)
		{
			System.out.println("haritha");
		}
			try {
				Thread.sleep(1000); //used for suspending the code
			}
			catch(Exception e) {
		}
	}

public class Demothread
{
	public static void main(String[] args)
	{
		harry obj1 = new harry();
		haritha obj2 = new haritha();
		
		obj1.show();
		obj2.show();
	}


