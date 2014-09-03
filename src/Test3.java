import java.awt.*;

class FrameTest3 extends Frame {
	public FrameTest3() {
		// 배치관리자 GridLayout
		setLayout(new GridLayout(3,2)); // 3행 2열
		add(new Button("button1"));
		add(new Button("button2"));
		add(new Button("button3"));
		add(new Button("button4"));
		add(new Button("button5"));
		
		setSize(300, 200);
		setVisible(true);
	}
}

public class Test3 {
	public static void main(String[] args) {
		new FrameTest3();
	}
}
