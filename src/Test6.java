import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class Test6 {
	public static void main(String[] args) {
		String id = null, pwd = null, age = null;
		// 객체 생성 InputStreamReader BufferedReader FileWriter
		InputStreamReader reader = null;
		BufferedReader buffer = null;
		FileWriter writer = null;
		try {
			reader = new InputStreamReader(System.in);
			buffer = new BufferedReader(reader);
			// 입력
			System.out.print("아이디: ");
			id = buffer.readLine();
			System.out.print("비밀번호: ");
			pwd = buffer.readLine();
			System.out.print("나이: ");
			age = buffer.readLine();
			// 파일 출력
			writer = new FileWriter("D:/workspace_java/project0901/test6.txt", true);
			writer.write(id);
			writer.write("\r\n");
			writer.write(pwd);
			writer.write("\r\n");
			writer.write(age);
			writer.write("\r\n");
			// 아이디 출력 다음줄 내리기 출력 "\r\n"
			System.out.println("아이디: " + id);
			System.out.println("비밀번호: " + pwd);
			System.out.println("나이: " + age);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(reader != null) try{reader.close();} catch(Exception e) {}
			if(buffer != null) try{buffer.close();} catch(Exception e) {}
			if(writer != null) try{writer.close();} catch(Exception e) {}
		}
	}
}
