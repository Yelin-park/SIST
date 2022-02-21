package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오전 10:47:25
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [문제]
		// 국어 점수를 입력받아서 수/우/미/양/가 출력
		// 국어점수 입력? 89점
		// 수 : 100 ~ 90, 우 : 89 ~ 80, 미 : 79 ~ 70, 양 : 69 ~ 60, 가 :59 ~ 0
		
		// [시험] > 좋은 코딩
		int kor;
		System.out.print("국어 점수를 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		
		// 입력받은 정수값에 대해서는 유효성 검사를 하겠다.
		String grade = "가";
		if (kor >= 0 && kor <= 100) {
			// 수 ~ 가 등급 처리
			if(kor >= 90)      grade = "수";
			else if(kor >= 80) grade = "우";
			else if(kor >= 70) grade = "미";
			else if(kor >= 60) grade = "양";
			System.out.println(grade);
			
		} else {
			System.out.println("국어 점수 입력 잘못!");
		}
		
	} // main

} // class
