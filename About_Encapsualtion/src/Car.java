public class Car {

	// getter, setter methods
	
	private String model;
	private String color;
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	private void StartEngine() {
		System.out.println("Engine started");
	}

	private void moveForward() {
		System.out.println("Moving forward");
	}

	private void openWindow() {
		System.out.println("Window opened");
	}

	public void operate() {
		StartEngine();
		moveForward();
		openWindow();
	}
}
