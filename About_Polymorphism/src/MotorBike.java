public class MotorBike implements Vehicle {

	public void start() {
		System.out.println("MotorBike is starting");
	}

	@Override
	public void moveForward() {
		System.out.println("MotorBike is moving forward");
	}

	@Override
	public void moveBackward() {
		System.out.println("MotorBike is moving backward");
	}
}
