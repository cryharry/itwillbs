import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Test5 {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "root";
		PreparedStatement pstmt = null;
		String sql = "";
		int n_no = 0;
		BufferedReader br = null;
		try {
			// 1단계 드라이버로드
			Class.forName("com.mysql.jdbc.Driver");
			// 2단계 DB연결
			conn = DriverManager.getConnection(url, user, pwd);
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("삭제할 행번호: ");
			n_no = Integer.parseInt(br.readLine());
			// 3단계 sql 생성
			sql = "DELETE FROM CUSTOMER WHERE no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n_no);
			pstmt.executeUpdate();
			System.out.println("삭제 성공");
			// 4단계 실행
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) try { pstmt.close(); } catch (Exception e) {}
			if(conn != null) try { conn.close(); } catch(Exception e) {}
		}
	}
}
