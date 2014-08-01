
public class Test3 {
	public static void main(String[] args) {
		/*	정수형 2차원 배열 score
			1번학생 85 60 70
			2번학생 90 95 80
			3번학생 75 80 100
			4번학생 80 70 95
			5번학생 100 65 80
		*/
		
		int sum = 0; //각 학생들 총점
		double avg = 0; //각 학생들 평균
		int score[][] = {{85,60,70}, {90,95,80}, {75,80,100},
						{80,70,95}, {100,65,80}};
		for(int i=0; i<score.length; i++){
			System.out.print((i+1)+"번학생 : ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				avg = sum/(double)score[i].length;
			}
			System.out.println("총점 : "+sum+ "\t평균 : "+avg);
			System.out.println();
			sum = 0;
		}

		// for와 Math.random()을 이용한 학생들 점수 구하기
		System.out.println("--------국어-----수학-----영어-----총점-------평균--------");
		int hak[][] = new int[5][3];
		int ranover = 0;
		for(int i=0; i<hak.length; i++) {
			System.out.print((i+1)+"번학생 : ");
			for(int j=0; j<hak[i].length; j++) {
				ranover = ((int)(Math.random()*10+1)*5)+60;
				if(ranover > 100) ranover = 100;
				hak[i][j] = ranover;
				sum += hak[i][j];
				avg = sum/(double)hak[i].length;
				System.out.print(hak[i][j]+"\t");
			}
			System.out.println(sum+"\t"+avg);
			System.out.println();
			sum=0;
		}
		
	}//메인메소드
}//클래스
