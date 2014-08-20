package packTest.packOne;

public class AccessTest {
	// 접근지정자 멤버변수 정수형 a b c d
	private int a = 10; // 같은 클래스
	int b = 20; // 같은 클래스 + 같은 폴더
	protected int c = 30; // 같은 클래스 + 같은 폴더 + 다른 폴더 상속관걔
	public int d = 40; // 모두 접근 가능
	
	public void prn() {
		System.out.println("AccessTest prn()");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}
