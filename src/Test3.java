class MethodTest1 {
	//print(매개변수) 메서드
	void print(int a) {
		System.out.println(a);
	}
	void print(double a) {
		System.out.println(a);
	}
	void print(char a) {
		System.out.println(a);
	}
	void print(boolean a) {
		System.out.println(a);
	}
	void print(String a) {
		System.out.println(a);
	}
}

public class Test3 {
	public static void main(String[] args) {
		// 객체 생성 mt
		MethodTest1 mt = new MethodTest1();
		// 메서드 호출
		mt.print(10);
		mt.print(3.4);
		mt.print('A');
		mt.print(true);
		mt.print("안녕");
		
		// 메서드 오버로딩 : 같은 클래스 내에서 동일한 메서드 이름 => 매개변수 개수를 틀리게, 매개변수 형 틀리게
		System.out.println(4);
		System.out.println(4.5);
		System.out.println('A');
		System.out.println(false);
		System.out.println("문자열");
	}
}
