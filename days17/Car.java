package days17;

public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;
	Door[] d = new Door[4];   // 객체 배열
	
	// 클래스타입 객체;
	// Engine engine;
	// 결합력이 높은 코딩 -> 좋은 코딩이 아니다.
	// Engine engine = new Engine(); // 명시적 초기화   -> 좋은 코딩 X   왜? 엔진이 고장나면 자동차(Car 클래스) 전체를 버린다.
	
	private Engine engine = null;
	
	
	// getter
	public Engine getEngine() {
		return engine;
	}

	// setter
	// main() 메서드(외부)에서 engine 인스턴스 생성해서 주입을 받음
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	// 디폴트 생성자 - 생성자 초기화
	Car() {
		this.engine = new Engine(); // 엔진 인스턴스 생성
	}
	
	// main() 메서드(외부)에서 engine 인스턴스 생성한 다음에 주입을 받음
	// 생성자를 통해서 엔진 객체 주입(DI : Dependence Injection) -> 의존성 주입(자체적으로 생성안하고 외부에서 가지고 오는 것)
	// 자체적은 Car 클래스 안에서이고 외부는 main()에서
	Car(Engine engine) {
		this.engine = engine;
	}
	
	// 메서드
	void speedUp(int fuel) { 		 // 엑셀을 밟아서(엔진에 연료를 넣어서) 속도 증가 
		this.engine.moreFuel(fuel); // 에러 라인 : NullPointerException   -> 클래스타입 객체를 인스턴스 생성하지 않아서 발생
	}
	
	void speedDown(int fuel) {  // 브레이크를 밟아서 속도 감소
		this.engine.lessFuel(fuel);
	}
	
	void stop() {   // 속도 멈춤
		this.engine.stop();
	}

} // Car
