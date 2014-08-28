import java.util.ArrayList;
import java.util.List;

class Person {
	private String name, address;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

class PersonList {
	List<Person> AllPerson() {
		List<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
			p1.setName("홍길동");
			p1.setAge(10);
			p1.setAddress("부산");
		list.add(p1);
		
		Person p2 = new Person();
			p2.setName("김길동");
			p2.setAge(20);
			p2.setAddress("서울");
		list.add(p2);
		
		Person p3 = new Person();
			p3.setName("이길동");
			p3.setAge(15);
			p3.setAddress("대전");
		list.add(p3);
		
		return list;
	}
}

public class Test7 {
	public static void main(String[] args) {
		PersonList plist = new PersonList();
		List<Person> list = plist.AllPerson();
		for( int i=0; i<list.size(); i++ ) {
			Person p = (Person)list.get(i);
			System.out.print("이름: "+ p.getName() 
							+ ", 나이: " + p.getAge() 
							+ ", 주소: " + p.getAddress());
			System.out.println();
		}
	}
}
