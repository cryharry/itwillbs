import java.awt.*;
import java.awt.event.*;

class EventTest1 extends Frame implements WindowListener, ActionListener{
	TextArea ta;
	TextField tf;
	public EventTest1() {
		setLayout(new BorderLayout());
		// ta 생성 Center 붙이기
		ta = new TextArea();
		add(ta, "Center");
		// tf 생성 South 붙이기
		tf = new TextField();
		add(tf, "South");
		ta.setEditable(false); // TextArea 수정불가
		setSize(300, 200);
		setVisible(true);
		tf.requestFocus(); // TextField 커서
		// 이벤트
		addWindowListener(this); //창닫기
		tf.addActionListener(this); // TextField 이벤트
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf.getText()+"\n");
		tf.setText("");
		tf.requestFocus();
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

public class Test1 {
	public static void main(String[] args) {
		new EventTest1();
	}
}
