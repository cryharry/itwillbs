import java.awt.*;

class FrameTest1 extends Frame {
	public FrameTest1() {
		// 배치관리자 BorderLayout 기본설정 Window Frame Dialog
		setLayout(new BorderLayout()); //동서남북가운데
		// 화면 붙이기
		add(new Button("button1"), BorderLayout.EAST);
		add(new Button("button2"), "West");
		add(new Button("button3"), "South");
		add(new Button("button4"), "North");
		add(new Button("button5"), "Center");
		
		setSize(300, 200);
		setVisible(true);
	}
}

public class Test1 {
	public static void main(String[] args) {
		new FrameTest1();
	}
}
