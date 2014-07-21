
public class Test1 {
	public static void main(String[] args) {
	/** 비교(관계)연산자 > >= < <=  == !=
		 a>10(a가 10보다 크다 a는 10초과)
		 a>=10(a는 10보다 크거나 같다 a는 10이상)
		 a<10(a는 10보다 작다 a는 10미만)
		 a<=10(a는 10보다 작거나 같다 a는 10이하)
		 결과 true false
		 a>b a>=10 10<20
	 */		
		int a = 10,b = 20;
		
		System.out.println("a>b="+(a>b));
		System.out.println("a<100="+(a<100));
		System.out.println("10==20="+(10==20));
		
		//논리(삼항)연산자 결과변수=조건?참값:거짓값;
		//최대값
		int max = 0;
		// max = 조건?a:b;
		max = a<b?b:a;
		System.out.println("최대값:" +max);
		
		a = -5;
		int abs = 0;
		abs = (a==a)?-a:a;
		System.out.println("절대값:" +abs);
	}
}