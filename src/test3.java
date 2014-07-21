
public class test3 {
	public static void main(String[] args) {
	/**	연산자 왼쪽 => 오른쪽 우선순위 괄호()
		변수 = 식
	    1. 단항연산자  + - 부호 ++ -- (증감) !(not) (형변환)
		2. 산술연산자 * / %(나머지) + -
		3. 비교(관계)연산자 > >= < <=  == !=
		4. 논리연산자 &&(and) ||(or)
		5. 삼항(조건)연산자 조건?참값:거짓값
		6. 대입연산자 = += -= *= /= %=
	 */
		
		int a = 5, b = 2;
		System.out.println("나눈 결과(정수):"+a/b); //5/2 = 2 정수형/정수형 = 정수형
		System.out.println("나눈 결과(실수):"+(float)a/b); //실수형/정수형 = 실수형
		System.out.println("나머지:"+a%b);
		
		System.out.println("a+b="+a+b); //a+b=왼쪽->오른쪽 결과52<5(a)2(b)>
		System.out.println("a+b="+(a+b)); //a+b=7
		
		
		byte c = 10, d = 20, sum;
		sum = (byte)(c+d);
		
/**	 	byte, short, char 연산(+,-,*,/) byte,short,char => int
		byte, short, char, int 연산(+,-,*,/) int => int
		byte, short, char, int, long 연산(+,-,*,/) long => long
		byte, short, char, int, long, float 연산(+,-,*,/) float => float
		byte, short, char, int, long, float, double 연산(+,-,*,/) double => double*/
		
		int e = 1000000, f = 2000000;
		long g = (long)e*f; //정수형 * 정수형
		System.out.println("g="+g);
		
	}
}