import java.util.*;

class ListTest {
	List<Object> person() {
		List<Object> list = new ArrayList<Object>();
		// 값 저장
		list.add("홍길동");
		list.add(123);
		list.add(3.14f);
		return list;
	}
}

public class Test6 {
	public static void main(String[] args) {
		// 객체 생성 listtest
		ListTest listtest = new ListTest();
		// List list = 메서드 호출 person()
		List<Object> list = listtest.person();
		// 출력 for
		for( int i=0; i< list.size(); i++ ) {
			System.out.println("list[" + i + "]: " + list.get(i).toString() );
		}
		
	}
}
