package days11;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 2:05:10
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		int money;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> 머니를 입력하세요?"); // 125,760 엔터
		money = sc.nextInt();
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		
		// 5만원 : 2장     25,760원
		// 1만원 : 2장      5,760원
		// 5천원 : 1장        760원
		// 5백원 : 1개        260원
		// 1백원 : 2개         60원
		// 5십원 : 1개         10원
		// 1십원 : 1개          0원
		
 		
		int share, rest;
		// 풀이2)
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		String[] s_unit = {"5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원"};
		// 반복문 사용 처리 : 5만원 ~ 1십원까지 10개이니까 for문 사용
		for (int i = 0; i < unit.length; i++) { // 범위는 수정할 수도 있으니 배열의 길이로 설정
			share = money / unit[i]; // 몫
			rest = money % unit[i];  // 나머지(잔액)
			System.out.printf("%s : %d개        %d\n", s_unit[i], share, rest);
			money = rest;
		} // i for end
		
		/*
		// 풀이1) 로직 파악하는 코딩
		share = money / 50000; // 몫
		rest = money % 50000;  // 나머지(잔액)
		System.out.printf("5만원 : %d개        %d\n", share, rest);
		
		money = rest;
		share = money / 10000; // 몫
		rest = money % 10000;  // 나머지(잔액)
		System.out.printf("1만원 : %d개        %d\n", share, rest);
		
		money = rest;
		share = money / 5000; // 몫
		rest = money % 5000;  // 나머지(잔액)
		System.out.printf("5천원 : %d개        %d\n", share, rest);
		
		money = rest;
		share = money / 1000; // 몫
		rest = money % 1000;  // 나머지(잔액)
		System.out.printf("1천원 : %d개        %d\n", share, rest);
		*/
		

	} // main

} // class
