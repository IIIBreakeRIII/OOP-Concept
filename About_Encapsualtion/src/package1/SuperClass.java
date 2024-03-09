package package1;

// Test 클래스의 접근 제어자는 default
class Test {
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();

		// parent.a => 동일 클래스가 아니기에 에러가 발생
		// System.out.prinln(parent.a);
		System.out.println(superClass.b);
		System.out.println(superClass.c);
		System.out.println(superClass.d);
	}
}

public class SuperClass {
	
	// private, default, protected, public
	private int a = 1;
	int b = 2;
	protected int c = 3;
	public int d = 4;

	public void printEach() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
