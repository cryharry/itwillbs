import java.awt.Frame;

class FrameTest extends Frame {
	// 생성자
	public FrameTest() {
		setSize(300, 200);
		setVisible(true);
	}
}

public class Test9 {
	public static void main(String[] args) {
		//FrameTest ft = new FrameTest();
		new FrameTest();
	}
}
