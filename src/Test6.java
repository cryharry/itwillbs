import java.util.*;


public class Test6 {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("0~100앞까지 랜덤정수:" +rand.nextInt(100));
		
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextBoolean());
		
		Date d= new Date();
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) +"년");
		// 월 0 ~ 11월
		System.out.println(cal.get(Calendar.MONTH)+1 +"월");
		System.out.println(cal.get(Calendar.DATE) +"일");
		// 요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch(day) {
			case 1: System.out.println("일"); break;
			case 2: System.out.println("월"); break;
			case 3: System.out.println("화"); break;
			case 4: System.out.println("수"); break;
			case 5: System.out.println("목"); break;
			case 6: System.out.println("금"); break;
			case 7: System.out.println("토"); break;
			default: System.out.println("요일아님");
			
		}
	}
}
