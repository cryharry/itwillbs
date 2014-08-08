
public class MethodTest4 {
	//메서드 add() 정수형 값 2개 받아서 합 return
	int add(int a, int b) {
		return a+b;
	}
	//메서드 add() 정수형 값 3개 받아서 합 return
	int add(int a, int b, int c) {
		return a+b+c;
	}
	//메서드 add() 정수형 값 4개 받아서 합 return
	int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	// Varargs 사용
	int add(int ...num) {
		int s = 0;
		for(int i=0; i<num.length; i++){
			s += num[i];
		}
		return s;
	}
}
