
public class Test2 {
	// hello 함수
	public static void hello() {
		System.out.println("Hello Java");
	}
	// sum(10+20) 함수
	public static int sum(int a, int b) {
		System.out.print(a+"+"+b+"=");
		return a+b;
	}
	// abs(-5) 함수
	public static int abs(int a) {
		if(a < 0) a *= -1;
		return a;
	}
	
	public static void main(String[] args) {
		//hello() 호출 출력 "Hello JAVA"
		hello();
		//sum(10,20) 출력 10+20=30
		System.out.println(sum(10,20));
		//abs(-5) return 절대값 구한 결과
		System.out.println("-5의 절대값: "+abs(-5));
		
	}//메인메소드
}//클래스
