import java.awt.*;

class FrameTest4 extends Frame {
	public FrameTest4() {
		setLayout(new BorderLayout());
		Panel p = new Panel();
		p.setBackground(Color.green);
		p.add(new Button("North"));
		p.add(new Button("South"));
		
		add(p, "North");
		add(new Button("East"), BorderLayout.EAST);
		add(new Button("West"), BorderLayout.WEST);
		add(new Button("Center"), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
}

public class Test4 {
	public static void main(String[] args) {
		new FrameTest4();
	}
}
