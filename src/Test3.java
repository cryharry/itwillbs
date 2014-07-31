
public class Test3 {
	public static void main(String[] args) {
		// 정수형 10개 임의수 배열 num --- 짝수갯수:evencnt 홀수갯수:oddcnt
		int evencnt = 0, oddcnt = 0, evensum = 0, oddsum = 0;
		int[] num = {79, 88, 91, 33, 100, 55, 95, 81, 75, 64};
		// 짝수의 갯수 홀수의 갯수 출력
		for(int i=0; i<num.length; i++){//배열의 크기만큼 반복
			// num[i] : 배열변수
			if(num[i]%2 == 0) {// 2로 나눠 짝수인지 판별
				evencnt++; // 짝수일 경우 짝수카운트+1
				evensum += num[i]; //짝수 변수들의 합
			} else {
				oddcnt++; // 홀수일 경우 홀수 카운트+1
				oddsum += num[i]; // 홀수 변수들의 합
			}
		}
		System.out.println("짝수의 갯수: " +evencnt+"\t홀수의 갯수: "+oddcnt);
		System.out.println("짝수들의 합: "+evensum+"\t홀수들의 합: "+oddsum);
		
		int max = num[0]; //배열 첫번째값 초기값
		for(int i=1; i<num.length; i++) {
			if(max > num[i]) { // max와 num[i]의 숫자 크기를 비교
				max = max; //최대값 max에 저장, 변동없음
			} else {
				max = num[i]; //max가 num[i]보다 작을 경우 num[i]값을 max에 저장
			}
		}
		System.out.println("num배열 변수의 최대값: "+max);
		
		int min = num[0];
		for(int i=0;i<num.length; i++) {
			if(min > num[i]) {
				min = num[i]; 
			}
		}
		System.out.println("num배열 변수의 최소값: "+min);
		System.out.println("-----------------------------------");
		
		// 값 바꾸기
		int a = 10, b = 20, tmp = 0; //tmp->잠시 저장하는 변수
		if(a != b) {
			tmp = b; // b의 값을 tmp에 저장
			b = a; // a의 값을 b로 저장(b값 a값으로 바꿈)
			a = tmp; // tmp에 있던 b값을 a값에 저장(a값을 b값으로 바꿈)
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---------------------------------");
		for(int i=0; i<num.length; i++) System.out.print(num[i]+ " ");
		System.out.println();
		tmp = 0;
		for(int i=1; i<num.length; i++) {
			if(num[i] > num[0]) {
				// 최대값 바꾸기
				tmp = num[i];
				num[i] = num[0];
				num[0] = tmp;
			}
		}
		// 출 력
		for(int i=0; i<num.length; i++)	System.out.print(num[i]+ " ");
		System.out.println("<=num[0]에 최대값 저장한 것");
		//num[0]제외하고 num[1]~num[10]중에 num[1]에 최대값 저장 
		for(int i=2; i<num.length; i++) {
			if(num[i] > num[1]) {
				tmp = num[i];
				num[i] = num[1];
				num[1] = tmp;
			}
		}
		for(int i=0; i<num.length; i++)	System.out.print(num[i]+ " ");
		System.out.println("<=num[0],num[1]까지 최대값 내림차순식으로 정렬한 것");
		
		
		
		// 내림차순 정렬 기준값:i 기준다음 비교값:j
		System.out.print("{");
		for(int i=0; i<num.length; i++) { //최대값이 들어갈 기준 배열 카운트
			for(int j=i+1; j<num.length; j++) { //기준 다음부터 배열비교 카운트
				if(num[j] > num[i]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
			if(i != num.length-1){
				System.out.print(+num[i]+", ");
			} else {
				System.out.print(num[i]);
			}
		}
		System.out.println("}");
		
		// 오름차순 정렬
		System.out.print("{");
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[j] < num[i]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
			if(i != num.length-1){
				System.out.print(+num[i]+", ");
			} else {
				System.out.print(num[i]);
			}
		}
		System.out.println("}");
	}//메인메소드
}//클래스
