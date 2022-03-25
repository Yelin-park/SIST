package days26;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 3:27:20
 * @subject	 Chapter12 지네릭스, 열거형 애너테이션
 * @content	 p670 지네릭스(Generics)
 * 				1. JDK 1.5 처음 도입
 * 				2. 다양한 타입의 객체들을 다루는 메서드 / 컬렉션 클래스에 [컴파일 시]의 타입 체크(compile-time type check) 해주는 기능(기술)
 * 																	자료형이 정해지지 않고 컴파일시 자료형을 지정
 * 					메서드 -> 제네릭 메서드
 * 					컬렉션 클래스 -> 제네릭 컬렉션 클래스 -> 전부 제네릭 기능을 가지고 있어서 컬렉션 클래스라고 하장~
 * 					클래스 -> 제네릭 클래스
 * 					위와 같이 부른다.
 * 
 * 				3. 장점
 * 					1) 객체 타입의 안정성 제공
 * 					2) 형변환 번거로움 줄이기 위해서 -> 형변환 생략 -> 코드 간결
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		// int Box 클래스
		Box box1 = new Box(100);
		int value = box1.getValue();
		System.out.println(value);
		*/
		/*
		// double Box 클래스
		Box box1 = new Box(3.14);
		double value = box1.getValue();
		System.out.println(value);
		*/
		/*
		// boolean Box 클래스
		Box box1 = new Box(true);
		boolean value = box1.getValue();
		System.out.println(value);
		*/
		
		/*
		// 템플릿 클래스(Object 클래스)를 사용하면 사용할 때 마다 형변환 작업을 해줘야 한다.
		Box box1 = new Box(100);
		int value = (int) box1.getValue(); // 리턴값 Object이라 cast 연산자로 강제형변환
		
		Box box2 = new Box(new Member("홍길동", 90));
		Member m = (Member) box2.getValue(); // 리턴값 Object
		*/
		
		
		// [제네릭 클래스 사용]
		Box<Integer> box1 = new Box<Integer>(100);
		int value = box1.getValue(); // getValue() 메서드를 보니까 리턴값이 Integer로 바뀌어짐
		System.out.println(value);
		
		Box<Member> box2 = new Box(new Member("홍길동", 90));
		Member m = box2.getValue();
		System.out.println(m);
		
		Box<String> box3 = new Box("홍길동");
		String name = box3.getValue();
		System.out.println(name);
		
		
	} // main

} // class

// [제네릭 클래스] : 클래스명 옆에 <> 붙은 것
// <> 안에 의미에 맞춰서 대문자 값을 주면 됨
// <T> : Type -> 자료형
class Box<T>{
	// field
	private T value;
	
	// constructor
	public Box(T value) {
		this.value = value;
	}

	// getter
	public T getValue() {
		return value;
	}
	
	// setter
	public void setValue(T value) {
		this.value = value;
	}

} // Box

/*
// 모든 타입을 담을 수 있는 [템플릿 클래스]
class Box{
	// field
	private Object value;
	
	// constructor
	public Box(Object value) {
		this.value = value;
	}

	// getter
	public Object getValue() {
		return value;
	}
	
	// setter
	public void setValue(Object value) {
		this.value = value;
	}

} // Box

/*
class Box{
	// field
	private boolean value;
	
	// constructor
	public Box(boolean value) {
		this.value = value;
	}

	// getter
	public boolean getValue() {
		return value;
	}
	
	// setter
	public void setValue(boolean value) {
		this.value = value;
	}

} // Box
*/
/*
class Box{
	// field
	private double value;
	
	// constructor
	public Box(double value) {
		this.value = value;
	}

	// getter
	public double getValue() {
		return value;
	}
	
	// setter
	public void setValue(double value) {
		this.value = value;
	}

} // Box
*/

/*
class Box{
	// field
	private int value;
	
	// constructor
	public Box(int value) {
		this.value = value;
	}

	// getter
	public int getValue() {
		return value;
	}
	
	// setter
	public void setValue(int value) {
		this.value = value;
	}

} // Box
*/