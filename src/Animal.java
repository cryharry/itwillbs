
public class Animal {
	// 멤버변수 문자열 name 정수형 age
	String name;
	int age;
	// 기본생성자
	Animal() {
		System.out.println("Animal 기본생성자");
		name = "개";
		age = 3;
	}
	// name 받는 생성자
	Animal(String n_name) {
		name = n_name;
		age = 1;
	}
	// age 받는 생성자
	Animal(int n_age) {
		name = "동물";
		age = n_age;
	}
	// name age 받는 생성자
	Animal(String n_name, int n_age) {
		name = n_name;
		age = n_age;
	}
	// name에 값넣기 메서드
	void setName(String n_name) {
		name = n_name;
	}

	// age에 값넣기 메서드
	void setAge(int n_age) {
		age = n_age;
	}

	// name값 가져오기 메서드
	String getName() {
		return name;
	}

	// age값 가져오기 메서드
	int getAge() {
		return age;
	}

	// 메서드 run() 출력 name+"이 달린다"
	void run() {
		System.out.println(name+" 달린다.");
	}
}
