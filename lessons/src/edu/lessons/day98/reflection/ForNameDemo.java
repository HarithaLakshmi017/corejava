package edu.lessons.day98.reflection;

public class ForNameDemo {
	public static void main (String [] args){
	    Actor hero= new Actor ();
	    hero.Name="VJS";
	    hero.city="Chennai";
	    String className="edu.lessons.day98.reflection.Actor";
	    try {
			Class firstclass=Class.forName(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
