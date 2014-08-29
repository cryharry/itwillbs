class MyDate {
	int year = 2014;
}

public class Test3 {
	public static void main(String[] args) {
		MyDate m = null;
		try {
			System.out.println(m.year);
		} catch(Exception e) {
			System.out.println("예외발생: " +e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}