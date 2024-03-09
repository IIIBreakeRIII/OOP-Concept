public class Car implements Vehicle {
    // Define the properties of the class

    @Override
    public void start() {
        System.out.println("The car is starting");
    }

    // Define the Function
    @Override
    public void moveForward() {
        System.out.println("The car is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The car is moving backward");
    }
}