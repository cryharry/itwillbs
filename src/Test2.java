
public class Test2 {
	// hello 함수
	public static void hello() {
		System.out.println("Hello Java");
	}
	// sum(10+20) 함수
	public static void sum(int x, int y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	// abs(-5) 함수
	public static int abs(int a) {
		if(a < 0) a *= -1; // a = -a;
		return a;
	}
	// max(10,20) 함수
	public static int max(int x, int y) {
		if(x < y) x = y;
		return x;
	}
	// sum2(10) 함수
	public static int sum2(int x) {
		int y = 0;
		for(int i=1; i<=x; i++) {
			y += i;
		}
		return y;
	}
		public static void main(String[] args) {
		//hello() 호출 출력 "Hello JAVA"
		hello();
		//sum(10,20) void(리턴값 없이 출력 10+20=30)
		sum(10,20);
		//abs(-5) return 절대값 구한 결과
		System.out.println("-5의 절대값: " +abs(-5));
		//max(10,20) return 최대값 구하기
		System.out.println("10,20 중 최대값: " +max(10,20));
		//sum2(10) 1~10까지의 합 구해서 return
		System.out.println("1~10까지의 합: " +sum2(10));
				
	}//메인메소드
}//클래스
