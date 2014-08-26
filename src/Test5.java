
public class Test5 {
	public static void main(String[] args) {
		// 자료형 => 클래스형정의
		// byte => Byte
		// short => Short
		// int => Integer
		// long => Long
		// float => Float
		// double => Double
		// char => Character
		// boolean => Boolean
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("20");
		System.out.println(i1);
		System.out.println(i2);
		// 문자열 => 자료형 바꾸기
		int a = Integer.parseInt("30");
		System.out.println("parseInt():" +a);
		// 문자열 => Integer 클래스형
		Integer i3 = Integer.valueOf("40");
		System.out.println("valueOf():" +i3);
		// Integer 클래스형 => 자료형 바꾸기
		int b = i3.intValue();
		System.out.println("intValue():" +b);
		
		String str = "123";
		int c = Integer.parseInt(str); // 문자열 => 정수형
		System.out.println(c);
		
		String str2 = "3.14F";
		float d = Float.parseFloat(str2); // 문자열 => float형
		System.out.println(d);
		
		Integer n1 = new Integer(200);
		int e = n1.intValue(); // Integer => 정수형
		System.out.println(e);
		
		Float n2 = new Float(23.3f);
		float f = n2.floatValue(); //Float => float형
		System.out.println(n2);
	}
}
