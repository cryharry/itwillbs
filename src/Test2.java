import packTest.packOne.AccessTest;

class SubOne extends AccessTest{ // 상속
	void subPrn() {
		System.out.println("SubOne subPrn() AccessTest상속");
		//System.out.println("a="+a); // 접근지정자 private
		//System.out.println("b="+b); // 생략(default)
		System.out.println("c="+c); // protected 다른 폴더(package)지만 상속관계
		System.out.println("d="+d); // public
	}
}

public class Test2 {
	public static void main(String[] args) {
		// 객체 생성 AccessTest
		AccessTest at = new AccessTest();
		System.out.println("AccessTest객체 생성");
		/*System.out.println("at.a="+at.a); private
		System.out.println("at.b="+at.b); 생략
		System.out.println("at.c="+at.c); protected */
		System.out.println("at.d="+at.d); //public
		at.prn();
		// 객체 생성 SubOne
		SubOne s = new SubOne();
		s.subPrn();
	}
}
