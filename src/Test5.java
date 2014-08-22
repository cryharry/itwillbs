interface IHello { //클래스 만들기 위한 틀
	// static final 멤버변수
	int RED = 1;
	public static final int BLUE = 2;
	// 추상메서드
	void sayHello();
	public abstract void sayGoodbye();
}

class ISubClass implements IHello { // 상속(구현) IHello
	@Override
	public void sayHello() {
		System.out.println("안녕");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("잘가");
	}
}

public class Test5 {
	public static void main(String[] args) {
		System.out.println(IHello.RED);
		//IHello.RED = 10;
		System.out.println(IHello.BLUE);
		//IHello.BLUE = 20;
		ISubClass i = new ISubClass();
		i.sayHello();
		i.sayGoodbye();
		//IHello i3 = new IHello(); 객체 생성 불가
		IHello i2 = new ISubClass(); // 업캐스팅 형태로 객체생성
		i2.sayHello();
		i2.sayGoodbye();
	}
}
