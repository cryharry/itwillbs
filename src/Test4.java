
public class Test4 {
	//-------사용자 함수-------
	// calc 함수
	public static int calc(int x, int y, char c) {
		int result = 0;
		if(x !=0 && y !=0) {
			switch(c) {
				case '+': result = x+y; break;
				case '-': result = x-y; break;
				case '*': result = x*y; break;
				default : result = x/y;
			}
		}
		return result;
	}
	//-----------------------
	// 메인 함수
	public static void main(String[] args) {
		// calc(10, 20, '+')
		System.out.println("20+10: "+calc(20,10,'+'));
		System.out.println("20-10: "+calc(20,10,'-'));
		System.out.println("20*10: "+calc(20,10,'*'));
		System.out.println("20/10: "+calc(20,10,'/'));
	}//메인메소드
}//클래스
