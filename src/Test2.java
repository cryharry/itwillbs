
public class Test2 {
	public static void main(String[] args) {
		
		int i = 0, j =0; // 전역변수
		
		// 구구단 2단
		System.out.println("2단");
		for( i=1; i<=9 ;i++) {
			System.out.print("2*"+i+"="+2*i+"\t");
			if( i%3 ==0 ){
				System.out.println();
			}
		}
		
		// 구구단
		System.out.println("구구단");
		for( i=2; i<=9; i++) {
			//하나의 단 완성
			for(j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				if(j%3 == 0) {
					System.out.println();
					if(j%9 == 0) System.out.println();
				} 
			}
		}
		
		// for 출력 5번 반복 *****
		for(int r=1; r<=5; r++) { //행
			for(i=1; i<=5; i++)System.out.print("*"); //열
			System.out.println();
		}
/*		
		*
		**
		***
		****
		*****
*/
		for(int r=1; r<=5; r++) {
			for(i=1; i<=r; i++)
				System.out.print("*");
			System.out.println();
		}
/*		
		2*1=2	3*1=3	4*1=4 ... 9*1=9
		2*2=4	3*2=3	4*2=4 ... 9*2=9
		2*3=6	3*3=3	4*3=4 ... 9*3=9
		...
		2*9=18	3*9=27	4*9=36 .. 9*9=81
*/
		for( i=1; i<=9; i++){
			for( j=2; j<=9; j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}//메인메서드
}//클래스
