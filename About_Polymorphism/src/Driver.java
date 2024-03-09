public class Driver {
	
	void drive(Car car) {
		car.moveForward();
		car.moveBackward();
	}

	void drive(MotorBike motorBike) {
		motorBike.moveForward();
		motorBike.moveBackward();
	}

	// 위와 같은 반복적인 메서드 구성을 피하기 위해 다음과 같이 구성 가능
	// drive의 매개변수로 인터페이스 타입이 참조되도록
	void drive(Vehicle vehicle) {
		vehicle.moveForward();
		vehicle.moveBackward();
	}
}
