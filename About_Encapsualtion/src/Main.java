public class Main {
	public static void main(String[] args) {
		Car car = new Car("Toyota", "Red");
		Driver driver = new Driver("John", car);
		driver.drive();
	}
}
