package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오전 10:18:07
 * @subject 제어문
 * @content switch문 (분기문)
 */
public class Ex02 {

	public static void main(String[] args) {
		
		/* switch문 선언형식
		 * key   : 변수, 수식, 정수, 문자열
		 * value : 리터럴(값), ** 변수 X **
		switch (key) {
		case value:
			break;
		case value:
			break;
			 :
			 :
		[default:] > 생략 가능 구문
			break;
		}
		*/
		
		// switch 분기문 사용
		// 정수를 입력받아서
		// 홀수(odd number), 짝수(even number) 출력
		
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(n) 입력: ");
		n = scanner.nextInt();
		String result = "";

		
		// n = 10
		switch (n % 2) {
		case 0:
			result = "짝수(even number)";
			break; // break 문을 만나면 switch문 종료
			
		case 1:
			result = "홀수(odd number)";
			break;
			
		/*	
		default: // 그외 경우(1인 경우 == 홀수)
			result = "홀수(odd number)";
			break;
		*/
		} // switch
		
	} // main

} // class
