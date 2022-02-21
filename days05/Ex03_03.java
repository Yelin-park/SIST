package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오전 10:47:25
 * @subject 제어문
 * @content if, switch 연습
 *          break 문? 제어문을 빠져나갈때 사용하는문(switch 뿐만 아니라)
 */
public class Ex03_03 {

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
		
		String grade = "가";

		// switch문 사용해서 수정
		// 에러메시지 : Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted
		// 해석 : switch문에 key값은 수식, 변수도 가능하지만 결과물이 불린형인 수식은 사용할 수 없다. (ex. kor > = 90 && kor <= 100)
		/*
		switch (kor) {
		case 100:
			System.out.println("수");
			break;
			:
			:
		default:
			System.out.println("국어 점수 입력 잘못!!");
			break;
		}
		*/

		// [switch 문제]
		switch (kor / 10) {
		case 10: case 9:  // 90 ~ 100
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default:
			grade = "가";
			break;
		}
		// break문 삭제 후 모든 점수 결과값이 "가" 출력
		// why? case문 사이에 break문이 없으면 다시 그 다음 case문을 수행
		System.out.println(grade);
		

	} // main

} // class
