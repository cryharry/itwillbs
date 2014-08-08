
public class Employee {
	// 멤버변수 문자열 name 데이터 은닉
	private String name;
	//        정수형 salary
	public int salary;
	// 기본 생성자
	Employee() {
		
	}
	// setter 메서드
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	// getter 메서드
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
