package package2;

import package1.SuperClass;

class SubClass extends SuperClass {
	public void printEach() {
		// System.out.println(a); -> private으로 선언, 에러 발생
		// System.out.println(b); -> default로 선언, 에러 발생
		System.out.println(c);
		System.out.println(d);
	}
}

public class Test2 {
	public static void main(String[] args) {
		SuperClass parent = new SuperClass();
		SubClass subClass = new SubClass();
		
		// public을 제외한 모든 호출 에러
		// System.out.println(parent.a);
		// System.out.println(parent.b);
		// System.out.println(parent.c);
		System.out.println(parent.d);
		System.out.println("--------------------");
		subClass.printEach();
	}
}
