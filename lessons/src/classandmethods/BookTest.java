package classandmethods;

/**
 * 
 * @author hari3105
 
 */


public class BookTest {
	/**
	 * @param args
	 */

	public static void testbook() {
		book firstBook=new book();
		firstBook.setAuthor("j.k. rowling");
		firstBook.setTitle("harry potter");
		firstBook.setLanguage("English");
		firstBook.setyearofpublish("1997");
		firstBook.setPrice("210");
		System.out.println(firstBook.getAuthor());
		System.out.println(firstBook.getTitle());
		System.out.println(firstBook.getLanguage());
		System.out.println(firstBook.getYearofpublish());
}

}
