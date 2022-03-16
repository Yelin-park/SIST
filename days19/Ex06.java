package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오전 11:21:16
 * @subject p410 익명(무명) 클래스(anonymous class) *****
 * @content
 * 
 * 			new 부모클래스();  -> 부모클래스로 객체 생성하겠다 라는 코딩 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 익명 클래스의 특징
		// 1. 클래스 선언 + 생성 -> 같이 있다.
		// 2. 일회성 클래스 -> 오직 한개의 객체 생성이 된다.
		// 3. 익명 클래스 선언 형식
		/*
		 * new 부모클래스() {
		 * 		// 필드 선언 X
		 * 		// 부모클래스의 메서드만 오버라이딩(재정의)할 수 있다.
		 * }
		 * 
		 * new 인터페이스() {
		 * 		// 인터페이스의 추상메서드만 오버라이딩(재정의)할 수 있다. 
		 * }
		 */
		
		// 원래는 인터페이스로 클래스를 구현하고 객체를 생성할 수 있음
		// class K_Engine implements IEngine{}   // 클래스 선언
		// Car myCar = new Car(new K_Engine());  // 객체 생성
		
		Car myCar = new Car(new IEngine() { // 익명클래스
					
					@Override
					public void stop() { }
					@Override
					public void moreFuel(int fuel) { }
					@Override
					public void lessFuel(int fuel) { } 
				}
			);
		
		myCar.speedUp(10);
		
	} // main

} // class
