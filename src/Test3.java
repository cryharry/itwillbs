import java.util.ArrayList;

// 클래스 Shape 도형 
class Shape { // 부모
	// 멤버변수 double res //면적저장공간
	double res;
	// 메서드 area() return res //면적 구하는 메서드
	double area() {
		return res;
	}
}
// 클래스 Circle 원 
class Circle extends Shape { // 상속 Shape
	// 멤버변수 정수형 r=5 반지름(r*r*3.14)
	int r = 5;
	// 메서드 오버라이딩 원면적
	double area() {
		return res = r*r*3.14;
	}
}
// 클래스 Rectangle 사각형 
class Rectangle extends Shape { // 상속 Shape
	// 멤버변수 정수형 width=10 height=10 (w*h)
	int width = 10, height = 10;
	// 메서드 오버라이딩 사각형면적
	double area() {
		return res = width*height;
	}
}
// 클래스 Triangle 삼각형 
class Triangle extends Shape { // 상속 Shape
	// 멤버변수 정수형 width=10 height=10 (w*h*1/2)
	int width = 10, height = 10;
	// 메서드 오버라이딩 삼각형면적
	double area() {
		return res = (width*height)*1/2;
	}
}

public class Test3 {
	public static void main(String[] args) {
		// 원 면적
		Circle c = new Circle();
		System.out.println(c.area());
		// 사각형 면적
		Rectangle rect = new Rectangle();
		System.out.println(rect.area());
		// 삼각형 면적
		Triangle tri = new Triangle();
		System.out.println(tri.area());
		System.out.println("============");
		Shape s;
		s = c; // 업캐스팅 : 메서드 오버라이딩 : 부모접근가능
		System.out.println(s.area());
		s = rect;
		System.out.println(s.area());
		s = tri;
		System.out.println(s.area());
		
		// 다운캐스팅
		ArrayList<Object> a = new ArrayList<Object>(); //Object 클래스 : 최상위부모클래스
		a.add("일");
		a.add("이");
		a.add(3);
		a.add(4.5);
		String str = (String)a.get(0); // 다운캐스팅
		System.out.println(str);
		
	}
}