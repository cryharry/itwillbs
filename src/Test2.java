import java.awt.*;

class FrameTest2 extends Frame {
	public FrameTest2() {
		// 배치관리자 FlowLayout 기본배치관리자 - Panel
		setLayout(new FlowLayout()); // 위 -> 아래, 왼쪽 -> 오른쪽
		// 버튼 추가
		add(new Button("button1"));
		Button btn2 = new Button("button2");
		add(btn2);
		add(new Button("button3"));
		add(new Button("button4"));
		add(new Button("button5"));
		
		setSize(300, 200);
		setVisible(true);
	}
}

public class Test2 {
	public static void main(String[] args) {
		new FrameTest2();
	}
}
