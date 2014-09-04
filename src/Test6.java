import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JFrameTest2 extends JFrame {
	JPanel p1, p2, p3, p4, p5;
	JTextField txtName, txtID, txtPwd, txtAge;
	JButton btnAdd, btnCan;
	public JFrameTest2() {
		setLayout(new GridLayout(5,1));
		// 판넬1 이름 : 텍스트필드
		p1 = new JPanel();
		p1.add(new JLabel("이름"));
		p1.add(txtName = new JTextField(10));
		// 판넬2 아이디 : 텍스트필드
		p2 = new JPanel();
		p2.add(new JLabel("아이디"));
		p2.add(txtID = new JTextField(10));
		// 판넬3 패스워드 : 텍스트필드
		p3 = new JPanel();
		p3.add(new JLabel("패스워드"));
		p3.add(txtPwd = new JTextField(10));
		// 판넬4 나이 : 텍스트필드
		p4 = new JPanel();
		p4.add(new JLabel("나이"));
		p4.add(txtAge = new JTextField(10));
		// 판넬5 가입하기,다시쓰기 : 버튼
		p5 = new JPanel();
		p5.add(btnAdd = new JButton("가입하기"));
		p5.add(btnCan = new JButton("다시쓰기"));
		
		add(p1); add(p2); add(p3); add(p4); add(p5);
		setSize(300, 200);
		setVisible(true);
	}
}

public class Test6 {
	public static void main(String[] args) {
		new JFrameTest2();
	}
}
