class ObjectTest /*extends Object*/ {
	
}

public class Test2 /*extends Object*/ {
	public static void main(String[] args) {
		// Object : java.lang.Object <최상위클래스> 모든 클래스의 부모, 클래스 공통적인 부분정의
		// 모든 클래스는 Object 상속
		// 모든 클래스는 extends Object 생략
		ObjectTest o = new ObjectTest();
		System.out.println(o.getClass());
		System.out.println(o);
		System.out.println(o.toString());
		// equals() 참조주소 실제기억장소 비교
		int a = 10, b = 10;
		if(a == b) System.out.println("같다");
		else System.out.println("다르다");

		String str1=new String("안녕"), str2=new String("안녕");
		if(str1 == str2) System.out.println("같다"); // 참조주소를 비교
		else System.out.println("다르다"); // result
		
		if(str1.equals(str2)) System.out.println("같다"); //참조주소 실제기억장소 비교 //result
		else System.out.println("다르다");
		System.out.println("-----------------");
		
		String str3 = "안녕", str4 = "안녕";
		if(str3 == str4) System.out.println("같다"); // 참조주소를 비교 //result
		else System.out.println("다르다");
		if(str3.equals(str4)) System.out.println("같다"); //참조주소 실제기억장소 비교 //result
		else System.out.println("다르다");
	}
}
