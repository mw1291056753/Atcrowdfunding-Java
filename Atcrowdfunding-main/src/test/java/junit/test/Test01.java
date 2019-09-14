package junit.test;

public class Test01 {
	public static void main(String[] args) {
		A a = new B();

		test(a);
	}

	public static void test(A a) {
		System.out.print("aaaa");
	}

	public static void test(B b) {
		System.out.print("aaaa");
	}

}

class A {

}

class B extends A {

}
