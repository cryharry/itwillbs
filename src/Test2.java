
public class Test2 {
	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		System.out.println(mt.add(10, 20));
		System.out.println(mt.add(10, 20, 30));
		System.out.println(mt.add(10, 20, 30, 40));
		
		// Varargs 추가기능 : 매개변수개수 여러개 -> 배열
		System.out.println(mt.add(10, 20, 30, 40, 50));
		System.out.println(mt.add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
	}
}
