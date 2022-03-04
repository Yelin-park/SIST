package days12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 9:03:00
 * @subject 30명 학생의 이름, 국어, 영어, 수학을 입력받아서 총점, 평균, 등수 출력
 * @content [등수 처리]
 */
public class Ex01 {

	public static void main(String[] args) {
		// [42, 231, 199, 10, 247, 42, 263, 28, 255, 120] > 임의로 총점 넣기
		int[] tots = new int[10];
		
		// 1. 0~100 임의의 정수를 배열 초기화
		Random rnd = new Random();
		for (int i = 0; i < tots.length; i++) {
			tots[i] = rnd.nextInt(301);
		}
		
		// 2. 출력
		System.out.println(Arrays.toString(tots));

		// 3. 등수를 담는 배열 선언
		int[] ranks = new int[10];
		// 모든 학생들 등수 처리하기 전에 1등으로 초기화
		/*
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = 1;
		}
		*/
		// Arrays.클래스 : 배열을 사용하기 쉽도록 기능을 구현해 놓은 클래스(물건)
		// Arrays.fill(배열명, 값)ranks 배열 안에 있는 모든 요소를 1로 초기화 하겠다.
		Arrays.fill(ranks, 1);
		
		// 4. 등수 처리
		// 정확한 코딩
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				if(i != j && tots[i] < tots[j]) { // 자기 자신은 체크하지말고 나보다 총점이 높으면 등수가 밀림
					ranks[i]++;
				}
			}
		}
		
		// 자기 자신 비교하는 것을 빼면 성능이 더 좋음 -> 빼도 문제 없음
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				if(tots[i] < tots[j]) { // 자기 자신을 포함한 나머지 학생과 총점 비교 / 나보다 총점이 높으면 등수가 밀림
					ranks[i]++;
				}
			} // j for
		} // i for
		
		/*
		// 로직 이해하기
		for (int i = 0; i < ranks.length; i++) {
			if(tots[0] < tots[i]]) {
				ranks[0]++;
			}
		}
		for (int i = 0; i < ranks.length; i++) {
			if(tots[1] < tots[i]]) {
				ranks[1]++;
			}
		}
		*/
		
		System.out.println(Arrays.toString(ranks));
		
	} // main

} // class
