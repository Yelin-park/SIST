package days08;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오전 9:07:48
 * @subject 제어문 + 연산자 + 알고리즘 + 배열 + 메서드(함수) 만들기 응용/활용
 * @content
 */
public class Ex01 {

	// main() 메서드
	// 1. 기능 : 프로그램 시작, 종료
	// 2. 매개변수:
	// 3. 리턴값(리턴자료형) : void
	public static void main(String[] args) {
		// [문제] 조건반복문(do~while),유효성 검사 - String.matches(regex 정규표현식)
		// 등급(수, 우, 미, 양, 가) 입력 -> 한 문자만 입력
		// 유효성 검사 -> 입력을 잘못하면 + [입력이 잘못되었습니다 메시지 출력 후] 입력을 다시 받도록 하기
		//

		char grade;
		String sGrade = null;

		Scanner sc = new Scanner(System.in);
		String regex = "[수우미양가]"; // 0,1,2,3,4,5,6,7,8,9 \d * 1번이상
		// 알파벳만 오게 하는 것 [A-za-z]
		// 알파벳, 숫자만 오게 하는 것 [A-za-z0-9]
		
		// 2번 풀이 (강사님이 풀어주신 코딩)
		int check = 0;
		// 입력을 5번 잘못하면 종료하도록 코딩..
		do {
			if (check >= 1)
				System.out.printf("\t(알림) %d/5번 실수 : 입력이 잘못되었습니다. \n", check);
			if (check == 5) {
				System.out.println("\n 프로그램 종료!!!");
				// return; // main 메서드를 종료
				System.exit(-1); // 어디에 있던지 프로그램을 종료하는 메서드
				// 정수 값 아무거나 줘도 된다. 정수값으로 코딩할 일 없어서 아무거나 줘도 괜찮음
				// [-1 프로세서 -1/0/1 <- 프로세서] 어떤 이유로 종료했는지 저장
			}
			System.out.print("> 등급을 입력하세요(ex) 수, 우, 미, 양, 가) : ");
			// matches() 메서드를 사용하려면 입력값을 String(문자열)로 입력
			sGrade = sc.next();
			check++;

		} while (!sGrade.matches(regex));

		// 제대로 입력을 한 경우에만 처리해야 되는 코딩
		grade = sGrade.charAt(0);
		System.out.println("등급: " + grade);
		
		
		
		// 1번 풀이
		/*
		 do { System.out.print("> 등급을 입력하세요[ex) 수, 우, 미, 양, 가]");
		  
		  		sGrade = sc.next(); if(!sGrade.matches(regex))  // matches() 메서드를 사용하려면 입력값을 String(문자열)로 입력
		  		System.out.println("\t(알림) 입력이 잘못되었습니다.");
		  } while (!sGrade.matches(regex));
		  
		  grade = sGrade.charAt(0);
		  
		  System.out.println("등급: " + grade);
		 */


		/*
		 * 내가 풀다 만 코드 char[] cGrade = {'수', '우', '미', '양', '가'};
		 * 
		 * char temp = ' ';
		 * 
		 * do { System.out.print("> 등급을 입력하세요[ex) 수, 우, 미, 양, 가]"); grade =
		 * sc.next().charAt(0); for (int i = 0; i < cGrade.length; i++) { temp =
		 * cGrade[i] == grade ? cGrade[i] : grade; } grade = temp;
		 * 
		 * } while (!(grade == cGrade[i]));
		 * 
		 * 
		 * System.out.println(grade);
		 */

	} // main

} // class
