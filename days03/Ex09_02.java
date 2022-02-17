package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오후 4:24:44
 * @subject 산술연산자 설명
 * @content 정수, 실수 관련하여 /와 % 주의사항
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// 산술연산자 설명
		int x = 3;
		System.out.println(x + 5); // 덧셈 연산자
		System.out.println(x - 5); // 뺄셈 연산자
		System.out.println(x * 5); // 곱셈 연산자
		// [주의]
		// x의 자료형은 int, 5의 자료형은 int > int/int => int라서 결과값도 int(0)
		// System.out.println(x / 5); // 나눗셈 연산자
		// System.out.println(x % 5); // 나머지를 구하는 연산자
		
		// [정수와 실수 관련한 주의사항]
		// 에러메시지 : java.lang.ArithmeticException: / by zero
		// 해석 :       산술적예외(오류,에러) > 0으로 나누고자 해서 오류 발생
		// System.out.println(x / 0); // 런타임(실행) 오류
		
		// Infinity 무한대 리터럴
		System.out.println(3.14 / 0); // 실수 / 0
		
		
		// 에러메시지 : java.lang.ArithmeticException: / by zero
		// 해석 :       산술적예외(오류,에러) > 0으로 나누고자 해서 오류 발생
		System.out.println(x % 0); 
		
		// NaN 리터럴   Not a Number == NaN (숫자가 아니다) == 숫자가 아니다라는 값자체
		System.out.println(3.14 % 0); // 실수 % 0
		
		// 상수 = 고정값 + 저장공간
	    // final int a = 10;
		// true 리터럴  == true라는 값 자체

	}

}
