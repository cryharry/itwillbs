
public class Tv {
	// 멤버변수
	boolean power;// boolean형 power
	int channel;// 정수형 channel
	
	//메서드
	// powerOnOff() false -> true -> false
	void powerOnOff() {
		power = !power ;
	}
	// channelUp() channel 1증가
	void channelUp() {
		channel++;
	}
	// channelDown() channel 1감소
	void channelDown() {
		channel--;
	}
	/*void tv(int vol, boolean power) {
		this.channel = vol;
		this.power = power;
	}*/
}
