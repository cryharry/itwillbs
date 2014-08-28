import java.text.SimpleDateFormat;
import java.util.Date;


public class Test1 {
	public static void main(String[] args) {
		// Math : 수학관련 static 멤버변수 static 메서드
		System.out.println(Math.PI);
		System.out.println(Math.max(10, 20));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.round(3.57));
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(d));
	}
}
