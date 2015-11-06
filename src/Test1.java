import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Test1 {
	public static void main(String[] args) {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/nari";
		String user="root";
		String pwd="mysql";
		PreparedStatement pstmt=null;
		String sql="";
		ResultSet rs=null;
		ResultSetMetaData rsmd;
		try {
			//1단계 드라이버로더
			Class.forName("com.mysql.jdbc.Driver");
			//2단계 디비연결
			con=DriverManager.getConnection(url,user,pwd);
			//3단계 sql
			sql="select * from g4_write_schedule_mk_4";
			pstmt=con.prepareStatement(sql);
			//4단계 실행 => rs
			rs=pstmt.executeQuery();
			rsmd=rs.getMetaData();
			//열개수
			int cols=rsmd.getColumnCount();
			System.out.println("열개수:"+cols);
			//행의 맨마지막
			rs.last();
			//행개수
			int rows=rs.getRow();
			System.out.println("행개수:"+rows);
			//열제목 출력
			for(int i=1;i<=cols;i++){
				System.out.print(rsmd.getColumnName(i)+"\t\t");			
			}
			System.out.println("\n");
			//5단계 rs=>출력
			//행의 처음위치
			rs.first();
			for(int r=1;r<=rows;r++){//행
				for(int c=1;c<=cols;c++){//열
					System.out.print(rs.getObject(c)+"\t\t");
				}
				System.out.println();
				rs.next();
			}
			//닫기
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
