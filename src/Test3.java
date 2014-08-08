import java.util.ArrayList;;
public class Test3 {
	public static void main(String[] args) {
		//접근지정자
		//public : 모두 접근 가능
		//protected : 같은 클래스 + 다른 클래스 같은 폴더 + 상속된 다른 클래스
		//생략(default) : 같은 클래스 + 다른 클래스 같은 폴더(패키지)
		//private : 클래스 내에서만 접근
		//데이터 은닉 : private 중요한 데이터 접근못하게함(데이터은닉)
		
		Point p = new Point();
		p.prn();
		//p.x = 10;  x에 접근지정자 private
		p.setX(10);
		//p.y = 20;
		p.setY(20);
		//System.out.println(p.x);
		System.out.println(p.getX());
		//System.out.println(p.y);
		System.out.println(p.getY());
		p.prn();
		
		// ArrayList + Generic 사용한 함수 호출
		int[] point = new int[2];
		for(int i=0; i<point.length; i++) {
			point[i] = addPoint(10, 20).get(i).getY();
			System.out.println("ArrayList al["+i+"]:"+point[i]);
		}
	}
	
	// ArrayList + Generic 활용한 Point(x,y)값 지정하고 return 값으로 돌려받기
	public static ArrayList<Point> addPoint(int ...num) {
		ArrayList<Point> al = new ArrayList<Point>();
		if(num.length <= 1) al.add(new Point(0,0));
		for(int i=0;i<num.length;i++){
			al.add(new Point(i, num[i]));
		}
		return al;
	}
}
