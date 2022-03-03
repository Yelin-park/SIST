package days11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오전 11:43:37
 * @subject 제어문 + 배열 + 알고리즘(로직) 응용/활용
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("> 10진수 정수를 입력하세요?");
		n = sc.nextInt();
		
		int[] binary = new int[16];
		int idx = binary.length-1;
		
		int share = n; 
		int rest; 
	
		while(share != 0) {
			share = n / 2; 
			rest = n % 2; 
			binary[idx] = rest;
			idx--;
			n = share; 
		} // while
		
		System.out.println(Arrays.toString(binary));

		


		
	} // main

} // class
