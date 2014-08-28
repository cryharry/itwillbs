import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test8 {
	public static void main(String[] args) {
		// Generic 타입 : 생성시 미리 타입지정
		
		// Nongeneric
		List list = new ArrayList<>();
		list.add("일");
		list.add("이");
		list.add("삼");
		for( int i=0; i<list.size(); i++ ) {
			String str = (String)list.get(i); //다운캐스팅
			System.out.println(str);
		}
		// Generic
		List<String> list2 = new ArrayList<>();
		list2.add("일");
		list2.add("이");
		list2.add("삼");
		for( int i=0; i<list2.size(); i++ ) {
			String str = list2.get(i);
			System.out.println(str);
		}
		// generic 확장 for문
		System.out.println("확장for문");
		for(String s:list2) {
			System.out.println(s);
		}
		
		// Iterator
		System.out.println("Iterator");
		Iterator it = list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}// main method
} // main class 
