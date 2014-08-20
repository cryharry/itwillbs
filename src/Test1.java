import java.util.ArrayList;
import java.util.Random;

import kr.co.itwillbs.PackTest;

public class Test1 {
	public static void main(String[] args) {
		// 패키지 kr.co.itwillbs
		// 파일이름 PactTest
		// show() 메서드 정의 출력 "패키지공부하기"
		
		// 객체 생성 pt
		// import ctrl+space / ctrl+shift+o
		PackTest pt = new PackTest();
		// show() 메서드 호출
		pt.show();
		
		// 자바 API 기본폴더 java.lang
		System.out.println("출력");
		String s = "문자열";
		// 자바 API 원소스파일 => 자바설치폴더\src.zip
		// 자바 API 설명서 다운로드 : java.sun.com 자바 API 웹위치 : http://docs.oracle.com/javase/7/docs/api/index.html
		
		// java.util 패키지 => import
		ArrayList a = new ArrayList();
		a.add(1);
		a.add("이");
		a.add(3.4);
		System.out.println(a);
		
		Random r = new Random();
		System.out.println(r.nextInt(100));
	}
}
