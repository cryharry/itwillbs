
public class Test2 {
	public static void main(String[] args) {
		// break 반복문을 빠져나오는 명령
		// while 1~10 출력 i가 8이면 break
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if(i == 8) break;
		}
		System.out.println("---------------");
		//continue : 반복문 continue 반복문의 시작위치
		// for 1 ~ 10 8이면 continue
		for(i=1; i<=10; i++){
			if( i == 8) continue;
			System.out.println(i);
		}
		System.out.println("----------------");
		// 1~10 출력 :2의 배수 출력X =>홀수만 출력
		for(i=1; i<=10; i++) {
			if(i%2 == 0) continue;
			System.out.println(i);
		}
		System.out.println("----------------");
/**		
		//무한반복
		for(;;) {
			
		}
		for(;true;) {
			
		}
		while(true) {
			
		}
*/		
		// (1+(-2)+3+(-4)+5+(-6)....+10....)
		int sum = 0; //합
		int num = 0; //부호 바뀐 수 저장
		int s = 1; //부호
		for(i=1; true; i++) {
			num = i*s;
			sum += num;
			//총합이 100보다 크거나 같으면 반복문 빠져나오기
			System.out.println(i+"\t"+s+"\t"+num+"\t"+sum);
			if(sum >= 100) break;
			s *= -1; // s=-s; 부호바꾸기
		}
		System.out.println("sum=" +sum);
	}//메인메소드
}//클래스
