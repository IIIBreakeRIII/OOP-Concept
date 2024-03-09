public class MotorBike extends Vehicle {

	boolean isRaceble;

	// Method Overriding -> Redifine the method of parent class
	@Override
	void moveForward() {
		System.out.println("MotorBike is moving forward");
	}
	
	public void stunt() {
		System.out.println("MotorBike is doing Stunt");
	}
}
