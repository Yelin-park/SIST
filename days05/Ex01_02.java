package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오전 10:18:07
 * @subject 제어문
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		// if 조건문
		// 정수를 입력받아서 홀수(odd number), 짝수(even number) 출력
		
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(n) 입력: ");
		n = scanner.nextInt();
		String result = "";
		
		if (n % 2 == 0) result = "짝수(even number)"; // 조건식이 참이면 수행
		else { // if문의 조건식 그 외의 모든 경우(조건식을 만족하지않는) == 홀수 일 경우
			result = "홀수(odd number)"; // 조건식이 거짓이면 여길 수행
		}
		
		System.out.println(result);
		
		// if 문의 {} 블럭 안의 코딩이 1줄이라면 {} 생략 가능하고 바로 옆에 코딩을 붙일 수 있다.
		/*
		if (n % 2 == 0) result = "짝수(even number)";
		if (n % 2 != 0) result = "홀수(odd number)";
		*/
		
	} // main

} // class
