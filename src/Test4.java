
public class Test4 {
	public static void main(String[] args) {
		//대입연산자 = += -= *= /= %=
		int a;
		a = 10;
		//확장 대입연산자
		a=a+1;
		System.out.println("{a = a+1} a=>"+a);
		
		a += 1;
		System.out.println("{a += 1} a=>"+a);
		
		a++;
		System.out.println("{a++} a=>"+a);
		
		a *= 10; //a=a*10
		System.out.println("{a *= 10} a=>"+a);
	}
}