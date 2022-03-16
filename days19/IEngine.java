package days19;

public interface IEngine {
	// 상수 (public static final 생략 가능)
	int MAX_SPEED = 300;
	
	// 추상메서드 (public abstract 생략 가능)
	void moreFuel(int fuel);
	void lessFuel(int fuel);
	void stop();
	
	//[Ex04 관련]
	// void print(); // 시간이 한참 지난뒤 인터페이스 안에 새로운 메서드 추가(p401 디폴트 메서드 내용 중 인터페이스에 메서드 추가하는 일 보통일 아님)
				     // -> IEngine으로 구현한 클래스가 다 에러 발생 -> 새로 추가한 메서드를 재정의 해야함 -> 재정의하지 않으면 추상클래스
	
	// JDK 1.8부터 static 메서드, 디폴트 메서드를 가질 수 잇음
	// [디폴트 메서드] 왜 필요했을까? 
	// [Ex04 관련]
	default void print() {
		// 코딩
		// 코딩
	}
	
	// [static 메서드] : 클래스를 구현하지 않아도 인터페이스로 메서드를 사용할 수 있도록 하는 것(static(클래스) 메서드와 같은 동작방식)
	// static메서드는 인스턴스를 생성하지 않고도 사용 가능한 메서드
	static void test() {
		System.out.println("> IEngine.test()..");
	}
	
} // IEngine interface

