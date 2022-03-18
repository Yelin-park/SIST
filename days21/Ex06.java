package days21;

import days20.MyPoint;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 12:38:33
 * @subject p494 오토박싱 & 오토언박싱(autoboxing & autounboxing)
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		String name = "홍길동";
		int age = 20; // 기본형 -> Object 타입
		// char  : 기본형 -> Object 타입
		
		// 왜? Object 타입 객체를 넣어야 하는 곳에 기본형을 줘도 되는가?
		// 가변인자 : 자료형..args
		// System.out.printf(String format, Object..args); // Object 타입의 객체 여러개..
		System.out.printf(">name = %s, age = %d, %c, %.2f, %s\n", name, age, 'A', 3.14, new MyPoint(1,2));
		*/
		
		/*
		MyPoint p1 = new MyPoint(1, 2);
		disp(p1);
		String name = "홍길동";
		disp(name);
		
		// 기본형으로 넣고 출력하는 데 왜 출력이 되느냐?
		// int age를 자동으로 Integer 타입으로 형변환이 된 후에 Object obj로
		//                     [오토박싱]                [업캐스팅]
		/*
		int age = 20;
		disp(age);
		
		char ch = 'A';
		disp(ch);
		*/
		
		int i = 10;
		// Integer j = new Integer(i); // 래퍼클래스 : Object <- Number <- Integer 래퍼클래스 <- (오토박싱) <- int
		
		// 기본형이 자동으로 래퍼클래스 타입으로 형 변환 되는 것을 [오토박싱]이라고 한다.
		Integer j = i; // 래퍼클래스 = 기본형 int   -> 자동형변환(오토박싱)
		
		// 래퍼클래스 객체를 기본형으로 자동 형변환 되는 것을 [오토언박싱]이라고 한다.
		int k = j;
		
		
	} // main
	
	// 리턴자료형 Object => 모든 자료형(타입)을 리턴값으로 사용하겠다.
	// 매개변수 자료형 Object => 모든 자료형(타입)을 매개변수로 받겠다.
	public static void disp(Object obj) { // 업캐스팅 Object obj = p1; (MyPoint의 부모클래스는 Object이니까 문제 X)
		System.out.println(obj); // obj.toString() 생략되어 obj로 입력 가능
	}

} // class
