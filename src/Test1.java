
public class Test1 {
	public static void main(String[] args) {
		// 객체 생성
		Point p = new Point(); //생성자 호출 : 기억장소 할당, 초기값 할당
		System.out.println(p.x);
		System.out.println(p.y);
		p.prn();
		p.x = 10;
		p.y = 20;
		p.prn();
		
		// x 100 y 200
		System.out.println("set 메서드 호출 후");
		p.setX(100); // p.x = 100;
		p.setY(200); // p.y = 200;
		p.prn();
		
		System.out.println("get 메서드 호출 후");
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Point p2 = new Point(1000);
		p2.prn();
		
		Point p3 = new Point(10000, 20000);
		p3.prn();
	}
}
