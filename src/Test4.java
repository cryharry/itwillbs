import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		// 컬렉션 : 자료구조 저장공간
		// Set : <HashSet> 순서없는 여러형저장
		Set<Object> set = new HashSet<Object>();
		set.add("하나");
		set.add(1);
		set.add(2.5);
		set.add("삼");
		System.out.println(set);
		/* List : <ArrayList>, <Vector> 순서있는 여러형저장
		=> ArrayList : Test6 ~ Test8 class
		=> Vector, Enum, Iterator, Enumeration : Test9 class
		Map : <HashMap>, <Hashtable> 키(이름), 값
		=> Hashtable : Test10 class
		*/
	}
}
