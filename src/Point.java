
public class Point {
	// 멤버변수 정수형 x y z
	int x, y, z;
	// 기본 생성자 => x y z를 받는 생성자 호출 1 1 1
	Point() {
		
	}
	Point(int x) {
		this(1, 1, 1);
	}
	
	// x y z 받는 생성자
	Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//setX() setY() setZ()
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}
	void setZ(int z) {
		this.z = z;
	}
	//getX() getY() getZ()
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	int getZ() {
		return z;
	}
	//prn() x,y,z
	void prn() {
		System.out.println(x+","+y+","+z);
	}
}
