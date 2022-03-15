package days18;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 3:20:06
 * @subject ******* p381 인터페이스 *******
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		/*
		 * 자바 자료형
		 * 	ㄴ 기본형 - 8가지
		 * 	ㄴ 참조형 - 배열, 클래스, 인터페이스
		 * 
		 * 1. 인터페이스 - 참조타입 자료형
		 * 
		 * 2. 일종의 추상클래스
		 * 			추상메서드 + 객체를 생성할 수 없는 미완성의 클래스
		 * 
		 * 3. 일반메서드 X, 필드(멤버변수) X -> 하나도 없다.
		 * 		100% 추상메서드, 상수 만을 가지는 추상클래스 == 인터페이스
		 * 
		 * 4. 다른 클래스를 선언(작성)할 때 도움을 줄 목적으로 사용된다.
		 * 
		 * 5. 인터페이스 선언 형식
		 * 		class 키워드 대신 interface 키워드 사용한다.
		 * 		접근지정자 4가지 사용 가능, 기타제어자는 사용 X
		 * 		[접근지정자] interface 인터페이스명 {
		 * 			// 추상메서드 선언(abstract, {} 블럭 없음 - 몸체만 구현됨)
		 * 			// 상수 선언(final 멤버변수)
		 * 		}
		 * 
		 * 6. 인터페이스의 멤버의 제약사항
		 * 	ㄱ. 모든 멤버 변수 == 상수
		 * 		public static final 생략 가능
		 * 	ㄴ. 모든 메서드 == 추상메서드
		 * 		public abstract 생략 가능
		 * 
		 * 7. JDK 1.8부터 변경
		 * 		1) static 메서드를 가질 수 있다.
		 * 		2) default 메서드를 가질 수 있다.  (디폴트메서드 아직 배운적 x)
		 * 
		 * 8. 인터페이스의 상속
		 * 		1) 인터페이스 끼리는 상속이 가능하다.
		 * 		2) 다중상속도 가능하다
		 * 		3) [참고] Object가 조상클래스가 아니다.
		 * 
		 * 9. 인터페이스 [매개변수] 다형성 - Ex13,14,15.java
		 * 
		 * 10. 인터페이스 장점 - Ex16.java
		 * 
		*/
	} // main

} // class

class Unit2{
	int currentHP; // 유닛 체력
	int x; // 유닛 현재 위치(x좌표)
	int y; // 유닛 현재 위치(y좌표)
	
} // Unit2

interface Movable{
	// public abstract 생략
	void move(int x, int y);
} // Movable

interface Attackable{
	void attack(Unit2 u); // 공격할 대상 == Unit
} // Attackable

// 인터페이스들끼리 상속받을 때 extends 사용, 다중상속 가능
interface Fightable extends Movable, Attackable{
	// void attack(Unit2 u);   	-> 상속받아짐
	// void move(int x, int y); -> 상속받아짐
	void stop();
} // Fightable

class Tank2 extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {	}

	@Override
	public void attack(Unit2 u) {	}

	@Override
	public void stop() {	}
	
} // Tank2

// 인터페이스 다중상속
class Figther extends Unit2 implements Movable, Attackable{
	
	// currentHP, x, y -> Unit2 클래스로 이동

	@Override
	public void move(int x, int y) {
		System.out.println("움직임 코딩 구현");
	}

	@Override
	public void attack(Unit2 u) {
		System.out.println("공격 코딩 구현");
	}
	
} // Figther


