
public class Test1 {
	public static void main(String[] args) {
		// for
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		int sum = 0, totalsum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			totalsum += sum;
			//System.out.println(i+"\t"+sum+"\t"+totalsum);
		}
		System.out.println("totalsum=" +totalsum);
		System.out.println("----------------------------");
		
		//for
		// (1+(-2)+3+(-4)+5+(-6)....+10)
		sum = 0; //합
		int num = 0; //부호 바뀐 수 저장
		int s = 1; //부호
		for(int i=1; i<=10; i++) {
			num = i*s;
			sum += num;
			//System.out.println(i+"\t"+s+"\t"+num+"\t"+sum);
			s *= -1; // s=-s;
		}
		System.out.println("sum=" +sum);
		System.out.println("-----------------------");
		
		// 두개의 주사위를 던졌을때 눈의합이 6이되는 모든수출력
		// for for if
		for(int i=1; i<=6; i++){
			for(int j=1; j<=6; j++){
				if( i+j == 6) System.out.println("i="+i+",j="+j);
			}
		}
		System.out.println("---------------------");
		// 2x+4y=10 0<=x<=10 0<=y<=10
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if((x+2*y)*2 == 10)System.out.println("x="+x+",y="+y);
			}
		}
		System.out.println("---------------------");
		
		//while   1+2+3+4+5		%	/
		num = 12345; sum = 0;
		while(num != 0) {
			sum += num%10; //5 4 3 2 1
			System.out.println("num= "+num+"sum= "+sum);
			num /= 10; //1234 123 12 1 0
		}
		
		System.out.println("sum="+sum);
	}//메인메소드
}//클래스
