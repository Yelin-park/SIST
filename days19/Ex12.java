package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 2:48:48
 * @subject p425 예외 발생시키키
 * @content 개발자가 고의로 예외를 발생 시킬수 있다.
 * 				왜? 고의로 예외를 발생시키는가?
 * 				throw문 사용.
 * 
 * 				1) 예외 객체 생성
 * 				2) throw 예외객체;
 */
public class Ex12 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 1) 예외 객체 생성
		NullPointerException e = new NullPointerException("강제 널 예외 발생");
		throw e;
		// throw new NullPointerException("강제 널 예외 발생"); // 위와 같은 코딩(예외 객체 생성)
		// throw new RuntimeException();
		
		// throw 문 때문에 아래 코딩 만날 수 없음
		// int c = a + b;
		// System.out.printf("%d + %d = %d\n", a, b, c);
		
		// System.out.println("정상적 종료!");
		
	} // main

} // class
