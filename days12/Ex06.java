package days12;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 10:44:26
 * @subject p197 예제5-6)
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// p197 예제5-6) 최대값, 최소값을 찾아서 출력하세요.
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			// 좋은 코딩
			if(max < score[i]) max = score[i];
			else if(min > score[i]) min = score[i];
			
			/*
			// 내가 푼 코드
			max = max > score[i] ? max : score[i];
			min = min > score[i] ? score[i] : min;
			*/
		}
		
		System.out.println(max);
		System.out.println(min);

	} // main

} // class
