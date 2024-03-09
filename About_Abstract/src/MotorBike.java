public class MotorBike implements Vehicle{

    @Override
    public void start() {
        System.out.println("The motorbike is starting");
    }

    @Override
    public void moveForward() {
        System.out.println("The motorbike is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The motorbike is moving backward");
    }
}
