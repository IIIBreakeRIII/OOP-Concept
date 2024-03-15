public class Driver {
	
	private String name;
	private Car car;

	public Driver(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void drive() {
		car.operate();
	}
}
