package days08;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오후 2:39:37
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// int kor = getScore("국어", scanner);
		int kor = getScore();
		System.out.println(kor);
		
		// int eng = getScore("영어", scanner);
		int eng = getScore();
		System.out.println(eng);

	} // main

	// [문제]
	// 스캐너를 사용해서 점수 유효성 검사 후 입력받아서 반환하는 메서드 선언
	// 1. 유효성 검사(0~100)
	// 2. 재사용이 가능한가..?  > 매개변수에 String subject를 추가하여 해결 > 모든 과목에 사용 가능!
	public static int getScore(String subject, Scanner scanner) { // Scanner scanner = main 안에 있는 scanner 변수;
		// Scanner scanner = new Scanner(System.in); 
		// 성능이 떨어짐 : 메서드를 호출할 때 마다 scanner를 호출하는 격(망치질을 하려고 망치 사와서 버리고 내일 또 사와서 버리는 꼴!)
		
		int kor;
		String sKor;
		String regex = "100|[1-9]?\\d";
		
		do {
			System.out.print(subject + "점수를 입력하세요: ");
			sKor = scanner.next();
		} while (!sKor.matches(regex));
		
		kor = Integer.parseInt(sKor);
		return kor;
	}
	
	// 임의로 점수를 생성해주는 메서드
	public static int getScore() {
		return (int)(Math.random()*101);
	}
	
	/*
	// 내가 풀다가 만 코드
	public static int getKor(int kor) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요: ");
		int data;
		data = sc.nextInt();
		if(0 <= data && data <= 100) {
			kor = data;
		}
		
		return kor;
	}
	*/
	
} // class
