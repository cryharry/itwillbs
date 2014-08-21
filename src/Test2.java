class Parent {
	void parentPrn() {
		System.out.println("Parent parentPrn()");
	}
}

class Child extends Parent { // 상속 Parent
	void childPrn() {
		System.out.println("Child childPrn()");
	}
}

public class Test2 {
	public static void main(String[] args) {
		// 자료형 형변환
		double d = 3; // int => double 자동형변환
		System.out.println(d);
		int a = (int)3.4;
		System.out.println(a); // double => int 명시적형변환
		// 참조형(레퍼런스) 형변환
		// 업캐스팅 : 부모형 형변환 자동형변환
		Parent p;
		Child c = new Child();
		c.parentPrn();
		c.childPrn();
		p = c; // 부모참조변수 = 자식참조변수 : 업캐스팅 : 자동형변환 => 다형성
		p.parentPrn();
		// p.childPrn(); 자식접근못함
		System.out.println("==================");
		// 다운캐스팅 : 자식형 형변환 명시적형변환
		Parent p2 = new Child(); // 업캐스팅
		p2.parentPrn();
		//p2.childPrn();
		Child c2;
		c2 = (Child)p2; //자식참조변수 = 부모참조변수 : 다운캐스팅 : 명시적형변환
		c2.parentPrn();
		c2.childPrn();
		
	}
}
