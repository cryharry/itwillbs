class Point2DD {
	int x;
	int y;
	// 생성자 x y 받는 생성자
	Point2DD(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 출력 메서드 prn() x,y
	void prn() {
		System.out.println(x+","+y);
	}
}

class Point3DD extends Point2DD { // 상속 Point2DD
	int z;
	// 기본생성자
	Point3DD() {
		// 부모의 기본생성자호출
		// 기본생성자가 없으면 생성자지정
		// 부모의 생성자
		super(0,0);
	}
	// x y z 받는 생성자
	Point3DD(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	// 메서드 오버로딩 prn() x,y,z
	@Override
	void prn() {
		System.out.println(x+","+y+","+z);
	}
}

public class Test6 {
	public static void main(String[] args) {
		// Point3DD 객체 생성 p3
		Point3DD p3 = new Point3DD();
		p3.prn();
		p3 = new Point3DD(10, 20, 30);
		p3.prn();
	}
}
