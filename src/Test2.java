
public class Test2 {
	public static void main(String[] args) {
		// 객체 생성 -> 생성자 호출
		Animal ani = new Animal();
		ani.name = "고양이";
		ani.age = 5;
		ani.run();
		
		System.out.println("***set 메서드 호출 후***");
		ani.setName("사자");
		ani.setAge(10);
		ani.run();
		System.out.println("***get 메서드 호출 후****");
		System.out.print("name: "+ani.getName()+"\t");
		System.out.print("age: "+ani.getAge());
		System.out.println();
		
		Animal a2 = new Animal("토끼");
		a2.run();
		
		Animal a3 = new Animal(2);
		System.out.println(a3.getAge());
		
		Animal a4 = new Animal("기린", 4);
		a4.run();
		System.out.println(a4.getAge());
	}
}
