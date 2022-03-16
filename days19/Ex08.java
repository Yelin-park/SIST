package days19;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 12:40:15
 * @subject p416 예외처리하기 - 
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> a b 정수 입력?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// java.lang.ArithmeticException: / by zero 예외 발생
		// 0을 입력받을 경우 개발자가 예측해서 예외 처리
		
		/*
		// 예외 처리 문 X
		// why? 입력 값이 제대로 들어가도 if 문이 돌고, 입력 값이 제대로 안들어가도 if 문이 돈다. -> 항상 처리하게 됨
		if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; //프로그램 종료
		}
		*/
		double c = a / b;
		
		System.out.printf("%d / %d = %.2f\n", a, b, c);

	} // main

} // class
