package Testsamplecode;

public class CountTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="Tom and jerry are good friends";
		System.out.println(wordcount(s2) + " words");
	}
	public static int wordcount(String s2)
	{
	int count=0;
    char ch[]=new char[s2.length()];
    for(int i=0;i<s2.length();i++)
    {
    	ch[i]=s2.charAt(i);
    	if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))  || (ch[0]!=' ')&&(i==0))
   count++;
   }
    return count;
	}

}
