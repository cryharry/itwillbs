import java.io.IOException;


public class Test1 {
	public static void main(String[] args) {
		// 자바 IO 데이터 종류
		// byte : 이미지파일 바이너리 위주 데이터 입출력
		// 입력 : InputStream - FileInputStram  출력 : OutputStream - FileOutputStream
		// char : 입출력 char 처리, 텍스트 위주 데이터 입출력
		// 입력 : InputStramReader - BufferedReader, FileReader 출력 : OutputStreamWriter - BufferedWriter, FileWriter
		
		// 표준 입출력
		// 입력 System.in.read()
		// 출력 System.out.println()
		
		int data = 0;
		System.out.println("데이터 입력 끝내려면 ctrl+z(-1) 누르세요.");
		
		try {
			while((data=System.in.read()) != -1) { //입력 != -1 
				System.out.print((char)data+ " ");// 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
