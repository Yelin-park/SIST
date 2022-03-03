package days11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오전 11:43:37
 * @subject 제어문 + 배열 + 알고리즘(로직) 응용/활용
 * @content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// int n;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("> 10진수 정수를 입력하세요?");
		// n = sc.nextInt();
		
		// 10진수 10 -> 16진수로 출력 a
		// 16진법 : 0 1 2 3 4 5 6 7 8 9 a b c d e f(15)
		/*
		int share = n; // 몫
		int rest; // 나머지
		char chrest; // 영어로될 나머지
		char[] binary = new char[16];
		int idx = binary.length-1;
		
		
		while (share != 0) {
			share = n / 10;
			rest = n % 10;
			if(rest % 10 == 0) chrest = 'a';
			else if(rest % 10 == 1) chrest = 'b';
			else if(rest % 10 == 2) chrest = 'c';
			else if(rest % 10 == 3) chrest = 'd';
			else if(rest % 10 == 4) chrest = 'e';
			else if(rest % 10 == 5) chrest = 'f';
			else chrest = rest;

			binary[idx] = rest.chartAt(0);
			idx--;
			
		}
		*/
		
	      int n ;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 10진수 정수 입력 ? ");  // 10
	      n = scanner.nextInt();

	      // 10진수 10을 -> 16진수로 출력   a
	      char [] hex = new char[4];
	      Arrays.fill(hex, '0');
	      
	      int share = n; // 몫 변수
	      int rest;      // 나머지 변수
	      
	      int idx = hex.length-1;
	      while( share != 0 ) {
	         share = n / 16;  // 5
	         rest  = n % 16;   // 0
	         
	         // 나머지(rest) 값을 문자로 변환해서 char[] hex에 저장하겠다.
	         // 1 + 48 -> '1'
	         // 10+87 -> 'a'
	         char value =  (char)(  rest += rest >= 10 ? 87 : 48 );
	         // System.out.printf("[%d]", rest); // [0][1][0][1]   1010
	         hex[idx--] = value;
	         n = share;
	      }
	      System.out.println("0x"+ Arrays.toString(hex).replaceAll(",\\s", ""));


	} // main

} // class
