// 클래스 Tv
class Tv {	
// 멤버변수 정수형 channel
	int channel;
// 메서드 void channelUp() channel 1증가
	void channelUp() {
		channel++;
	}
//	     void channelDown() channel 1감소
	void channelDown() {
		channel--;
	}
}

// 클래스 CaptionTv 상속 Tv
class CaptionTv extends Tv {	
// 멤버변수 boolean caption 캡션상태
	boolean caption;
// 메서드 void displayCaption() "캡션상태:" true/false
	void displayCaption() {
		System.out.println("캡션상태: "+caption);
	}
}
public class Test4 {
	public static void main(String[] args) {
		// CaptionTv 객체 생성
		CaptionTv cap = new CaptionTv();
		// 메서드 호출 channelUp()
		cap.channelUp();
		// 출력 channel
		System.out.println(cap.channel);
		// 메서드 호출 displayCaption()
		cap.displayCaption();
	}
}
