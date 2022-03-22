package days23;

import java.text.ChoiceFormat;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 11:11:22
 * @subject p548 ChoiceFormat 클래스(예제10-16,17)
 * @content 	- 특정 범위에 속하는 값을 문자열로 변환해주는 형식화 클래스
 * 				- 
 */
public class Ex04 {

	public static void main(String[] args) {
		// if문, switch문을 사용 X -> ChoiceFormat으로 간단하게 사용 가능
		// int kor = 88;
		// 결과값 : 우     80 <= kor <= 90
		
		
		// p548 예제10-17
		// # 은 경계값을 포함 시킴 -> 80#우 => 80점~89점까지 우
		// < 는 포함시키지않음 -> 80<우 => 81~89점까지 우, 80은 미
		int[] scores = {100, 95, 88, 73, 52, 60, 70, 0};
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d - %s\n", scores[i], cf.format(scores[i]));
		}
		
		
		/*
		// p548 예제10-16
		int[] scores = {100, 95, 88, 73, 52, 60, 70, 0};
		String[] grades = {"가", "양", "미", "우", "수"};
		double[] limits = {0, 60, 70, 80, 90};
		ChoiceFormat cf = new ChoiceFormat(limits, grades);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d - %s\n", scores[i], cf.format(scores[i]));
		}
		*/
		
	} // main

} // class
