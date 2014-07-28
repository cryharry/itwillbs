import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int input = 0;
		// 키보드 입력 Scanner로 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100값을 입력하세요:");
		input = sc.nextInt();
		System.out.println("입력받은 숫자:"+input);
		if(input%2 == 0) 
			System.out.println("짝수");
		else
			System.out.println("홀수");
		System.out.println("--------------------------");
		int count = 0, answer = 0;
		while(true){
			//count 1증가	
			count++;
			System.out.println("예측값입력:");
//			answer 찾고자 하는 예측값 키보드 입력
			answer = sc.nextInt();
//			  비교if	    input > answer
			if(input > answer){
				System.out.println("더 큰 수를 입력하세요:");
				continue;
			}
//			  메시지   더 큰 수 입력하세요
//			  else if  input < answer
			else if(input < answer) {
				System.out.println("더 작은 수를 입력하세요:");
				continue;
			}
//			           더 작은 수 입력하세요
//			  else 나머지 같은 경우
//			  메세지 맞췄습니다. 시도횟수 ..
//			  반복 빠져나오기  			
			else {
				System.out.println("맞췄습니다. 시도횟수:"+count);
				break;
			}
		}
	}//메인메소드
}//클래스