
public class Point {
	//멤버변수 정수형 x 정수형 y
	int x, y;
	//기본 생성자
	Point() {
		System.out.println("Point 기본생성자");
		// 초기값 할당
		x = 1; y = 1;
	}
	// x값 받는 생성자
	Point(int n_x) {
		x = n_x;
		y = 1;
	}
	// x,y값 받는 생성자
	Point(int n_x, int n_y) {
		x = n_x;
		y = n_y;
	}
	// x에 값넣기 매서드
	void setX(int n_x) {
		x = n_x;
	}
	// y에 값넣기 메서드
	void setY(int n_y) {
		y = n_y;
	}
	
	// x값 가져오기 메서드
	int getX() {
		return x;
	}
	
	// y값 가져오기 메서드
	int getY() {
		return y;
	}

	//메서드 prn() 출력   x,y
	void prn() {
		System.out.println("x: "+x+", y: "+y);
	}
}
