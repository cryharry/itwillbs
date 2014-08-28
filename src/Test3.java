interface Student {
	void SetScore(int kor, int eng, int math);
	void CalAverage();
}

class FirstStudent implements Student {
	int kor, eng, math;
	@Override
	public void SetScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public void CalAverage() {
		System.out.println("평균: " +(kor+eng+math)/3.0);
	}
}

public class Test3 {
	public static void main(String[] args) {
		FirstStudent f = new FirstStudent();
		f.SetScore(80, 85, 90);
		f.CalAverage();
	}
}
