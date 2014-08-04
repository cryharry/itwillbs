class Book { //클래스 정의 Book
	String title; // 책제목 문자열
	int price; // 책가격 정수형
	int num; // 책개수 정수형
	int sum() { // 정수형리턴 책 총 합계 구하기 함수(메서드) 
		return price * num; 
	}
}

public class Test2 {
	public static void main(String[] args) {
		// Book 사용
		Book b = new Book();
		b.title = "자바";
		b.price = 22000;
		b.num = 30;
		System.out.println("책이름: "+b.title+"\t가격: "+b.price+"\t개수: "+b.num);
		System.out.println("책 총 가격 합계: "+b.sum());
		System.out.println("-------------------------------------------------");
		
		Book b2 = new Book();
		b2.title = "JSP";
		b2.price = 34000;
		b2.num = 30;
		System.out.println("책이름: "+b2.title+"\t가격: "+b2.price+"\t개수: "+b2.num);
		System.out.println("책 총 가격 합계: "+b2.sum());
	}
}
