
public class Student {
	int hakbun; // 학번 정수형
	String name; // 학생이름 문자열
	int kor; // 국어점수 정수형
	int eng; // 영어점수 정수형
	int math; // 수학점수 정수형
	//기본 생성자
	Student() {
		System.out.println("Student 기본생성자");
	}
	
	void setStudent(int hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int sum() { // 리턴값 점수형 총점 구하는 함수 sum()
		return kor + eng + math;
	}
	double avg() { //리턴값 실수형 평균 구하는 함수 avg()
		return (kor + eng + math)/3.0;
	}
	
}
