import java.sql.*;

public class Test1 {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "root";
		try {
			// 1단계 드라이버로더
			Class.forName("com.mysql.jdbc.Driver");
			// 2단계 디비연결(디비주소, 디비아이디, 디비비밀번호)
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}
