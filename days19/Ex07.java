package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오전 11:52:03
 * @subject p414 Chapter08 예외처리
 * @content 수업 끝나고 [자바 + AWT + 계산기 구현] 검색
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * 오류와 에러는 같은 말이지만 자바에서 런타임 오류를 2가지로 나눈 것중 에러가 있기 때문에 바깥에서 사용하는 단어는 오류로 지칭
		 * 1. 프로그램 오류(==에러) ? 프로그램 오작동 또는 비정상적으로 종료되는 원인
		 * 2. 발생시점에 따라서 -> 1) 컴파일 오류 + 2) 런타임 오류 = 빌드 오류(에러)
		 * 																+ 빌드 할거니? 너 컴파일하고 런타임할거니??
		 * 		1) 컴파일 오류
		 * 			ex) int x= 10
		 * 		
		 * 		2) 런타임(실행) 오류
		 * 			ex) int[] m = new int[3];
		 *				m[100] = 10;  // ArrayIndexOutOfBounds[Exception]
		 *			- 자바 언어에서 런타임(실행) 오류를 2가지로 구분
		 *				ㄱ) 에러(error) - 메모리 부족, 스택오버플로워(스택부족) 에러 발생 -> 복수할 수 없는 심각한 오류
		 *							Error 클래스
		 *							자식 클래스...
		 *
		 *				ㄴ) 예외(exception) - 수습될 수 있는 비교적 덜 심각한 오류
		 *							Exception 클래스
		 *							자식 클래스...
		 *
		 *		3) 논리적 오류 : 컴파일, 런타임 오류도 발생하지 않았지만 의도와 다르게 동작하는 것  -> 논리적 오류를 잡기가 가장 어렵다.
		 *			ex) 		int a = Integer.MAX_VALUE;
		 *						long b = a + 100;
		 *						System.out.println(b); // -2147483549
		 * 		
		 * 3. 예외 클래스의 계층구조(상속 관계)
		 * 		Exception 클래스 2그룹
		 * 			ㄱ) RuntimeException + 그 하위 예외 클래스 -> RuntimeException클래스들 : 주로 프로그래머의 실수
		 * 			ㄴ) Exception + 그 하위 클래스 ( ㄱ)RuntimeException 제외 ) -> Exception클래스들 : 외부의 영향으로 발생
		 * 
		 * 4. 예외처리(Exception handling) - 에러X, 예외O
		 * 
		 */


	} // main

} // class
