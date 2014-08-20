class Point2D {
	int x;
	int y;
	// 출력메서드 prn() x,y
	void prn() {
		System.out.println(x+","+y);
	}
}

class Point3D extends Point2D { // 상속 Point2D
	int z;
	// 메서드 오버라이딩 prn() x,y,z
	@Override
	void prn() {
		super.prn(); // 부모메서드 호출
		System.out.println(super.x+","+super.y+","+this.z);
	}
	
}

public class Test4 {
	public static void main(String[] args) {
		// Point3D 객체 생성 p
		Point3D p = new Point3D();
		// x 10 y 20 z 30
		p.x = 10; p.y = 20; p.z = 30;
		// 메서드 호출 prn()
		p.prn();
	}
}
