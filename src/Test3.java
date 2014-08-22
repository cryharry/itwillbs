abstract class AbstractClass { // 추상클래스
	abstract void Method1(); // 추상메서드 틀
	void Method2() {
		System.out.println("일반메서드");
	}
}

class SubClass extends AbstractClass { // 상속 추상클래스AbstractClass
	@Override
	void Method1() {
		System.out.println("Method1() 추상메서드 오버라이딩");
	}	
}

public class Test3 {
	public static void main(String[] args) {
		/* 클래스를 만들기 위한 틀, 설계도
		 * 객체 생성 불가 (부모 = 자식 업캐스팅형태로 사용)
		 추상클래스 : 클래스 => 접근지정자 abstract class...{} 일반메서드+추상메서드, 단일상속
					extends, 모든멤버변수, 미완성설계도
		
		 인터페이스 : 클래스아님 => 접근지정자 interface ...{} 추상메서드, 다중상속
				    implements, static final 멤버변수, 설게도
		*/
		
		// 객체 생성 불가 => 타클래스에 상속해서 사용
		// AbstractClass a = new AbstractClass();
		// 객체생성 SubClass
		SubClass sc = new SubClass();
		// 메서드 호출 Method1() Method2()
		sc.Method1();
		sc.Method2();
		
		AbstractClass a = new SubClass(); // 업캐스팅
		a.Method1();
		a.Method2();
	}
}
