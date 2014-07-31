
public class Test2 {
	public static void main(String[] args) {
		// 2차원배열 정수형 num	{10,20} {30,40} {50,60,70}
		int num[][] = { {10,20}, {30,40}, {50,60,70} };
		// 출 력
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print("num["+i+"]["+j+"]:"+num[i][j]+"\t");
			}System.out.println();
		}
		System.out.println("--------------------------------------------");
		//for 구문 사용 배열안 데이터 입력
		int number[][] = new int[3][3];
		int tmp = 10;
		int k = 2;
		for(int i=0; i<3; i++) {
			if(i == 2) k=3;
			for(int j=0; j<k; j++) {
					number[i][j] = tmp;
					tmp += 10;
					System.out.print("number["+i+"]["+j+"]:" +number[i][j]+"\t\t");
			}System.out.println();
		}
		System.out.println("--------------------------------------------------");
		// 2차원배열 문자열 name {"슈퍼맨","배트맨"} {"X-맨"}
		String name[][] = { {"슈퍼맨","배트맨"}, {"X-맨"} };
		// 출 력
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.print("name["+i+"]["+j+"]:"+name[i][j]+"\t\t");
			}System.out.println();
		}
		
		
	}//메인메소드
}//클래스
