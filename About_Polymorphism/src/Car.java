public class Car implements Vehicle {
	// implements = 상속의 개념은 같지만,
	// extends는 부모의 메서드를 그대로 사용할 수도, 변경도 가능하다
	// 하지만 implements는 부모의 메서드를 반드시 오버라이딩해야 한다.

	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void moveForward() {
		System.out.println("Car is moving forward");
	}

	@Override
	public void moveBackward() {
		System.out.println("Car is moving backward");
	}
}
