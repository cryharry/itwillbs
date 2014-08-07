
public class MethodTest2 {
	// 메서드 정의 abs(int a) return 절대값
	int abs(int a) {
		if(a<0) return -a;
		return a;
	}
	// 메서드 오버로딩 double
	double abs(double a) {
		if(a<0) return -a;
		return a;
	}
	/* 메서드 return값 메서드 오버로딩과 상관없음
	void abs(double a) {
		if(a<0) -a;
	}*/
}
