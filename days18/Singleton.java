package days18;

// public abstract class Singleton {
public class Singleton {
	
	// 필드
	// 인스턴스 변수 -> 클래스 변수 선언
	// Singleton.singleton
	private static Singleton singleton; // 자기 자신의 인스턴스(생성된 객체)를 참조할 참조변수(필드) 선언
	
	// 생성자
	// private는 내부에서만 접근가능하기 때문에 객체를 생성할 수 없음
	private Singleton() {
		
	}
	/*
	public Singleton(int n) {
		
	}
	
	public Singleton() {
		
	}
	*/
	
	// 클래스 메서드 : 싱글톤의 인스턴스를 돌려주는 메서드
	// 조건 : public인 동시에 static
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton(); // null이면 생성하고
		}
		return singleton; // null이 아니면 있는 것을 반환
	}

} // Singleton
