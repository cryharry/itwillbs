import java.awt.*;
import java.awt.event.*;

class EventTest4 extends Frame {
	Checkbox c1;
	TextArea ta;
	public EventTest4() {
		c1 = new Checkbox("c1");
		add(c1, "North");
		ta = new TextArea();
		add(ta, "Center");
		
		setSize(300, 200);
		setVisible(true);
		// 창닫기 내부무명클래스 이벤트
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 체크박스 내부무명클래스 이벤트
		c1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = ".deselect";
				if(e.getStateChange() == ItemEvent.SELECTED) str = ".select";
				ta.append(e.getItem()+ ":" +str+ "\n");
			}
		});
	}
}

public class Test4 {
	public static void main(String[] args) {
		new EventTest4();
	}
}
