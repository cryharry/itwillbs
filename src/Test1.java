class Tree { //클래스 : 객체 정의, 설계
	//멤버변수
	String name; // 나무 이름
	int age; // 나무 나이
	//메소드(함수)
	void prn() {
		System.out.println("바람에 흔들린다.");
	}
}


public class Test1 { // 객체 정의
	// 멤버변수+메소드(함수) => 클래스
	public static void main(String[] args) { // 시작함수
		/* 변수(한개의 기억장소) -> 배열(같은 형 기억장소 여러개) -> 구조체(다른형 기억장소 여러개 -> 클래스(구조체 + 함수)
			클래스 : 객체 정의( 멤버변수 + 메소드)
			객체(인스턴스) : 생성(기억장소확보,초기값) , 사용
			클래스			객체
			-제품설계도		-제품
			-TV설계도			-TV
			-붕어빵기계		-붕어빵
		*/
		
		// 클래스 사용 -> 객체 생성(기억장소할당,초기값할당)
		int a; // 변수 선언
		a = 0;
		int b[]; // 배열선언
		b = new int[5];
		Tree t; // 클래스 선언
		t = new Tree(); // 객체 생성(생성자호출) 기억장소 할당
		// [t : 주소, 참조변수, 레퍼런스변수] [. : 참조연산자]
		System.out.println(t.name);
		System.out.println(t.age);

		t.name = "소나무";
		t.age = 100;
		System.out.println(t.name);
		System.out.println(t.age);
		t.prn();
		
		Tree t2 = new Tree();
		t2.name = "대나무";
		t2.age = 10;
		System.out.println(t2.name);
		System.out.println(t2.age);
		t2.prn();
		
	}//메인메소드
}//클래스
