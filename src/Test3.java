
public class Test3 {
	//----------------사용자 함수------------------------------
	// 배열 출력 prn(a) 함수
	public static void prn(int b[]) {
		//System.out.println(b[0]);
		for(int i=0; i<b.length; i++) {
			System.out.println("a["+i+"]:" +b[i]);
		}
	}
	// 배열의 합 함수 sum(a)
	public static int sum(int x[]) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	// 2차원 배열 + Math.random() 혼합 사용자 함수
	public static void arrayMethod(int a[][]) {
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {		
				a[i][j] = (int)(Math.random()*10)+1;//1~10중 랜덤한 숫자 배열에 입력
				System.out.println("a["+i+"]["+j+"]:"+a[i][j]);
			}
		}
		System.out.println("------------------------------");
		// 2차원 배열 1차 내림차순 정렬 함수
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=j+1; k<a[i].length; k++) { //1차 내림차순 정렬 for문
					if(a[i][j] < a[i][k]) {
						temp = a[i][k];
						a[i][k] = a[i][j];
						a[i][j] = temp;
					}
				}
/*				for(int k=j+1; k<a.length; k++) {
					for(int l=0; l<a[i].length; l++){
						if(a[i][j] < a[k][l]) {
							temp = a[k][l];
							a[k][l] = a[i][j];
							a[i][j] = temp;
						}
						if(a[i][k] < a[k][l]) {
							temp = a[k][l];
							a[k][l] = a[i][k];
							a[i][k] = temp;
						}
					}
				}*/
				System.out.println("a["+i+"]["+j+"]:"+a[i][j]);
			}
		}
	}
	//-------------------------------------------------------
	
	//메인함수
	public static void main(String[] args) {
		// 1차원 배열 정수형 a 10 20 30 40 50
		int a[] = {10,20,30,40,50};
		// 배열 내용 출력 prn() 함수
		prn(a);
		// 배열의 합 출력
		System.out.println("배열의 합: "+sum(a));
		int s = sum(a);
		System.out.println("배열의 평균: "+s/a.length);
		
		
		// 랜덤 2차원 배열 생성(1~5)
		int x = (int)(Math.random()*5)+1;
		int y = (int)(Math.random()*5)+1;
		int array[][] = new int[x][y];
		// 랜덤 2차원 배열 생성된 함수 출력
		arrayMethod(array);
		
	}//메인메소드
}//클래스
