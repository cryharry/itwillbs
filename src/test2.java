
public class test2 {
	public static void main(String[] args) {
		//-----------자료형 형변환---------------
		//자동 형변환	큰기억장소 = 작은기억장소
		double a;
		a = 7; //double  = int
		System.out.println("a="+a); //7.0
		
		int c;
		c = 'D'; //int 변수 = char값
		System.out.println("c=" +c); //68
		
		char ch;
		ch = 65; //char 변수 = int값
		System.out.println("ch=" +ch); //A
		
		//명시적 형변환		작은 = (작게)큰
		int b;
		b = (int)3.4; //int 변수 = (int)double값
		System.out.println("b=" +b);
		
		//-------printf로 char형 => int형으로 표현하기--------
		ch = 'A';
		System.out.printf("%c => %d\n", ch,(int)ch);
		ch = 'a';
		System.out.printf("%c => %d\n",ch,(int)ch);
		ch = '0';
		System.out.printf("%c => %d\n",ch,(int)ch);
		
	}
}