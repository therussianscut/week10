/**
 * 
 */

/**
 * @author sean_
 *
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1= new Car("Ford", "Fiesta", "Blue", 4, 1.2, 110);
		Car car2= new Car("Peugeot", "308", "Silver", 4, 1.8, 130);
		Car car3= new Car("Ferrari", "F4", "Red", 2, 2.8, 230);
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		
		car1.startCar();
		car1.startCar();
		car1.stopCar();
		car1.stopCar();

	}

}
