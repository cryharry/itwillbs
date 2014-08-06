
public class MyDate {
	// 정수형 year 정수형 month 정수형 day
	int year, month, day;
	// 기본 생성자 초기값 year 2014 month 1 day 1
	// 다른 생성자가 있으면 기본생성자는 자동생성되지 않음
	MyDate() {
		year = 2014;
		month = 1;
		day = 1;
	}
	//년 값을 받아서 생성
	MyDate(int n_year) {
		year = n_year;
		month = 1;
		day = 1;
	}
	//년 월 값을 받아서 생성
	MyDate(int n_year, int n_month) {
		year = n_year;
		month = n_month;
		day = 1;
	}
	//년 월 일 값을 받아서 생성
	MyDate(int n_year, int n_month, int n_day) {
		year = n_year;
		month = n_month;
		day = n_day;
	}
	
	// year값 넣기 메서드
	void setYear(int n_year) {
		year = n_year;
	}
	// month값 넣기 메서드
	void setMonth(int n_month) {
		month = n_month;
	}
	// day값 넣기 메서드
	void setDay(int n_day) {
		day = n_day;
	}
	// year값 가져오기 메서드
	int getYear() {
		return year;
	}
	// month값 가져오기 메서드
	int getMonth() {
		return month;
	}
	// day값 가져오기 메서드
	int getDay() {
		return day;
	}
	
	// prn()메서드 출력 year-month-day
	void prn() {
		System.out.println(year+"-"+month+"-"+day);
	}
}
