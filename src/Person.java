
public class Person {
	// 멤버변수 문자열 name 데이터 은닉
	private String name;
	//        정수형 age 데이터 은닉
	private int age;
	// 기본 생성자
	public Person() {
		
	}
	// name age 값을 받는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// setter 메서드
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// getter 메서드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}	
}
