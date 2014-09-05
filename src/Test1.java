import javax.swing.*;

class JFramTest1 extends JFrame {
	public JFramTest1() {
		// 데이터 배열
		Object [][] data = {
				{"홍길동", "111-1111", "hong@daum.com"},
				{"김길동", "222-2222", "kim@daum.com"},
				{"이길동", "333-3333", "lee@daum.com"}
		};
		// 데이터 열이름
		String [] columnName = {"이름", "전화번호", "이메일"};
		// 모양 JTable + 데이터
		JTable table = new JTable(data, columnName);
		// 붙이기
		add(new JScrollPane(table));
		setSize(400, 200);
		setVisible(true);
	}
}
public class Test1 {
	public static void main(String[] args) {
		// JList JTree JTable
		// 모양 , 데이터 , 이벤트
		// 뷰(v), 모델(m) , 컨트롤(c) => MVC구조
		new JFramTest1();
	}
}
