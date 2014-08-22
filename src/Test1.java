class Account {
	// 멤버변수 인스턴스 정수형 count 클래스 정수형 total
	int count;
	static int total;
	// 생성자 매개변수 정수형 num
	Account(int num) {
		// count += num
		count += num;
		// total += num
		total += num;
	}
	// 클래스 메서드 showTotal() 출력 "total:" total
	static void showTotal() {
		System.out.println("total:" +total);
	}
}

public class Test1 {
	public static void main(String[] args) {
		// total 출력
		System.out.println(Account.total);
		// showTotal() 메서드 호출
		Account.showTotal();
		// 객체 생성 acc1
		Account acc1 = new Account(10);
		// 출력 total 출력
		System.out.print("acc1.total:"+acc1.total+ "\t");
		//     count 출력
		System.out.println("acc1.count:"+acc1.count);
		// 객체 생성 acc2
		Account acc2 = new Account(10);
		// total 출력 count 출력
		System.out.print("acc2.total:"+acc2.total+ "\t");
		System.out.println("acc2.count:"+acc2.count);
		// 객체 생성 acc3
		Account acc3 = new Account(10);
		// total 출력 count 출력
		System.out.print("acc3.total:"+acc3.total+ "\t");
		System.out.println("acc3.count:"+acc3.count);
	}
}