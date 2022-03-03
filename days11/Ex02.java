package days11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오전 11:43:37
 * @subject 제어문 + 배열 + 알고리즘(로직) 응용/활용
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [문제]
		// 정수(int) 입력받아서  ex) 10진수 10
		// 2바이트 2진수로 출력       2진수 00000000 00001010
		
		// Arrays.toString(배열명);  -> 확인용으로 배열 값을 출력해줌 > [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0]
		
		// 강사님이 풀어주신 코딩
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("> 10진수 정수를 입력하세요?");
		n = sc.nextInt();
		
		int[] binary = new int[16];
		int idx = binary.length-1;
		
		int share = n; // 몫
		int rest; // 나머지
		
		while(share != 0) {
			share = n / 2; // 몫
			rest = n % 2; // 나머지  -> 가장 마지막 방부터 채워넣기
			binary[idx] = rest;
			idx--;
			n = share; // 몫을 다시 n으로 만들자
		} // while
		
		System.out.println(Arrays.toString(binary));
		// String.replaceAll()메서드
		System.out.println(Arrays.toString(binary).replaceAll(",\\s", "")); // 모든 , + 공백 => 빈문자열로 바꿔라
		
		/*
		// 내가 푼 코딩
		int x;
		int remainder; // 나머지
		int result;    // 몫
		int[] remainderArr = new int[16]; // 나머지를 담는 배열
		
		System.out.println("정수를 입력하세요 > ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		int i = 15;
		while(x > 0) {
			remainder = x % 2;
			result = x / 2;
			x = result;
			remainderArr[i] = remainder;
			i--;
		}
		
		for (int k : remainderArr) {
			System.out.print(k);
		}
		*/

		
	} // main

} // class
