
public class Test3 {
	public static void main(String[] args) {
		// 구구단 2단
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i+"="+i*2);
		}
		
		//5단
		for(int i=1; i<=9; i++) {
			System.out.println("5*"+i+"="+5*i);
		}
		
		//섭씨온도 0도 ~ 100도
		int F = 0;// 화씨온도
		for(int i=0; i<=100; i++) {
			//화씨온도 =  섭씨온도*9/5 +32
			F = i*9/5+32;
			// 출력 섭씨 ..도 : 화씨 ..도
			System.out.println("섭씨 "+i+"도 : 화씨 "+F+"도");
		}
		
/*
 		// 구구단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
*/		
	}
}
