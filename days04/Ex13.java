package days04;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 5:27:00
 * @subject 조건문과 반복문(p135)
 * @content if, switch, for, while문
 */
public class Ex13 {

	public static void main(String[] args) {		
		/*
		 * 1. 제어문 정의? 프로그램의 흐름(실행 순서)를 제어(바꾸어주는)하는 문
		 * 2. 제어문 종류
		 * 		ㄱ. 조건문 : if
		 * 		ㄴ. 분기문 : switch
		 * 		ㄷ. 반복문 : for, foreach
		 * 		ㄹ. 조건반목문 : while, do~ while
		 * 		ㅁ. 기타 : break, continue
		 */
		
		// [if문] 조건문
		// 1. 조건에 따라서 실행 여부가 결정된다.(실행이 되거나 되지않거나)
		// 2. if 조건문 형식
		/* 
		if (조건[참/거짓]) {
			// {} 블럭은 조건식이 참일 때만 수행(실행)
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("n 값을 입력하세요: ");
		int n = sc.nextInt();
		
		System.out.println("A coding");
		if (n % 2 == 0 || n % 3 == 0) {   // 2의 배수 또는 3의 배수
			System.out.println("B coding");
			System.out.println("C coding");
		}
		System.out.println("D coding");
		

	}

}
