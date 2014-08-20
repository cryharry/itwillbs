class Employee {
	// 멤버변수 name, salary
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
	// 메서드 getEmployee() return name+","+salary
	String getEmployee() {
		return name+","+salary;
	}
}

class Manager extends Employee{ // 상속 Employee
	// 멤버변수 depart
	String depart;
	// 생성자 name, salary, depart 받는 생성자
	Manager(String name, int salary, String depart) {
		super.name = name;
		super.salary = salary;
		this.depart = depart;
	}
	// 메서드 getManager() return name+","+salary+","+depart
	String getManager() {
		return name+","+salary+","+depart;
	}
}

public class Test1 {
	public static void main(String[] args) {
		// 객체 생성 Employee emp
		Employee emp = new Employee("슈퍼맨", 2000000);
		// 출력 메서드호출 getEmployee()
		System.out.println(emp.getEmployee());
		// 객체 생성 Manager man
		Manager man = new Manager(emp.name, emp.salary, "개발부");
		// 출력 메서드호출 getEmployee()
		System.out.println(man.getEmployee());
		// 출력 메서드호출 getManager()
		System.out.println(man.getManager());
	}
}
