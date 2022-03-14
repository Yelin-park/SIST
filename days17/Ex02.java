package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오전 10:13:21
 * @subject p310 Chapter 07 객체 지향적 프로그래밍II - 상속(Inheritance)
 * @content has-a와 의존성 주입에 대한 내용
 * 
 * 			클래스들 간의 2가지 관계
 * 				1) has-a 관계 (자동차는 엔진, 핸들 등을 가진다) 
 * 					자동차(물건, 객체) 클래스          					 Car class
 * 					 ㄴ 클래스는 수십만개의 부품(객체)으로 이루어져있다. Engine class 등
 * 
 * 				Car - Engine 클래스들 간의 관계 : Car has Engine (Car가 Engine 클래스를 가진다)
 * 				Car.engine.moreFuel(20);
 * 
 * 				2) is-a 관계(상속)
 */
public class Ex02 {

	public static void main(String[] args) {
		// 에러메시지 : java.lang.NullPointerException => Car 클래스 안에 Engine 클래스 객체의 인스턴스 생성 안해서 발생
		Engine engine = new Engine();
		
		// Car myCar = new Car(engine);  // 생성자를 통한 의존성 주입(DI : Dependence Injection) -> 엔진 객체를 주입
		Car myCar = new Car();
		
		myCar.setEngine(engine); // setter를 통한 의존성 주입(DI)
		
		myCar.speedUp(20);
		
		System.out.println("= END =");
		
	} // main

} // class

/*
// has-a 관계
// System.out.println("홍길동");

class System {
	// 필드
	static PrintStream out;
}

class PrintStream {
	void println() {}
}
*/
