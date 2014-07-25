
public class Test2 {
	public static void main(String[] args) {
/*		반복문	for		while	do~while
		
		
  		for(초기값;조건;증가값){
			반복할 문장;
		}
*/
		int i;
		//조건 : 참 => 반복, 거짓 => 반복끝냄
		//1 2 3 4 5 6 7 8 9 10
		for(i=1; i<=10; i++) { //i += 1, i = i+1
			System.out.print(i+" ");
		}
		for(i=1; i<9; i++) { //i += 1, i = i+1
			System.out.print(i+" ");
		}
		System.out.println();
		//11 12 13 14 15 16 17 18 19 20
		for(i=11; i<=20; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//0 1 2 3 4 5 6 7 8 9
		for(i = 0; i<=9; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//2 4 6 8 10 12 14 16 18 20
		for(i=2; i<=20; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		//10 9 8 7 6 5 4 3 2 1
		for(i=10; i>=1 ; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 1 ~ 10 반복
		// 1 ~ 10 더하기
		int sum = 0; // 1 ~ 10 더한값 저장
		for(i=0; i<=10; i++){
			//System.out.println("i="+i);
			//1 + 2 + 3 + 4 + ... + 10
			sum += i;
			//System.out.println("sum="+sum);
		}
		System.out.println("1에서 10까지 더한 값은: "+sum);
		
		// 1 ~ 100 합 구하기
		sum = 0;
		for(i = 0; i<=100; i++){
			sum += i;
		}
		System.out.println("1에서 100까지의 합: "+sum);
		
		// 1~10 중에 홀수 합
		sum = 0;
		for(i = 1; i<=10; i+=2) {
			sum += i;
		}
		System.out.println("1~10중에 홀수 합: "+sum);
		
		// 1~10 중에 홀수 합 if구문 사용시
		sum = 0;
		for(i = 1; i<=10; i++) {
			if( i%2 == 1 ) {// 홀수 2로 나눌때 나머지 1
				sum += i; //합계
			}
		}
		System.out.println("1~10중에 홀수 합(if구문): "+sum);
	}
}
