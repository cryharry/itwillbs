import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JFrameTest extends JFrame implements ActionListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JRadioButton rb1, rb2;
	public JFrameTest() {
		setLayout(new FlowLayout());
		btn1 = new JButton("버튼1");
		add(btn1);
		btn2 = new JButton("버튼2");
		add(btn2);
		btn3 = new JButton("버튼3");
		add(btn3);
		rb1 = new JRadioButton("남", true);
		rb2 = new JRadioButton("여", false);
		ButtonGroup g = new ButtonGroup();
		g.add(rb1); g.add(rb2);
		add(rb1); add(rb2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		
		// 버튼이벤트
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		// 라디오박스 내부무명클래스
		rb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JOptionPane.showMessageDialog(null, "라디오선택");
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) JOptionPane.showMessageDialog(null, "매세지");
		else if(e.getSource() == btn2) {
			int an = JOptionPane.showConfirmDialog(null, "종료할까요?");
			if(an == JOptionPane.YES_OPTION) System.exit(0);
		}
		else if(e.getSource() == btn3) {
			String str = JOptionPane.showInputDialog("이름 입력하세요");
			JOptionPane.showMessageDialog(null, str);
		}
	}
}

public class Test5 {
	public static void main(String[] args) {
		new JFrameTest();
	}
}
