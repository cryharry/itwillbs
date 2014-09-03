import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test5 {
	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader buffer= new BufferedReader(reader);
		FileWriter writer = null;
		try {
			writer = new FileWriter("D:/workspace_java/project0901/output.txt");
			// int data = reader.read();
			// System.out.println((char)data);
			System.out.println("데이터 입력하세요.");
			String str = buffer.readLine();
			// System.out.println("입력데이터: " + str);
			writer.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(writer != null) try{writer.close();} catch(Exception e) {}
		}
	}
}
