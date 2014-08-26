import java.util.StringTokenizer;


public class Test4 {
	public static void main(String[] args) {
		// StringBuffer 자기자신값 바로수정
		StringBuffer str = new StringBuffer();
		str.append("Java "); // 추가
		System.out.println(str.toString());
		str.append("Programming");
		System.out.println(str);
		
		str.replace(0, 4, "JSP");
		System.out.println(str);
		
		str.insert(3, ",");
		System.out.println(str);
		
		StringTokenizer st = new StringTokenizer("사과#배#감#포도","#");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
