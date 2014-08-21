class StaticTest {
	static int a = 10; // 클래스 단위 멤버변수(클래스변수)
	int b = 20;		   // 인스턴스 단위 멤버변수(인스턴스변수)
	static void sPrn() { // 클래스 메서드
		System.out.println("a=" +a); // 클래스 멤버변수만 사용가능
		//System.out.println("b=" +b);
	}
}

public class Test4 {
	public static void main(String[] args) {
		// static : 접근지정자 static final
		//        : 객체 생성없이 바로 멤버변수 메서드접근
		//        : 클래스 정의 생성 멤버변수 공통사용
		System.out.println("StaticTest.a=" +StaticTest.a);
		StaticTest.sPrn();
		StaticTest st = new StaticTest();
		System.out.println("st.a=" +st.a); // 10
		System.out.println("st.b=" +st.b); // 20
		//st.sPrn();
		st.a++;
		st.b++;
		
		StaticTest st2 = new StaticTest();
		System.out.println("st2.a=" +st2.a); // 11
		System.out.println("st2.b=" +st2.b); // 20
		//st2.sPrn();
		// Math m = new Math(); <=final 객체생성 오류
		System.out.println("원의면적:" +(5*5*Math.PI));
		System.out.println("절대값:" +Math.abs(-5));
	}
}
