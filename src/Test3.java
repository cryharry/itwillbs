class Parent {
	void parentPrn() {
		System.out.println("부모클래스 parentPrn()");
	}
}

class Child extends Parent { // 상속 Parent
	// 메서드 오버라이딩 : 상속관계 부모의 메서드 재정의
	// alt+shift+s,v
	@Override
	void parentPrn() {
		super.parentPrn(); // 부모의 메서드호출
		System.out.println("자식클래스 parentPrn()");
	}

	void childPrn() {
		System.out.println("자식클래스 childPrn()");
	}
}

public class Test3 {
	public static void main(String[] args) {
		// 객체 생성 Child c
		Child c = new Child();
		// 메서드 호출 parentPrn()
		c.parentPrn();
		//			childPrn()
		c.childPrn();
	}
}
