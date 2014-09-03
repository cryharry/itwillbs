import java.io.FileInputStream;
import java.io.OutputStream;

public class Test4 {
	public static void main(String[] args) {
		int data = 0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:/workspace_java/project0901/test.dat");
			OutputStream myOut = System.out;
			while((data = fis.read()) != -1) {
				myOut.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fis != null) try{fis.close();} catch(Exception e) {}
		}
		
	}
}
