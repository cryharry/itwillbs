
public class Test3 {
	public static void main(String[] args) {
		// Tv객체 생성 t
		Tv t = new Tv();
		// 메서드 호출 powerOnOff()
		t.powerOnOff();
		// 출력 power
		System.out.println("power 호출: "+t.power);
		// 메서드 호출 channelUp()
		t.channelUp();
		// 메서드 호출 channelUp()
		t.channelUp();
		// 출력 channel
		System.out.println("channelUp 2번: "+t.channel);
		// 메서드 호출 channelDown()
		t.channelDown();
		// 출력 channel
		System.out.println("channelDown 1번: "+t.channel);
		
		/*t.tv(5, false);
		System.out.println("channel:"+t.channel+"\tpower:"+t.power);*/
		
	}
}
