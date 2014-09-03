import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Test2 {
	public static void main(String[] args) {
		int data = 0;
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		System.out.println("데이터입력 끝 ctrl z");
		try {
			while((data = myIn.read()) != -1) {
				myOut.write(data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
