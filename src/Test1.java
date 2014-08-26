// 인터페이스 Movable
interface Movable {
	// 추상메서드 move(int x, int y) 리턴값없음
	void move(int x, int y);
}

// 클래스 SubClass
class Subclas implements Movable{
	// 메서드 오버라이딩 출력 x,y
	@Override
	public void move(int x, int y) {
		System.out.println(x+","+y);
	}
}

public class Test1 {
	public static void main(String[] args) {
		//SubClass생성 s 메서드 호출
		Subclas s = new Subclas();
		s.move(10, 20);
		
		Movable m = new Subclas(); // 부모 = 자식 업캐스팅
		m.move(100, 200);
	}
}
