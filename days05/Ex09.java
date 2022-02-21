package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 3:17:05
 * @subject do~while 조건반복문
 * @content 
 */
public class Ex09 {

	public static void main(String[] args) {
		// do~while 문과 while문의 차이점
		// 1+2+3+4+5+6+7+8+9+10+=55
		/*
		int  i = 1, sum = 0;
		while( i <= 10 ) {
			System.out.print(i +"+");
			sum += i++;
			//sum += ++i;			 // 1+2+3+4+5+6+7+8+9+10+=65 ( 파악 )
		} // while
		System.out.println("=" + sum);
		*/

		int  i = 1, sum = 0;
		// i 변수값을 스캐너로 입력 받자.
		System.out.print("i 값을 입력 ? ");
		Scanner scanner = new Scanner(System.in);
		i = scanner.nextInt();
		
		// do~while 문은 조건식의 참 거짓을 판단하기 전에 최소한 한 번은 무조건 { } 블럭을 처리 한 후에 조건식을 묻는다. 
		do {
			System.out.println("헬로우 월드");
			i++;
		} while (i <= 10);  // 12 <= 10 거짓
		System.out.println("= end =");
		
		/*
		while( i <= 10 ) {   // 12 <= 10  거짓
			System.out.println("헬로우 월드");
			i++;
		} // while
		*/
		
	} // main

} // class
