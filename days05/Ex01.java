package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오전 10:18:07
 * @subject 제어문
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// if 조건문
		// 정수를 입력받아서 홀수(odd number), 짝수(even number) 출력
		// 1) 홀수 / 짝수의 정확한 정의
		// 홀수는 2로 나누어서 떨어지지않는 정수 2n + 1  > n은 정수
		// 짝수는 2로 나누어서 떨어지는 정수 2n
		// 2) 짝수 조건식  n % 2 == 0
		///   홀수 조건식  n % 2 != 0,     !(n % 2 == 0),    n % 2 == 1
		
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(n) 입력: ");
		n = scanner.nextInt();
		
		/*
		if (n % 2 == 0) {
			System.out.println("짝수(even number)");
		}
		if (n % 2 != 0) {
			System.out.println("홀수(odd number)");
		}
		*/
		
		String result = ""; // = null 이라고 초기화해도 좋음
		
		if (n % 2 == 0) {
			result = "짝수(even number)";
		}
		if (n % 2 != 0) {
			result = "홀수(odd number)";
		}
		System.out.println(result);
		
		// 에러메시지 : The local variable result may not have been initialized
		// if문의 조건이 1개도 안맞을 수도 있으니 지역변수를 초기화해라  > result에 null값으로 초기화
		
	} // main

} // class
