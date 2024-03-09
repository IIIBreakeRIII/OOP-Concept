public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.moveForward();
        car.moveBackward();

        MotorBike motorBike = new MotorBike();
        motorBike.start();
        motorBike.moveForward();
        motorBike.moveBackward();
    }
}
