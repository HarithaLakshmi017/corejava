package classandmethods;

public class Cartester {

	public static void testCar() {
		Car firstCar = Car();
		firstCar.setcolor("black");
		firstCar.setFuel("petrol");
		firstCar.setYearofpurchase(2022);
		System.out.println(firstCar.getRegno());
		System.out.println(firstCar.getcolor());
		System.out.println(firstCar.getfuel());
		System.out.println(firstCar.getYearOfPurchase());

	}

	private static Car Car() {
		// TODO Auto-generated method stub
		return null;
	}

}
