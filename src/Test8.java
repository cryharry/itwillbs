import java.awt.*;
import java.awt.event.*;

class EventTest3 extends Frame implements WindowListener, ItemListener {
	Checkbox c1, c2, c3;
	CheckboxGroup g;
	TextField tf;
	public EventTest3() {
		 // 배치 FlowLayout
		setLayout(new FlowLayout());
		// 체크박스 생성 red green blue
		g = new CheckboxGroup();
		c1 = new Checkbox("red", g, true);
		c2 = new Checkbox("green", g, false);
		c3 = new Checkbox("blue", g, false);
		add(c1);
		add(c2);
		add(c3);
		tf = new TextField();
		add(tf);
		
		setSize(300, 200);
		setVisible(true);
		// 이벤트
		addWindowListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		Color c = Color.white;
		if(e.getSource() == c1) {
			c = Color.red;
		} else if(e.getItem() == "green") {
			c = Color.green;
		} else if(e.getSource() == c3) {
			c = Color.blue;
		}
		setBackground(c);
		c1.setBackground(c);
		c2.setBackground(c);
		c3.setBackground(c);
		
		 tf.setText(e.getItem().toString());
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

public class Test8 {
	public static void main(String[] args) {
		new EventTest3();
	}
}
