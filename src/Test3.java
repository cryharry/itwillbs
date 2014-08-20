// Point2D 클래스
class Point2D {	
	// 멤버변수 x, y
	int x, y;
	// 메서드 prn2D() 출력 x, y
	void prn2D() {
		System.out.println(x+","+y);
	}
}
// Point3D 클래스 Point2D 상속
class Point3D extends Point2D {	
	// 멤버변수 z
	int z;
	// 메서드 prn3D() 출력 x, y, z
	void prn3D() {
		System.out.println(x+","+y+","+z);
	}
}

public class Test3 {
	public static void main(String[] args) {
		// Point3D 객체 생성
		Point3D p3d = new Point3D();
		// x = 10, y = 20, z = 30;
		p3d.x = 10; p3d.y = 20; p3d.z = 30;
		// 메서드 호출 prn2D() prn3D()
		p3d.prn2D();
		p3d.prn3D();
	}
}
