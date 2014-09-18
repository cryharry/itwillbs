import java.sql.*;

public class Test2 {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "root";
		PreparedStatement pstmt = null;
		String sql = "";
		ResultSet rs = null;
		try {
			// 1단계 드라이버로더
			Class.forName("com.mysql.jdbc.Driver");
			// 2단계 디비연결
			conn = DriverManager.getConnection(url, user, pwd);
			// 3단계 sql문 생성
			sql = "SELECT * FROM CUSTOMER";
			pstmt = conn.prepareStatement(sql);
			// 4단계 실행 => 결과저장
			rs = pstmt.executeQuery();
			// 5단걔 결과 => 출력
			System.out.print("번호" + "\t" +"이름"+ "\t" +"이메일"+ "\t" +"전화번호"+ "\n");
			while(rs.next()) { // 행데이터있으면 true 없으면 false
				int n_no = rs.getInt("no"); // 열이름, 열번호
				String s_name = rs.getString("name"); // 열번호 2
				String s_email = rs.getString("email");
				String s_tel = rs.getString("tel");
				System.out.print(n_no + "\t" +s_name+ "\t" +s_email+ "\t" +s_tel+ "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 닫기
			if(rs != null) try{ rs.close(); } catch(Exception e) {}
			if(pstmt != null) try{ pstmt.close(); } catch(Exception e) {}
			if(conn != null) try{ conn.close(); } catch(Exception e) {}
		}
	}
}
