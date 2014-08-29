class SharedData {
	int data;
	synchronized void up(String name) { // 동기화
		System.out.println(name + "이 " + data);
		data++;
		System.out.println("를 " + data + "로 증가시킴");
	}
	synchronized void down(String name) { // 동기화
		System.out.println(name + "이 " + data);
		data--;
		System.out.println("를 " + data + "로 감소시킴");
	}
}

class UpThread extends Thread {
	SharedData data;
	String name;
	UpThread(SharedData data, String name) {
		this.data = data;
		this.name = name;
	}
	@Override
	public void run() {
		// up() 메서드 호출
		for(int i=0; i<4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			data.up(name);
		}
	}
}

class DownThread extends Thread {
	SharedData data;
	String name;
	DownThread(SharedData data, String name) {
		this.data = data;
		this.name = name;
	}
	@Override
	public void run() {
		// down() 메서드 호출
		for(int i=0; i<4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			data.down(name);
		}
	}
}

public class Test10 {
	public static void main(String[] args) {
		// 동기화 : 특정영역(작업)을 하나의 스레드 동작 시작하고 끝나면 다른 스레드 동작
		// 접근지정자 synchronized 리턴타입 메서드명(){}
		SharedData sd = new SharedData();
		UpThread t1 = new UpThread(sd, "UP");
		DownThread t2 = new DownThread(sd, "DOWN");
		t1.start();
		t2.start();
		
	}
}
