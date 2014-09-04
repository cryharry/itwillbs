import java.awt.*;
import java.awt.event.*;

class EventTest3 extends Frame {
	public EventTest3() {
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
// 내부 클래스
/*class SubClass extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}*/

public class Test3 {
	public static void main(String[] args) {
		new EventTest3();
	}
}
