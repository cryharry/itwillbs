class Go {
	void go() {
		while(true) {
			System.out.println("go");
		}
	}
}

class Come {
	void come() {
		while(true) {
			System.out.println("come");
		}
	}
}

public class Test6 {
	public static void main(String[] args) {
		Go g = new Go();
		Come c = new Come();
		g.go();
		c.come();
	}
}