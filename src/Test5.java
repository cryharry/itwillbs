class ExpTest {
	void a(int num) throws Exception { //예외처리를 메소드 호출할 때 사용
		System.out.println("num = " + num);
		if( num < 100) {
			//예외를 인위적 발생
			throw new Exception("num값이 100보다 작다.");
		}
	}
}

public class Test5 {
	public static void main(String[] args) {
		ExpTest ex = new ExpTest();
		System.out.println("프로그램 시작");
		// 메서드 호출
		try {
			ex.a(50);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
