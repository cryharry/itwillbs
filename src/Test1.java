class SportCar {
	int speed;
	String color;
	int door;
	SportCar(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
}

public class Test1 {
	public static void main(String[] args) {
		SportCar s1 = new SportCar(100);
		s1.setDoor(2);
		s1.setColor("빨간색");
		System.out.println(s1.speed+ "," +s1.getColor()+ "," +s1.getDoor());
		
		SportCar s2 = new SportCar(200);
		s1.setDoor(4);
		s1.setColor("검정색");
		System.out.println(s2.speed+ "," +s2.getColor()+ "," +s2.getDoor());
	}
}
