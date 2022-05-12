package Testsamplecode;

	public class Sample {
	

		public static void main(String[] args) {
		String s1 = "FIzzBuzz";
		boolean result = s1.matches("[a-zA-Z]+");
		System.out.println(s1);
		System.out.println(result);
		char[] nameAsCharacters=s1.toCharArray();
		int lengthOfCharArray=nameAsCharacters.length;
		if(lengthOfCharArray>=8)
		{
			System.out.println("Must be greater or to Equal to the given input");
			System.out.println("Length of your name is:" +lengthOfCharArray);
			return;
		}
		else
		{
			System.out.println("Not enough");
		}
		}
		}
		

 