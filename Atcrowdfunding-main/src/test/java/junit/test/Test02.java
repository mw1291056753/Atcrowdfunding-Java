package junit.test;

public class Test02 {

	public static void main(String[] args) {
		byte b = 10;
		test(b);
	}

	
    public static void test(byte b) { System.out.print("bbbb"); }
	

	public static void test(short s) {
		System.out.print("ssss");
	}

	public static void test(char c) {
		System.out.print("cccc");
	}

	public static void test(int i) {
		System.out.print("iiii");
	}
}
