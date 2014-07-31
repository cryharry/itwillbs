
public class Test2 {
	public static void main(String[] args) {
		// 배열형 점수	 score 100 90 80 70 60
		int[] score = {100, 90, 80 ,70, 60};
		// 각 점수 출력 후 합계도 출력
		int sum = 0;
		double avg = 0;
		//출력 합계
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"]배열의 점수는 "+score[i]+"이고 ");
			sum += score[i];
		}
		System.out.println("점수의 합계는 "+sum);
		avg = (double)sum/score.length;
		System.out.println("평균: "+avg);

		// 향상된 for구문
		System.out.println("---향상된 for구문을 이용한 출력---");
		sum = 0;
		for(int j:score) sum +=j;
		System.out.println("score배열의 합: " +sum);
	}//메인메소드
}//클래스
