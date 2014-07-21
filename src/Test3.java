
public class Test3 {
	public static void main(String[] args) {
		// 단항연산자  + - 부호 ++ -- (증감) !(not) (형변환)
		// ++ 1증가 -- 1감소  <=(증감연산자)
		int a = 0;
		a=a+1;
		System.out.println("a=a+1했을떄:"+a);
		a++;
		System.out.println("a++했을떄:"+a);
		--a;
		System.out.println("--a했을떄:"+a);
		a--;
		System.out.println("a--했을떄:"+a);
		//동시에 작업 2개이상일때
		//++앞 : ++먼저수행 나머지 명령수행
		//뒤++ : 다른 명령수행 마지막에 ++수행
		a = 0;
		int b = 0;
		System.out.println("++a : "+ ++a); //1증가 후 출력 =>1
		System.out.println("b++ : "+ b++); //출력 먼저 후 1증가 =>출력:0, b=1
		System.out.println("a="+a); //1
		System.out.println("b="+b); //1
		a=0; b=0;
		int sum = 0;
		sum = ++a + ++b;
		System.out.println("++a + ++b : "+sum); //2
		a=0; b=0; sum=0;
		sum = a++ + b++;
		System.out.println("a++ + b++ : "+sum); //0
	}
}