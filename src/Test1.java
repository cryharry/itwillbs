
public class Test1 {
	public static void main(String[] args) {
		double amount = 24;
		//1627년 뉴욕 맨하튼 섬 => 24달러
		//2013년 은행 8% 복리
		//1년 * 1.08
		for(int i=1627;i<=2013;i++) {
			amount = amount * 1.08;
		}
		System.out.println("1627~2013까지 잔액: $"+amount);
		
/*		
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
	}
}
