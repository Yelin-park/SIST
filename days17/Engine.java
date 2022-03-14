package days17;

// 엔진 클래스 - 속성, 기능
public class Engine {
	
	// 필드 default
	int speed;
	
	
	// 메서드
	void moreFuel(int fuel) { // 속도 증가하는 메서드(엔진에 연료를 집어넣어 속도를 증가)
		this.speed += fuel * 0.05;  
	}
	
	void lessFuel(int fuel) { // 속도 감소하는 메서드(엔진에 연료를 빼서 속도를 감소)
		this.speed -= fuel * 0.05;  
	}
	
	void stop() { 
		this.speed = 0;
	}
	
} // Engine
