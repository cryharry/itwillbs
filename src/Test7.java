class Go2 extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("go");
		}
	}	
}

class Come2 extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("come");
		}
	}
}

public class Test7 {
	public static void main(String[] args) {
		// 멀티스레드 생성방법
		// 1. java.lang.Thread 클래스 상속
		// run() 메서드 오버라이딩
		// .start() 스레드 동작
		// 2. java.lang.Runnable 인터페이스 구현
		// run() 메서드 오버라이딩
		// Thread 객체 생성시 Runnable 요소 값 사용
		// start()
		Go2 g2 = new Go2();
		Come2 c2 = new Come2();
		// g2.run(); //메서드 호출
		// 스레드 시작
		g2.start();
		// c2.run(); // 메서드 호출
		// 스레드 시작
		c2.start();
		
	}
}
