public interface Vehicle {
    // Definition of the Interface
    // 추상 메소드 혹은 상수를 통해 어떤 객체가 수행해야하는 핵심적인 역할만을 규정,
    // 실제적인 구현은 해당 인터페이스를 구현하는 각각의 객체들에서 하도록 프로그램을 설계하는 것
    void start();
    void moveForward();
    void moveBackward();
}
