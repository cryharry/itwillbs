import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class EventTest1 extends Frame implements WindowListener{
	public EventTest1() {
		// 대상 - 이벤트 발생 - 이벤트 감지(리스너) - 동작실행
		setSize(300, 200);
		setVisible(true);
		// 프레임 창닫기 이벤트
		// 프레임 - 리스너 연결 - 리스너 상속 - 메서드 오버라이딩 - 동작실행
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose(); //자원해지
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}	
}

public class Test6 {
	public static void main(String[] args) {
		new EventTest1();
	}
}
