class Go3 implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("go");
		}
	}
}

class Come3 implements Runnable {
	@Override
	public void run() {
		System.out.println("come");
	}
}

public class Test8 {
	public static void main(String[] args) {
		Go3 g3 = new Go3();
		Come3 c3 = new Come3();
		Thread t1 = new Thread(g3);
		Thread t2 = new Thread(c3);
		t1.start();
		t2.start();
	}
}
