import java.util.ArrayList;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add("이");
		list.add(3.5);
		list.add('4');
		System.out.println(list);
		for( int i=0; i<list.size(); i++ ) {
			System.out.println("list["+i+"]: " + list.get(i).toString());
		}
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add("");
	}
}
