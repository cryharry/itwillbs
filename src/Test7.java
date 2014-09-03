import java.io.File;
import java.util.Date;

public class Test7 {
	public static void main(String[] args) {
		File file = new File("D:/workspace_java/project0901/test6.txt");
		System.out.println("파일이름: " +file.getName());
		System.out.println("파일경로: " +file.getAbsolutePath());
		System.out.println("파일수정일: " + new Date (file.lastModified()));
		System.out.println("파일크기: " +file.length()); //바이트
		System.out.println("파일속성: " +file.canWrite());
		System.out.println("파일존재여부: " +file.exists());
		// 파일이 존재하면 삭제
		if(file.exists()) {
			file.delete();
		}
		System.out.println("파일존재여부: " +file.exists());
	}
}
