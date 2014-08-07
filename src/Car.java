
public class Car {
	// 멤버 변수
	String color, gearType;
	int door;
	
	// 기본 생성자
	Car() {
		// 기본초기값 color white gearType auto door 4
		// 자기자신의 생성자호출 this()
		this("white", "auto", 4);
	}
	// 값 color 받는 생성자
	Car(String color) {
		// this : 자기 자신 클래스의 참조변수
		// this.color = color;
		this(color, "auto");
	}
	// 값 color gearType 받는 생성자
	Car(String color, String gearType) {
		// this.color = color;
		// this.gearType = gearType;
		this(color, gearType, 4);
	}
	// 값 color gearType door 받는 생성자
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	//set 메서드
	void setColor(String color) {
		this.color = color;
	}
	void setGearType(String gearType) {
		this.gearType = gearType;
	}
	void setDoor(int door) {
		this.door = door;
	}
	//get 메서드
	String getColor() {
		return color;
	}
	String getGearType() {
		return gearType;
	}
	int getDoor() {
		return door;
	}
	//prn() 자동차 색: 타입: 문수:
	void prn() {
		System.out.println("자동차 색: "+color+",타입: "+gearType+",문수: "+door);
	}
}
