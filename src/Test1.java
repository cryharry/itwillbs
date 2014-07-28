
public class Test1 {
	public static void main(String[] args) {
		double amount = 24;
		//1627년 뉴욕 맨하튼 섬 => 24달러
		//2013년 은행 8% 복리
		//1년 * 1.08
		for(int i=1627;i<=2013;i++) {
			amount = amount * 1.08; // amount *= 1.08
		}
		System.out.println("1627~2013까지 잔액: $"+amount);
		
		/**		
	  		초기값;
	  		while(조건) {
				실행문;
				증가값;
			}
	 	*/
		// 1~10 출력
		int i = 1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		// 1 ~ 100까지 합
		int sum = 0;
		i = 1;
		while((sum+i)<100) { //합이 100보다 작을떄까지
			sum += i;
			// 1 ~ 1,2,3....100 까지 합 sum
			System.out.println("1 ~ "+i+" 까지 합 "+sum);
			i++;
			//if(i>13) break;
		}
		
		/**
		 	초기값;
		 	do {
		 		실행문;
		 		증가값;
		 	} while(조건);
		 */
		// 10 9 ... 1 출력
		i = 10;
		do {
			System.out.print(i+ " ");
			i--;
		} while(i>=1);
		System.out.println("------------------------------");
		
		// 1 ~ 1 2 3 ... 100까지의 합
		i = 1; sum = 0;
		do {
			sum += i;
			if( i%10 == 0 ) //10의 배수만 출력
				System.out.println("1~"+i+"까지의 합: " +sum);
			i++;
		} while(i <= 100);
		System.out.println("------------------------------");
		
		// for 0 ~ 100보다 작은 수 중
		// if 3과 4의 공배수 출력( 3으로 나누어 떨어지고 4로 나누어 떨어지는 수 )
		for( i = 0; i<=100; i++ ) {
			if( i%3 == 0 && i%4 == 0) {
				System.out.println("0 ~ 100 중에 3과 4의 공배수는:" +i);
			}
		}
		System.out.println("------------------------------");
		
		// 1 ~ 10 홀수의 합: 짝수의 합:
		int oddsum = 0, evensum = 0;
		for(i = 1; i <= 10; i++) {
			if( i%2 == 1 ){
				oddsum += i;
				//System.out.print("1 ~ "+i+" 홀수의 합:" +oddsum+ "\t\t");
			} else {
				evensum += i;
				//System.out.println("1 ~ "+i+" 짝수의 합:" +evensum);
			}
		}
		System.out.println("1~10 홀수의 합:"+oddsum+",짝수의합:"+evensum);
		
	}//메인메서드
}//클래스
