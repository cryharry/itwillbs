
public class Test2 {
	public static void main(String[] args) {
		//제어문(조건문, 반복문)
		//조건문 if switch
		//반복문 for while do~while
		
		/*
			if(조건) {
				조건이 참일때 실행문
			}
		*/
		int a = -7;
		if(a<0) {
			a = -a; // a=a*(-1) a *= -1
		}
		System.out.println("절대값: "+a);
		
		/*
			if(조건) {
				//참일때 실행문
			} else {
				//거짓일때 실행문
			}
		*/
		a = 30; int b = 20, max = 0;
		//if~else
		if (a >= b) {
			max = a;
		} else { //a < b
			max = b;
		}
		System.out.println("최대값: "+max);
		
		a = 6;
		//짝수 a를 2로 나누었을때 나머지가 0이면
		//홀수 나머지 0이 아니면
		if (a%2 == 0) {
			System.out.println("a는 짝수입니다.");
		} else {
			System.out.println("a는 홀수입니다.");
		}
		
		a = 10; b = 20;
		int min = 0;
		if(a < b){
			min = a;
		} else {
			min = b;
		}
		System.out.println("최소값:"+min);
		
/*		
  		if(조건1){
			조건1 참 실행문;
		} else if(조건2) {
			조건1 거짓 조건2 참 실행문;
		} else if(조건3){
			조건1,2 거짓 조건3 참 실행문;
		} else {
			조건1,2,3 거짓 실행문;
		}
*/
		a = -5;
		//양수	영	음수
		if(a > 0) {
			System.out.println("양수");
		} else if(a == 0) {
			System.out.println("영");
		} else { //a < 0
			System.out.println("음수");
		}
		
		a = 85; // {a>=90 A} {90<a>=80 B} {80<a>=70 C} {70<a>=60 D} {a<60 F}
		if( a >= 90) {
			System.out.println("A학점");
		} else if (a < 90 && a >= 80) {
			System.out.println("B학점");
		} else if (a < 80 && a >= 70) {
			System.out.println("C학점");
		} else if (a < 70 && a >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
/*		if(조건) {
			//조건 참 실행문
			if(조건2) {
				//조건 참 조건2 참
			} else {
				//조건 참 조건2 거짓
			}
		} else {
			//조건 거짓 실행문
		}
*/
		a = 93;
		String grade="";
		// A 90점이상 94~97 (98점이상 A+ 98~100 94점미만 A- 90~93)
		// B 80점이상
		if(a >= 90) {
			//A
			grade = "A";
			if(a >= 98){
				//A+
				grade = "A+학점";
			} else if(a < 94){
				//A-
				grade = "A-학점";
			}
		} else if(a >= 80){ //B
			grade = "B학점";
		}
		System.out.println("학점: "+grade);
	}//메인메서드
}//클래스
