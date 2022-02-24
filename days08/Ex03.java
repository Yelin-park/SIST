package days08;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오후 12:44:52
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 두 정수의 값을 입력받아서 두 정수의 합을 출력하는 코딩
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수(x,y) 값 입력하세요: ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		// int z = x + y;
		int z = sum(x, y);
		
		System.out.printf("%d + %d = %d\n", x, y, z);
		 
		
		/*
		// 내가 만든 메서드를 호출해서 두 개의 정수 합을 구하는 코딩
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수(x,y) 값 입력하세요: ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", x, y, sum(x, y));
		 */
		
	} // main

	// [문제]
	// 두 정수의 합을 구해서 리턴하는 메서드 선언
	public static int sum(int x, int y) {
		// int result = x + y;
		return x + y;
	}
	
	/*
	// 내가 만든 메서드
	// 문제점 : 함수명과 변수명이 동일
	public static int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}
	*/
} // class
