public class Main {
    public static void main(String[] args) {

			// Create an object of Car and MotorBike
			Car car = new Car();
			MotorBike motorBike = new MotorBike();

			// Call the Properties of Car
			car.model = "AUDI";
			car.color = "White";
			car.wheels = 4;

			System.out.println("Car Model: " + car.model);
			System.out.println("Car Color: " + car.color);
			System.out.println("Car Wheels: " + car.wheels);

			// Call the function of Object
			car.moveForward();
			car.moveBackward();
			// motorBike.moverForward is override in MotorBike class
			motorBike.moveForward();
			// motorBike.moveBackward is inherited from Vehicle class
			motorBike.moveBackward();
			motorBike.stunt();
    }
}
