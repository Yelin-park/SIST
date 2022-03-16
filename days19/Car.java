package days19;

public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;
	
	// [인터페이스 장점 3번째]
	// IEngine 인터페이스 선언 -> 인터페스로 구현하여 S_, K_, H_Engine 클래스 선언
	// 인터페이스 업캐스팅 : S,K,H 클래스를 IEngine 인터페이스로 업캐스팅하여 받겠다.
	private IEngine engine = null;
	
	// getter
	public IEngine getEngine() {
		return engine;
	}

	// [인터페이스 장점 3번째]
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	// [인터페이스 장점 3번째]
	// 디폴트 생성자 - 생성자 초기화
	Car() {
		this.engine = new S_Engine(); // engine을 안주면 S엔진 인스턴스 생성
	}
	
	// [인터페이스 장점 3번째]
	// 생성자를 통해서 엔진 객체 주입(DI : Dependence Injection) -> 의존성 주입(자체적으로 생성안하고 외부에서 가지고 오는 것)
	// 매배변수 다형성 중 인터페이스 매개변수 다형성
	// 매개변수 IEngine engine = S, K, H_Engine 클래스 선언
	Car(IEngine engine) {
		this.engine = engine;
	}
	
	// 메서드
	void speedUp(int fuel) { 	
		this.engine.moreFuel(fuel); 
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}

} // Car
