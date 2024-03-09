public class Main {
	public static void main(String[] args) {

		// 다형성을 활용한 객체 생성 방식
		// 상위클래스 타입의 참조변수로 하위클래스 객체를 참조하는 것
		Vehicle car = new Car();

		// 아래와 같이 배열로 여러 종류의 객체를 다룰 수 있음
		Vehicle vehicles[] = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new MotorBike();

		for(Vehicle vehicle : vehicles) {
			// 각각의 클래스를 호출해줌
			System.out.println(vehicle.getClass());
		}

		System.out.println("--------------------");

		Car car2 = new Car();
		MotorBike motorBike2 = new MotorBike();
		Driver driver = new Driver();

		driver.drive(car2);
		driver.drive(motorBike2);
	}
}
