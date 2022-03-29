package printtest;

public class PrintTest {
	public static void printTest(String str) {
		System.out.println(str);
	}
	// 타입별 메소드 오버로딩
	public static void printTest(int i) {
		System.out.println(i);
	}
	public static void printTest(char c) {
		System.out.println(c);
	}
	public static void printTest(double d) {
		System.out.println(d);
	}
}
