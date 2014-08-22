abstract class Shape { // 추상클래스 Shape
	// 추상메서드 void draw()
	abstract void draw();
}

// 클래스 Cir 상속 Shape 메서드오버라이딩 출력 "원을 그린다"
class Cir extends Shape {
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}
// 클래스 Rec 상속 Shape "사각형을 그린다"
class Rec extends Shape {
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}
// 클래스 Tri 상속 Shape "삼각형을 그린다"
class Tri extends Shape {
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

public class Test4 {
	public static void main(String[] args) {
		// 추상클래스 업캐스팅 => 다형성
		Shape s;
		s = new Cir();
		s.draw();
		s = new Rec();
		s.draw();
		s = new Tri();
		s.draw();
	}
}