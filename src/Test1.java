class Employee {
	// 멤버변수 문자열 name 정수형 salary
	String name;
	int salary;
	// 기본생성자
	Employee() {
		
	}
	// name salary 받는 생성자
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	// 메서드 print() 출력 name : salary
	void print() {
		System.out.println(name+" : "+salary);
	}
}

class Manager extends Employee { // 상속 Employee
	// 멤버변수 문자열 depart
	String depart;
	// 생성자 name salary depart 받는 생성자
	Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	// 메서드 오버라이딩 print() 출력 name : salary : depart
	@Override
	void print() {
		super.print();
		System.out.println(name+ " : " +salary+ " : " +depart);
	}
}

public class Test1 {
	public static void main(String[] args) {
		// 객체 생성 Manager 
		Manager man = new Manager("슈퍼맨", 2000000, "영웅부");
		// 메서드 호출 print()
		man.print(); // 오버라이딩된 메서드
	}
}
