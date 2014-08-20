class Parent { // 부모클래스 슈퍼super클래스
	void parentPrn() {
		System.out.println("Parent클래스 parnetPrn()메서드");
	}
}
// 자식클래스 서브sub클래스
class Child extends Parent { // Parent 상속
	void childPrn() {
		System.out.println("Child클래스 childPrn()메서드");
	}
}
// 손자클래스
class GrandChild extends Child { // Child 상속
	void grandPrn() {
		System.out.println("GrandChild클래스 grandPrn()메서드");
	}
}
public class Test2 {
	public static void main(String[] args) {
		// 손자클래스 부모,자식 메서드 호출
		GrandChild gc = new GrandChild();
		gc.grandPrn();
		gc.childPrn();
		gc.parentPrn();
		System.out.println("=============");
		// 자식클래스 부모메서드 자식메서드 호출
		Child c = new Child();
		c.childPrn();
		c.parentPrn();
		System.out.println("=============");
		// 부모클래스 부모메서드 호출
		Parent p = new Parent();
		p.parentPrn();
		//p.childPrn(); 자식의 메서드 호출못함
	}
}
