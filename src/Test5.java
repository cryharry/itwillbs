import java.awt.*;

import javax.swing.JFrame;

class FrameTest5 extends Frame {
	public FrameTest5() {
		setLayout(new FlowLayout());
		Button b = new Button("b1");
		add(b);
		Label la1 = new Label("ID: ");
		add(la1);
		TextField tf1 = new TextField(10);
		add(tf1);
		TextArea ta = new TextArea("input:",5,10);
		add(ta);
		ta.append("insert str"); //추가
		Checkbox c1 = new Checkbox("java");
		Checkbox c2 = new Checkbox("jsp");
		Checkbox c3 = new Checkbox("html");
		add(c1);
		add(c2);
		add(c3);
		CheckboxGroup g1 = new CheckboxGroup();
		Checkbox c4 = new Checkbox("java", g1, true);
		Checkbox c5 = new Checkbox("jsp", g1, false);
		Checkbox c6 = new Checkbox("html", g1, false);
		add(c4);
		add(c5);
		add(c6);
		Choice c = new Choice();
		c.add("sun");
		c.add("mon");
		c.add("tue");
		add(c);
		List li = new List();
		li.add("sun");
		li.add("mon");
		li.add("tue");
		add(li);
		
		setSize(300, 200);
		setVisible(true);
	}
}

public class Test5 {
	public static void main(String[] args) {
		new FrameTest5();
	}
}
