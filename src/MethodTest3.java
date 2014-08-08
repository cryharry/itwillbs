
public class MethodTest3 {
	//prn() 정수형 1개 받아서 출력
	void prn(int a) {
		System.out.println(a);
	}
	//prn() 정수형 2개 받아서 출력
	void prn(int a, int b) {
		System.out.println(a+","+b);
	}
	//prn() 정수형 3개 받아서 출력
	void prn(int a, int b, int c) {
		System.out.println(a+","+b+","+c);
	}
	
	// Varargs 사용
	void prn(int ...num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
	}
}
