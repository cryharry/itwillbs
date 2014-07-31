
public class Test1 {
	public static void main(String[] args) {
		// 2차원 배열 같은 형 기억장소 여러개 사용
		// 생성 => 기억장소 확보, 초기값 0 할당
		// 데이터형 배열변수이름[][]
		int a[][] = new int[5][3]; //int[행][열]
		System.out.println("a[0][0]: "+a[0][0]);
		
		int temp = 10;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {//2차원배열의 길이를 구할려면 1차원배열.length로 구함
				a[i][j] = temp; 
				temp += 10;
				System.out.print("a"+"["+i+"]["+j+"]:"+a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		int b[][] = {{10,20}, {30,40}, {50,60}};
		System.out.print("행: "+b.length+ "개\t");
		System.out.println("열: "+b[0].length+"개");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++){
				System.out.print("b["+i+"]["+j+"]:"+b[i][j]+"\t");
			}System.out.println();
		}
		
	}//메인메소드
}//클래스
