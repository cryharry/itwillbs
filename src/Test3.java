import java.io.FileOutputStream;
import java.io.InputStream;


public class Test3 {
	public static void main(String[] args) {
		int data = 0;
		InputStream myIn = System.in;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\workspace_java\\project0901\\test.dat");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("데이터입력 끝 ctrl z");
		try {
			while((data = myIn.read()) != -1) {
				fos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
