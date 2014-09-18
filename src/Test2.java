import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

class MemberMan extends JFrame implements ActionListener{
	JPanel p1,p2,p3,p4,p5,panWest;
	JTextField txtNo,txtName,txtEmail,txtTel;
	JButton btnTotal,btnAdd,btnDel;
	JTable table;
	
	Connection con=null;
	String url="jdbc:mysql://localhost:3306/test";
	String user="root";
	String pwd="root";
	PreparedStatement pstmtInsert,pstmtDelete,pstmtSelect,pstmtSelectRow;
	ResultSet rs,rsRow;
	ResultSetMetaData rsmd;
	String sql="";
	
	public MemberMan() {
		//배치 GridLayout(5,1)
		panWest=new JPanel(new GridLayout(4,1));
		//판넬 p1 번호 txtNo
		p1=new JPanel();
		p1.add(new JLabel("번호"));
		p1.add(txtNo=new JTextField(10));
		panWest.add(p1);
		//판넬 p2 이름 txtName
		p2=new JPanel();
		p2.add(new JLabel("이름"));
		p2.add(txtName=new JTextField(10));
		panWest.add(p2);
		//판넬 p3 이메일 txtEmail
		p3=new JPanel();
		p3.add(new JLabel("이메일"));
		p3.add(txtEmail=new JTextField(10));
		panWest.add(p3);
		//판넬 p4 전화번호 txtTel
		p4=new JPanel();
		p4.add(new JLabel("전화번호"));
		p4.add(txtTel=new JTextField(10));
		panWest.add(p4);
		
		add(panWest,"West");
		//판넬 p5 전체보기 추가 삭제
		p5=new JPanel();
		p5.add(btnTotal=new JButton("전체보기"));
		p5.add(btnAdd=new JButton("추가"));
		p5.add(btnDel=new JButton("삭제"));
		add(p5,"South");
		
		setSize(700, 300);
		setVisible(true);
		//이벤트
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		//디비연결메서드
		connectDb();
	}
	public void connectDb(){
		try {
			//1단계
			Class.forName("com.mysql.jdbc.Driver");
			//2단계
			con=DriverManager.getConnection(url,user,pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void total(){
		int rows,cols;//행,열 개수
		String[] columnName;//열이름
		Object[][] data; //데이터
		try {
			//3단계 select 
			sql="select * from customer";
			pstmtSelect=con.prepareStatement(sql);
			pstmtSelectRow=con.prepareStatement(sql);
			//4단계 rs<=실행 저장
			rs=pstmtSelect.executeQuery();//데이터
			rsRow=pstmtSelectRow.executeQuery();//행
			//행
			rsRow.last();
			rows=rsRow.getRow();
			//열
			rsmd=rs.getMetaData();
			cols=rsmd.getColumnCount();
			//열이름
			columnName=new String[cols];
			for(int i=0;i<columnName.length;i++){
				columnName[i]=rsmd.getColumnName(i+1);
			}
			//데이터
			data=new Object[rows][cols];
			for(int r=0;r<rows;r++){ //행
				rs.next();
				for(int c=0;c<cols;c++){ //열
				data[r][c]=rs.getObject(c+1);	
				}
			}
			//Jtable생성(데이터,열이름) 붙이기
			table=new JTable(data,columnName);
			add(new JScrollPane(table),"Center");
			//화면보이기
			setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void add(){
		try {
			//텍스트 상자 데이터 가져오기
			String strNo=txtNo.getText();
			String strName=txtName.getText();
			String strEmail=txtEmail.getText();
			String strTel=txtTel.getText();
			//strNo strName 비어있으면 입력제어
			if(strNo.length()<1 || strName.length()<1){
				JOptionPane.showMessageDialog(null, "필수사항입력하세요");
				return;
			}
			
			//3단계 insert
			sql="insert into customer(no,name,email,tel) values(?,?,?,?)";
			pstmtInsert=con.prepareStatement(sql);
			pstmtInsert.setInt(1, Integer.parseInt(strNo));
			pstmtInsert.setString(2, strName);
			pstmtInsert.setString(3, strEmail);
			pstmtInsert.setString(4, strTel);
			//4단계 실행
			pstmtInsert.executeUpdate();
			//"회원가입성공" 텍스트 상자 "" 설정
			JOptionPane.showMessageDialog(null, "회원가입성공");
			txtNo.setText("");
			txtName.setText("");
			txtEmail.setText("");
			txtTel.setText("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void del(){
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnTotal==e.getSource()){
			total();
		}else if(e.getSource()==btnAdd){
			add();
		}else if(e.getSource()==btnDel){
			del();
		}
	}
}
public class Test2 {
	public static void main(String[] args) {
		MemberMan m=new MemberMan();
	}
}
