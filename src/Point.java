
public class Point {
	// 멤버변수 정수형 x y
	private int x, y;
	// 기본 생성자
	public Point() {
		
	}
	// x, y 값을 받는 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// private 데이터은닉된 변수를 접근할 수 있는 통로 public 메서드
	// setter 메서드
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	// getter 메서드
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// prn() 출력 x,y
	void prn() {
		System.out.println(x+","+y);
	}
}
