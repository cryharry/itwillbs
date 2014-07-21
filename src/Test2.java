
public class Test2 {
	public static void main(String[] args) {
		//논리연산자 &&(and) ||(or) !(not)
		System.out.println("!true="+!true);
		System.out.println("!false="+!false);
		
		// &&(and)
		int a = 10,b = 20;
		//true && true => true
		System.out.println("a<b && a!=b =>" +(a<b && a!=b));
		//true && false => false
		System.out.println("a<b && a==b =>" +(a<b && a==b));
		//false && true => false
		System.out.println("a>b && a!=b =>" +(a>b && a!=b));
		//false && false => false
		System.out.println("a>b && a==b =>" +(a>b && a==b));
		
		// ||(or)
		//true || true => true
		System.out.println("a<b || a!=b =>" +(a<b || a!=b));
		//true || false => true
		System.out.println("a<b || a==b =>" +(a<b || a==b));
		//false || true => true
		System.out.println("a>b || a!=b =>" +(a>b || a!=b));
		//false || false => false
		System.out.println("a>b || a==b =>" +(a>b || a==b));
		
		//ex
		int age = 19;
		String str = "";
		// 10~19 10<=age>=19
		//str = 조건(관계 논리 관계)?"10대":"10대아님";
		str = (age>=10&&age<=19)?"10대":"10대아님";
		System.out.println(age+ "=>" +str);
		
		int ju = 1; //1남 2여 3남 4여
		//str = 관계 논리 관계 ? 남:여;
		str = (ju==1 || ju==3)?"남":"여"; //관게 논리 연산자 사용시
		System.out.println(ju+ "=>" +str);
		str = (ju%2==1)?"남":"여"; //나머지 연산자 사용시
		System.out.println("나머지 연산자:"+ju+ "=>" +str);
		
		int kor=85, eng=80, math=40, sum=0;
		double avg = 0.0;
		//출력 국어:	 영어:	수학:
		System.out.println("국어:" +kor+ "\t영어:" +eng+ "\t수학:" +math);
		//	  합계:	평균:
		sum = kor+eng+math;
		avg = (kor+eng+math)/3.0;
		System.out.println("합계:"+sum+ "\t평균:"+avg);
		// 평균 60이상 이고 각과목 40
		str = (avg>=60 && (kor>=40 && eng>=40 && math>=40))?"합격":"불합격";
		System.out.println(str);
		}
}