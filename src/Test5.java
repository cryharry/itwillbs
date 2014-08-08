import test.PackTest1;
import test.com.PackTest2;

public class Test5 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("슈퍼맨");
		emp.setSalary(100000000);
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		// PackTest1 객체 생성 p
		// ctrl+space   / ctrl+shift+o <--  자동 import
		PackTest1 p = new PackTest1();
		p.prn();
		
		PackTest2 p2 = new PackTest2();
	}
}
