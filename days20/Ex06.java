package days20;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오후 12:30:57
 * @subject p464 문자열을 다루는 클래스
 * @content		1. String			클래스
 * 				2. StringBuffer		클래스
 * 				3. StringBuilder	클래스
 * 				4. StringTokenzier	클래스
 */
public class Ex06 {

	public static void main(String[] args) {
		// 1. String 클래스
		// 	1) String 클래스는 [변경 불가능]한 클래스이다. *****
		String name = "홍길동"; // name은 String 타입의 객체, 홍길동은 값이 아니고 주소!
		
		name = "길성이";  		// 완전히 새로운 인스턴스 생성
		
		/*
		String name2 = new String("길동이"); // 원칙대로 선언하는 방식
		System.out.println(name);
		System.out.println(name.toString());
		*/

	} // main

} // class
