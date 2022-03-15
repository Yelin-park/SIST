package days18;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 4:06:50
 * @subject p387 인터페이스를 이용한 다형성
 * @content 개념잡기
 */
public class Ex13 {

	public static void main(String[] args) {
		
		// E obj = new E();
		
		// 추상클래스 업캐스팅 가능
		// D obj = new E();
		
		// 인터페이스 업캐스팅 가능
		// IC obj = new E();
		// obj.a();
		// obj.b();
		// obj.c();
		
		// IC 인터페이스의 부모인터페이스 업캐스팅 가능
		// IA obj = new E();
		
		// [단점]
		// IA 업캐스팅은 가능하지만 업캐스팅한 인터페이스나 클래스의 메서드만 사용 가능 
		// obj.a();

		disp(new E());
		
	} // main
	
	// 매개변수 다형성
	// 인터페이스 다형성 => 아래 매개변수는 인터페이스 매개변수 다형성
	// IC <- D <- E  
	static void disp(IC obj) {
		// 출력 메서드
	}
	
	/*
	static void disp(E obj) {
		// 출력 메서드
	}
	*/
	

} // class

interface IA { // Collection과 같은 인터페이스
	void a();
	
}

interface IB {
	void b();
	
}

// 인터페이스 상속 - 다중 상속
interface IC extends IA, IB { // List와 같은 인터페이스
	// a() 상속되어짐
	// b() 상속되어짐
	void c();
}

// public void c()를 오버라이딩 하지 않아서 D는 추상클래스
abstract class D implements IC{

	@Override
	public void a() { }

	@Override
	public void b() { }
		
	// public void c() { }
	
}

// D 추상클래스에서 오버라이딩 하지 않은 c() 메서드를 선언
class E extends D{

	@Override
	public void c() { }
	
}