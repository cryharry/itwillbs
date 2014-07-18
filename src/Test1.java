
public class Test1 {
	public static void main(String[] args) {
		// 상수 : 변하지 않는 값	5	3.7	'A'		true	"문자열"
		// 변수 : 기억장소(변하는 값) <크기지정 자료형>
		// 변수선언
		int a; // 4byte 크기의 기억장소 확보 이름 a로 정함.
		a = 5; // 오른쪽 값 왼쪽 기억장소에 저장(대입)
		System.out.println("a의 값은 : " +a);
		a = 10;
		System.out.println("a의 값은 : " +a);
		a += 20;
		System.out.println("a + 20의 값은 : " +a);
		
		/*  자료형  - 정수형 : 소수점 없는 수
		 * 						[byte <-128~127>, short(2byte), int(4byte)#기본#, long(8byte)]		 
		 *	           - 문자형 : 한문자(컴퓨터내부 정수저장)
		 *						 [char(2byte) <0~65535 16bit 유니코드>]
		 *		       - 실수형 : 소수점 있는 수
		 *						 [float(4byte), double(8byte)#기본#]
		 *		       - 논리형 : true false 저장 
		 *						 [boolean]
		 *	참조령(레퍼런스형) - 클래스, 인터페이스, 배열, String(문자열)
		 */
		byte b = 127;
		//b = 128; 크기범위를 넘는값 저장 -> 에러
		System.out.println("byte b의 값은 : "  +b);
		long c;
		c = 35L; //숫자형 long L(생략가능)
		System.out.println("long c의 값은 : " +c);
		float d;
		d = 3.4f; //숫자형 float f(생략불가능)
		System.out.println("float d의 값은 : " +d);
		
		char e;
		e = 'A'; //짝은 따옴표 문자한자
		//e = "A"; 큰따옴표는 문자열을 지정한다.
		//e = 'AA'; char형은 2byte 문자 한자만 저장가능
		
		//정수형 변수 <=문자
		a = 'A';
		System.out.println("문자 a의 숫자형 값은 :" +a); // 'A' => 65
		
		boolean f;
		f = true; //참
		f = false; //거짓
		//sysout ctrl+space
		System.out.println(f);
		System.out.println(5+'A'+"\"문자열\""+3.4+true+f);
		
		int g;
		//System.out.println(g); 초기화(값을 넣지않으면) 하지않아서 에러!!
		//h = 10; 반드시 변수타입을 선언한 뒤 사용
		
		int cnt = 5; 
		System.out.println("연필이 필통에 " +cnt+ "자루 있다");
		cnt -= 2;
		System.out.println("연필이 필통에 " +cnt+ "자루 있다");
		cnt += 10;
		System.out.println("연필이 필통에 " +cnt+ "자루 있다");

		//출력특수문자 \"	\\	\'	\t
		System.out.println("연필이 \t 필통에 " +cnt+ "자루 있다");
		
		//실수형 pi 선언 3.14 값
		float pi = 3.14f;
		//정수형 r 선언 5값
		int r = 5;
		//실수형 area 선언 r*r*pi 계산식 넣기
		double area = r*r*pi;
		//"반지름"이 5인 원의 면적은 
		//						\원의 면적\은 ...이다.
		System.out.println("\"반지름\"이 " +r+"인\n\t \\원의 면적\\은 " +area+ "이다");
		
	}
}
