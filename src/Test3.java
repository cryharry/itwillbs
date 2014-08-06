
public class Test3 {
	public static void main(String[] args) {
		// MyDate 함수 사용하기
		MyDate md = new MyDate();
		System.out.print("초기값: ");
		md.prn();
		System.out.print(" => ");
		
		// set 함수 날짜 지정
		md.setYear(2014);
		md.setMonth(8);
		md.setDay(6);
		
		System.out.print("set 후 => ");
		// get 함수 날짜 출력
		System.out.print(md.getYear()+"년 ");
		System.out.print(+md.getMonth()+"월 ");
		System.out.println(+md.getDay()+"일");
		System.out.println("-----------------");
		
		// 인자가 있는 생성자 호출
		MyDate md2 = new MyDate(2015);
		md2.prn();
		
		MyDate md3 = new MyDate(2016, 5);
		md3.prn();
		
		MyDate md4 = new MyDate(2017, 7, 7);
		md4.prn();
	}
}
