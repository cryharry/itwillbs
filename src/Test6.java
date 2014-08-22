abstract class ATest1 {}
abstract class ATest2 {}

interface ITest1 {
	void iTest1Method();
}
interface ITest2 {
	void iTest2Method();
}
interface ITest3  extends ITest1, ITest2{ // 다중상속(인터페이스) 인터페이스끼리 상속시 extends(확장)로 상속
	void iTest3Method();
}

class SubTest extends ATest1 implements ITest1{// 추상클래스 상속(추상클래스 다중상속 불가) 인터페이스 상속
	@Override
	public void iTest1Method() {
	} 
}

class SubTest2 implements ITest1, ITest2 {// 인터페이스 다중상속
	@Override
	public void iTest1Method() {
	}
	@Override
	public void iTest2Method() {
	} 
}

class SubTest3 implements ITest3 {
	@Override
	public void iTest1Method() {
	}
	@Override
	public void iTest2Method() {
	}
	@Override
	public void iTest3Method() {
	}
}
public class Test6 {
	public static void main(String[] args) {
		
	}
}
