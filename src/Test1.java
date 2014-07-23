
public class Test1 {
	public static void main(String[] args) {
		//키 175cm 1m => 100cm
		//출력 1m 75cm
		int h = 175, i=100, meter=0, cm=0;
		meter = (int)h/i;
		cm = h%i;
		System.out.println("키: "+meter+"m "+(cm)+"cm");
		
		float pi = 3.141592f;
		//소수점 세째자리 반올림
		// Math.round()
		pi = Math.round(pi*1000)/1000f;
		System.out.println("원주율:"+pi);
	}
}
