import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Test4 {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "root";
		PreparedStatement pstmt = null;
		String sql = "";
		int n_no = 0;
		String s_tel;
		BufferedReader br = null;
		try {
			// 1단계 드라이버로드
			Class.forName("com.mysql.jdbc.Driver");
			// 2단계 DB연결
			conn = DriverManager.getConnection(url, user, pwd);
			// 수정할 값 키보드로 입력받기
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("변경될 전화번호: ");
			s_tel = br.readLine();
			System.out.print("변경하고 싶은 행의 번호: ");
			n_no = Integer.parseInt(br.readLine());
			// 3단계 sql 생성 update no에 헤당하는 tel 수정
			sql = "UPDATE CUSTOMER SET tel = ? WHERE no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s_tel);
			pstmt.setInt(2, n_no);
			pstmt.executeUpdate();
			System.out.println("변경성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) try{ pstmt.close(); } catch(Exception e) {}
			if(conn != null) try{ conn.close(); } catch(Exception e) {}
		}
	}
}
