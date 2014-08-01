
public class Test1 {
	/*-------- 사용자 정의 함수 -----------
	접근지정자(public) 리턴할 데이터형(void,int,String......) 함수이름([매개변수],[매개변수2]....) {
 		함수가 처리하는 명령
		return 값;
	}사용자 함수끝
	----------------------------------*/
	public static void printStar() { //별표 찍어줄 사용자 함수
		System.out.println("********");
	} //별표 사용자 함수 끝
	
	public static void printStar2(int a) {
		for( int i=0; i<a; i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static String printStar3() {
		System.out.println("**star3**");
		return "star3 출력";
	}
	
	public static char printStar4(int a, int b) {
		System.out.print("a*b의 갯수: ");
		for(int i=0; i<a*b; i++) System.out.print("*");
		System.out.println();
		return 'A';
	}
	// 메인함수(메인메소드)
	public static void main(String[] args) {
		// 함수(메서드) : 자주 사용되는 명령 정의해 놓고 필요시 호출하여 사용
		printStar2(20);
		System.out.println("슈퍼맨");
		printStar();
		System.out.println("배트맨");
		printStar2(20);
		System.out.println("X-맨");
		System.out.println(printStar3());
		System.out.println(printStar4(3, 10));
		
	}//메인메서드
}//클래스
