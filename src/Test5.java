class Parent2 {
	// 기본생성자 "부모생성자"
	Parent2() {
		System.out.println("부모생성자");
	}
	void parent2Prn() {
		System.out.println("Parent2 parent2Prn()");
	}
}

class Child2 extends Parent2 { // 상속 Parent2
	// 기본생성자 "자식생성자"
	Child2() {
		System.out.println("자식생성자");
	}
	void child2Prn() {
		System.out.println("Child2 child2Prn()");
	}
}

public class Test5 {
	public static void main(String[] args) {
		// Child2 객체 생성 c2
		Child2 c2 = new Child2();
		// 메서드 호출 parent2Prn() child2Prn()
		c2.parent2Prn();
		c2.child2Prn();
	}
}
