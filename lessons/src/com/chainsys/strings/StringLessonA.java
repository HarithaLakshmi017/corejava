package com.chainsys.strings;

public class StringLessonA {

	private static String stringInUppercase;


	
	public static void stringToCharArray()
	
	
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString=scanner.nextLine();
		scanner.close();
		int stringlength=firstString.length();
		System.out.println("Length"+stringlength);
		char[] data=firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("Length"+dataarraylength);
	}
		public static void stringToUpperLower()
		{
			java.util.Scanner scanner=new java.util.Scanner(System.in);
			System.out.println("Enter a WORD");
			String firstString=scanner.nextLine();
			scanner.close();
			System.out.println("toUpperCase=" +stringInUppercase);
			System.out.println("s1="+firstString);
			String stringInLowercase = firstString.toLowerCase();
			System.out.println("toLowerCase=" + stringInLowercase);
			System.out.println("s1="+ firstString);
			//substring
			//from the 4th char till end
			String substring = firstString.substring(3);
			System.out.println(substring);
			substring = firstString.substring(2,6);
			System.out.println(substring);
			String replacedstring = firstString.replace('a', 'e');
			System.out.println(replacedstring);
			boolean flag1 = firstString.equals(stringInUppercase);
		}
	
		
	
		
	
	
	public static void stringToCharArray1() {
		
		public static void stringToUpperLower11() {
			
			public static void stringToUpperLower1() {
				
				public static void testStringTrim() {
				public static void testSplit()
				{
					String firstString= "  Tom and jerry are good friends ";
					String trimmedString = firstString.trim();
					String[] data=trimmedString.split("");
					int count = data.length;
					System.out.println("Word count" + count);
					for (int index = 0; index < count; index++) {
						System.out.println(data[index]);
					}
 		
		}
	
			public static void testSplitDays() {
				String weekdays = "Mon;Tue;Wed;Thu;Fri;Sat;Sun";
				String[] data = weekdays.split(";");
				int count = data.length;
				
				
				
			}
			
			
	
			
	public static void reverse()
	{
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence="";
		try
		{
			sentence = scanner.nextLine();
		} finally {
			scanner.close();

		}
	  	int reversedString=sentence.length();
	  	while(reversedString>0)
	  	{
	  		  reversedString--;
	  	}
		}
		
		
		public static void verifyString(String s1) //verify and print
		{
			if(null==s1)
			{
				System.out.println("String is Null");
				return;
			}
			else
				System.out.println("String is NOT Null" + s1);
			if(!s1.isEmpty())
				System.out.println("\t Not Empty"+s1);
			else
				System.out.println("\t String is Empty");
			
			}
		}
			
			


