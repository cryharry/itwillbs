
public class Test1 {
	public static void main(String[] args) {
		int a1 = 0,a2 = 0,a3 = 0,a4 =0 ,a5 = 0; //선언 및 초기화
		// 배열: 같은 형의 기억장소를 여러개 사용
		int array[]; //배열 선언만
		array = new int[5]; //배열 크기,기억장소 확보,초기값 0 할당
		/* -----------배열의 초기값-------------
		 정수형 0 0L    실수형 0.0 0.0f
		 문자형 \u0000  논리형 false 참조형 null */
		int i = 0;
		while(i<array.length) {
			System.out.println("array"+"["+i+"]"+":"+array[i]);
			i++;
		}
		System.out.println("--------------------------------");
		
		/*
  		array[0]=1; array[1]=2; array[2]=3; array[3]=4; array[4]=5;
		System.out.println("array[0]: "+array[0]);
		System.out.println("array[1]: "+array[1]);
		System.out.println("array[2]: "+array[2]);
		System.out.println("array[3]: "+array[3]);
		System.out.println("array[4]: "+array[4]);
		*/
		for(i=0; i<array.length; i++) {
			array[i] = i+1;
			System.out.println("array"+"["+i+"]:"+array[i]);
		}
		System.out.println("-----------------------------");
		
		//배열 선언 초기값 할당
		int[] b = {10, 20, 30, 40, 50};
		int c[] = new int[]{10, 20, 30, 40, 50};
		//배열크기 배열이름.length => 5
		System.out.println("배열크기:" +b.length);
		i=0;
		do {
			System.out.println("b["+i+"]:"+b[i]);
		} while(++i < b.length);
/*		향상된 for구문		
		for(데이터형변수:배열명){
			
		}
*/
		for(int x:c){
			System.out.println("c의 배열값: "+x);
		}
		
		//문자열 String 배열 str 4
		String[] str = {"슈퍼맨", "배트맨", "X-맨", null};
		/*
		 String str[] = new String[4];
		 str[0] = "슈퍼맨";
		 str[1] = "배트맨";
		 str[2] = "X-맨";
		*/
		for(i=0; i<str.length; i++) {
			System.out.println("str["+i+"]: "+str[i]);
		}
		//향상된 for구문
		for(String s:str) {
			System.out.println("str의 배열값: "+s);
		}
	}//메인메소드
}//클래스
