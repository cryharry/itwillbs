
public class Test1 {
	public static void main(String[] args) {
		// 예외 : 프로그램 실행동안 예기치 않은 에러
		// 예외처리
		int a = 10, b1 = 0, b2 = 2, c = 10;
		c = a / b2; // 10/2 => 5
		System.out.println("c=>" + c);
		if(b1 == 0) {
			System.out.println("예외발생");
		} else {
			c = a/b1;  // 10/0 => 0으로 나눔 예외발생
		}
		System.out.println("c=>" + c);
		System.out.println("정상종료");
	}
}
