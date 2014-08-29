
public class Test4 {
	public static void main(String[] args) {
		int num[] = {1, 2, 3};
		System.out.println("시작");
		// alt+shift+Z, y
		try {
			num[10] = 5;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("끝");
		System.out.println("정상종료");
	}
}
