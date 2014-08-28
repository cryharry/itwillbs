class MethodTest {
	void abs(int a) {
		if( a < 0 ) a = -a;
		System.out.println("절대값: " +a);
	}
	void abs(double a) {
		if( a < 0 ) a = -a;
		System.out.println("절대값: " +a);
	}
}

public class Test2 {
	public static void main(String[] args) {
		MethodTest m = new MethodTest();
		m.abs(-5);
		m.abs(-4.5);
	}
}
