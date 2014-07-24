
public class Test2 {
	public static void main(String[] args) {
		// 반복문 for		while	do~while
		
/*		
  		for(초기값;조건;증가값){
			반복할 문장;
		}
*/
		int i;
		//조건 : 참 => 반복, 거짓 => 반복끝냄
		//1 2 3 4 5 6 7 8 9 10
		for(i=1; i<=10; i++) { //i += 1, i = i+1
			System.out.println("Hello "+i);
		}
		//11 12 13 14 15 16 17 18 19 20
		for(i=11; i<=20; i++) {
			System.out.print(i+" ");
		}
		//0 1 2 3 4 5 6 7 8 9
		//2 4 6 8 10 12 14 16 18 20
		//10 9 8 7 6 5 4 3 2 1
	}
}
