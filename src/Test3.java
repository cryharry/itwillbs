import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Test3 {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "root";
		PreparedStatement pstmt = null;
		String sql = "";
		int n_no = 0;
		String s_name, s_email, s_tel;
		BufferedReader br;
		try {
			// 1단계 드라이버로더
			Class.forName("com.mysql.jdbc.Driver");
			// 2단계 디비연결
			conn = DriverManager.getConnection(url, user, pwd);
			// 키보드로 입력할 데이터 입력받기
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("번호: ");
			n_no = Integer.parseInt(br.readLine()); // String => int
			System.out.print("이름: ");
			s_name = br.readLine();
			System.out.print("이메일: ");
			s_email = br.readLine();
			System.out.print("전화번호: ");
			s_tel = br.readLine();
			// 3단계 sql 생성
			sql = "INSERT INTO CUSTOMER(no, name, email, tel) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n_no); //첫번째 물음표
			pstmt.setString(2, s_name); //두번째 물음표
			pstmt.setString(3, s_email);
			pstmt.setString(4, s_tel);
			// 4단계 실행
			pstmt.executeUpdate();
			System.out.println("입력성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) try{ pstmt.close(); } catch(Exception e) {}
			if(conn != null) try{ conn.close(); } catch(Exception e) {}
		}
	}
}
