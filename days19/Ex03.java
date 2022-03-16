package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오전 10:26:07
 * @subject p397 인터페이스의 이해 : 본질적인 것에 대한
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [인터페이스 이해하기 위해서 2가지 사항 엄두]
		// 클래스를 사용하는 쪽 -[User]  /    클래스를 제공하는 쪽 - [Provider]
		// 메서드를 사용(호출)하는 쪽 - [User], 메서드 선언부 파악 -> 구현된 내용은 몰라도 됨
		
		// 자바 코딩 중 ???Manager 클래스 : p400 정독
		// ???Manager 클래스 			ex) BeanManager
		// ??? 객체를 관리하는 클래스 	ex) new Bean(); 객체를 관리
		// 
	} // main

} // class

// 사용자는 메서드 선언부만 파악하면 메서드를 구현했는지 안했는지 상관없이 호출(사용)할 수 있다.
class A{  // User(사용자, 사용하는 측)
	void methodA(IE obj) {
		obj.print(); // 메서드를 호출(사용) - 아직 구현은 안되었지만
	}
} // class A

interface IE{
	void print(); // 사용자가 선언부 파악
} // IE interface


class B implements IE{

	@Override
	public void print() {
		// 구현
		// 구현
	}
	
} // class B