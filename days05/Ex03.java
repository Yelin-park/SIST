package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오전 10:47:25
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [문제]
		// 국어 점수를 입력받아서 수/우/미/양/가 출력
		// 국어점수 입력? 89점
		// 수 : 100 ~ 90, 우 : 89 ~ 80, 미 : 79 ~ 70, 양 : 69 ~ 60, 가 :59 ~ 0
		
		int kor;
		System.out.print("국어 점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		
		// 문제점
		// 1. 0 ~ 100 범위 밖의 정수를 입력
		// 2. 실수를 입력하면      java.util.InputMismatchException
		// 3. 문자가 섞인 입력하면 java.util.InputMismatchException
		// => 문제점 해결...
		// 입력값에 대한 유효성 검사를 한 후에 처리
		
		// 1) if문 사용
		// if문 5개를 사용해서 처리할 때의 문제점  > 모든 if문을 실행시켜서 확인
		// 만약에 kor 95점을 입력받았다라고하면.. 
		/*
		if(kor >= 90 && kor <= 100) {  // 참
			System.out.println("수");  // 수
		}
		if(kor >= 80 && kor < 90) {
			System.out.println("우");
		}
		if(kor >= 70 && kor <= 79) {
			System.out.println("미");
		}
		if(kor >= 60 && kor <= 69) {
			System.out.println("양");
		}
		if(kor >= 0 && kor <= 59) {
			System.out.println("가");
		}
		*/
		
		// kor = 86 입력
		if(kor >= 90 && kor <= 100) {  // 참
			System.out.println("수");  // 수
		} else if(kor >= 80 && kor < 90) {  // else if문은 하나라도 만족하면 나머지 if문은 더이상 처리(수행)하지 않는다
			System.out.println("우");
		} else if(kor >= 70 && kor <= 79) {
			System.out.println("미");
		} else if(kor >= 60 && kor <= 69) {
			System.out.println("양");
		} else {  // 101, -100 입력해도 '가'가 출력됨  // if(kor >= 0 && kor <= 59) {
			System.out.println("가");
		}

	} // main

} // class
