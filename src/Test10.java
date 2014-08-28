import java.util.Hashtable;

public class Test10 {
	public static void main(String[] args) {
		// Map - Hashtable 키,값 저장
		//Hashtable map = new Hashtable();
		Hashtable<String, String> map = new Hashtable<>();
		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("address", "부산");
		
		System.out.println(map);
		System.out.println("이름: " +map.get("name"));
		//String name = (String)map.get("name"); //다운캐스팅
		String name = map.get("name"); //generic
		System.out.println("나이: " +map.get("age"));
		System.out.println("주소: " +map.get("address"));
	}
}
