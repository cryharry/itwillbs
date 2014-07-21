
public abstract class test1 {
	public static void main(String[] args) {
	
		int a = 10,  b = 20;
		System.out.print("a변수 출력\n");
		System.out.println("a의 값은 :"+a);
		System.out.printf("a=%d\n", a);
		System.out.println("입니다.");
		
		// exam a=10,b=20형식으로 표현하기
		// %d = 정수(decimal), %f = 실수(float), %c = 문자(char), %s = 문자열(String)
		System.out.println("a="+a+",b="+b);
		System.out.printf("a=%d,b=%d\n", a,b);
		
		double c=3.14, d=4.56;
		System.out.println("c=" +c+ ", d=" +d);
		System.out.printf("c=%.2f, d=%.2f\n", c,d);
		
		char ch = 'A';
		String str = "안녕하세요";
		System.out.printf("문자:%c \n", ch);
		System.out.printf("문자열:%s \n", str);
		
	}
}
