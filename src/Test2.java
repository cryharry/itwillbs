import java.awt.*;
import java.awt.event.*;

class EventTest2 extends Frame {
	Button b1;
	public EventTest2() {
		b1 = new Button("btn1");
		add(b1, "South");
		setSize(300, 200);
		setVisible(true);
		// 창닫기 이벤트 내부무명클래스
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		// 버튼 클릭 이벤트 내부무명클래스
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.yellow);
			}
		});
	}
}

public class Test2 {
	public static void main(String[] args) {
		new EventTest2();
	}
}
