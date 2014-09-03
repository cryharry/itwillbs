import java.awt.*;
import java.awt.event.*;

class EventTest2 extends Frame implements WindowListener, ActionListener {
	// 버튼 2개
	Button redbtn, bluebtn;
	public EventTest2() {
		// 배치 FlowLayout()
		setLayout(new FlowLayout());
		// 버튼 생성
		redbtn = new Button("red");
		bluebtn = new Button("blue");
		// 프레임 붙이기
		add(redbtn);
		add(bluebtn);
		
		setSize(300, 200);
		setVisible(true);
		// 이벤트
		addWindowListener(this);
		redbtn.addActionListener(this);
		bluebtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == redbtn) {
			setBackground(Color.blue);
		} else if(e.getActionCommand() == "blue") {
			setBackground(Color.blue);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
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

public class Test7 {
	public static void main(String[] args) {
		new EventTest2();
	}
}
