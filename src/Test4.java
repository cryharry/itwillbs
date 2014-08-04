
public class Test4 {
	public static void main(String[] args) {
		Student st = new Student();
		st.setStudent(1, "슈퍼맨", 60, 100, 80);
		System.out.println(st.hakbun+"번 학생 슈퍼맨의 총점은: "+st.sum());
		System.out.println(st.hakbun+"번 학생 슈퍼맨의 평균은: "+st.avg());
		Student st2 = new Student();
		st2.setStudent(2, "배트맨", 67, 83, 95);
		System.out.println(st2.hakbun+"번 학생 배트맨의 총점은: "+st2.sum());
		System.out.println(st2.hakbun+"번 학생 배트맨의 평균은: "+st2.avg());
	}
}
