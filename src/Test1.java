
public class Test1 {
	public static void main(String[] args) {
		Car c = new Car();
		c.prn();
		c.setColor("yellow"); // c.color = "yellow";
		c.setGearType("auto"); // c.gearType = "auto";
		c.setDoor(2); // c.door = 2;
		
		System.out.println(c.getColor()); // System.out.println(c.color);
		System.out.println(c.getGearType()); // System.out.println(c.gearType);
		System.out.println(c.getDoor()); // System.out.println(c.door);
		
		Car c1 = new Car("red");
		c1.prn();
		
		Car c2 = new Car("blue", "auto");
		c2.prn();
		
		Car c3 = new Car("green", "manual", 4);
		c3.prn();
	}
}
