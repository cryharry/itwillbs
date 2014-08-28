import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test9 {
	public static void main(String[] args) {
		Vector v = new Vector(4, 3); //기억장소 4개 추가 3개씩
		v.add("1");
		v.add(2);
		v.add(3.4);
		System.out.println(v);
		// for 출력
		for( int i=0; i<v.size(); i++ ) {
			System.out.println("Vector[" + i + "]:" +v.get(i));
		}
		// Iterator
		Iterator iter = v.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		// Enumeration 
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
