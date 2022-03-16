package days19;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 12:40:15
 * @subject p416 예외처리하기 - 
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		double c = 0;
		Scanner sc = new Scanner(System.in);
		
		// try-catch 문 : 예외 처리
		// try-catch 문은 다중으로 사용가능~
		// [주의할점]
		// 1. 다중 catch {}을 사용할 때는 부모 예외 catch문을 나중에(뒤) 코딩한다.
		// JVM의 "예외처리기"에서 예외 정보를 받아서 -> ???Exception 객체 전달(catch 블럭으로)
		try {
			// 예외가 발생할 것 같은 코드
			System.out.println("> a b 정수 입력?");
			try {
				a = sc.nextInt();
				b = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			}
			c = a / b;
			// 코딩... 있다고 가정
			// 코딩... 있다고 가정
			// 코딩... 있다고 가정
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch(InputMismatchException e) {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			System.out.println(e.toString());     // "java.util.InputMismatchException"
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());   // "/ by zero"
		} catch (Exception e) { // 업캐스팅
			// catch 문 안에 아무런 코딩이 없으면 그냥 다음 코딩으로 넘어가버림
			e.printStackTrace();    // try 문 안에서 예외가 발생하면 실행, 없으면 실행X
			// java.lang.ArithmeticException: / by zero
			// 	at days19.Ex08_02.main(Ex08_02.java:26)
		}
		

	} // main

} // class
