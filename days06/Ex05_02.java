package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오후 2:02:54
 * @subject 중첩 for문 문제 풀이
 * @content
 */

public class Ex05_02 {

	public static void main(String[] args) {
	    // [2번 문제]
	    // ****     i=1   j 4 ****
	    // ***      i=2   j 3 ***
	    // **       i=3   j 2 **
	    // *        i=4   j 1 *
		//          i + j == 5
		//          j == 5 - i
		
		// 반복문은 [반복 규칙]을 찾는 게 중요!
		
		// 2번 풀이 (삼항연산자사용)
		for (int i = 1; i <= 4; i++) {     // 행이 4개이므로, 1번째 for문은 4번만 돌면 됨. 별찍는 for문 아님
			for (int j = 1; j <= 4; j++) { // 열(별)갯수
				System.out.print(i+j <= 5 ? "*" : "-");
			} System.out.println();
		}
		
		/*
		for (int i = 1; i <= 4; i++) {     // 행이 4개이므로, 1번째 for문은 4번만 돌면 됨. 별찍는 for문 아님
			for (int j = 1; j <= 5-i; j++) { // 열(별)갯수
				System.out.print("*");
			} System.out.println();
		}
		*/

	} // main

} // class
