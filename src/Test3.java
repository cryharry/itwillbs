
public class Test3 {
	public static void main(String[] args) {
		// 객체 생성 (생성자)
		String str = "Java Programming";
		// 멤버변수
		// 메서드
		System.out.println("문자열길이:"+str.length());
		// 문자열비교
		if(str.equals("Java Programming")) System.out.println("문자열같음");
		// 문자열 가져오기
		System.out.println("0시작 5번째 문자:" +str.charAt(5)); //P
		System.out.println("0시작 5~8앞 문자열:" +str.substring(5, 8)); //Pro
		System.out.println("0시작 5~끝까지 문자열:" +str.substring(5)); //Programming
		System.out.println("문자열합치기:" +str.concat("!!!"));
		System.out.println("문자열바꾸기:" +str.replace("Java", "JSP"));
		System.out.println("문자 앞에서 첫번째 a의 위치:" +str.indexOf('a')); //1
		System.out.println("문자 뒤에서 첫번째 a의 위치:" +str.lastIndexOf('a')); //10
		System.out.println("대문자:" +str.toUpperCase());
		System.out.println("문자열분리:" + str.split(" ")[0]);
		
		// 주민 => 남, 여 구분
		String j = "951220-3234567";
		// 성별구분 문자 뽑아오기 charAt, subString
		char c = j.charAt(7);
		String s = j.substring(7,8);
		// if 비교 < char == > or < String.equals() > 후 남녀 출력
		if(c == '1' || s.equals("3")) {
			System.out.println("남");
		} else {
			System.out.println("여");
		}
		System.out.println(str);
		str = str.substring(5);
		System.out.println(str);
		System.out.println(j);
		
	} //메인메소드
}//클래스
