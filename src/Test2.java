/*final*/ class FinalTest { // 상속 못하게 막아줌
	final int a = 10; // 멤버변수 값 변경 못하게 함  변수상수
	/*final*/ void prn() { // 메서드 오버라이딩 못하게 막아줌
		System.out.println("FinalTest prn()");
	}
}

class FinalTest2 extends FinalTest {// 상속 FinalTest
	// 메서드 오버라이딩
	@Override
	void prn() {
		// FinalTest2 prn()
		System.out.println("FinalTest2 prn()");
	}
}

public class Test2 {
	public static void main(String[] args) {
		// final 접근지정자 static final
		// 멤버변수 final : 수정 못하게 막아줌 => 변수상수
		// 메서드 final : 메서드오버라이딩 못하게 막아줌
		// 클래스 final : 상속 못하게 막아줌
		
		
		// FinalTest2 객체 생성 ft2
		FinalTest2 ft2 = new FinalTest2();
		// ft2.a = 100 수정
		// ft2.a = 100; final 수정시 상수로 바껴서 수정불가
		// 출력 a= 
		System.out.println("a="+ft2.a);
		// prn()
		ft2.prn();
	}
}
