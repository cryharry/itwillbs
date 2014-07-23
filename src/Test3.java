
public class Test3 {
	public static void main(String[] args) {
/*
  		switch(변수 또는 식){
		case 값1: 명령문1; break;
		case 값2: 명령문2; break;
		case 값3: 명령문3; break;
			default : 나머지 명령문;
		}
*/		
		int a = 1; //1 월 2 화 3 수 4 목 5 금 6 토 7 일
		String str = "";
		switch(a) {
			case 1: str = "월"; break;
			case 2: str = "화"; break;
			case 3: str = "수"; break;
			case 4: str = "목"; break;
			case 5: str = "금"; break;
			case 6: str = "토"; break;
			case 7: str = "일"; break;
			default : str = "요일 아님";
		}
		System.out.println(str);
		
		char c = 'A'; //'A' 아주잘함 'B' 잘함 'C' 보통 'D' 못함 'F' 아주못함
		switch(c) {
			case 'A': str = "아주잘함";break;
			case 'B': str = "잘함";break;
			case 'C': str = "보통";break;
			case 'D': str = "못함";break;
			case 'F': str = "아주못함";break;
			default : str = "학점이 아니네요!";
		}
		System.out.println(str);
	}
}
