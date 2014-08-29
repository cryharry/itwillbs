
public class Test2 {
	public static void main(String[] args) {
		int a = 10, b1 = 0, b2 = 2, c = 10;
		try {
			// 정상구간
			c = a/b2;
			System.out.println("c => " + c);
			
			// 예외가 발생할 것 같은 구문
			c = a/b1;
			System.out.println("c => " + c);
		} catch(ArithmeticException e) {
			System.out.println("수학관련예외발생: "+e.toString());
		} catch(RuntimeException e){
			System.out.println("런타임예외발생");
		} catch(Exception e) {
			System.out.println("예외발생");
		} finally {
			System.out.println("예외발생여부 상관없이 정리작업");
		}
		System.out.println("정상종료");
	}
}
