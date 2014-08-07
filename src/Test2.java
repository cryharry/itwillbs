
public class Test2 {
	public static void main(String[] args) {
		Point p = new Point();
		p.prn();
		p.setX(10);
		p.setY(20);
		p.setZ(30);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.getZ());
		
		Point p2 = new Point(100, 200, 300);
		p2.prn();
	}
}
