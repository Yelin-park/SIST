package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오후 2:02:54
 * @subject 중첩 for문 문제 풀이
 * @content
 */

public class Ex05_03 {

	public static void main(String[] args) {
	    // [3번 문제] > 1문제 + 2문제
	    // ___* 개행  i=1   j=3 ___ *
	    // __**       i=2   j=2 __ **
	    // _***       i=3   j=1 __ ***
	    // ****       i=4   j=0 _
		// i + j == 4
		// j == 4 - i
		
		// 2번 풀이 (삼항연산자사용)
		for (int i = 1; i <= 4; i++) {     // 행이 4개이므로, 1번째 for문은 4번만 돌면 됨. 별찍는 for문 아님
			for (int j = 1; j <= 4; j++) { // 열(별)갯수
				System.out.print(i+j >= 5 ? "*" : "-");
			} System.out.println();
		}
		
		/*
		for (int i = 1; i <= 4; i++) {     // 행이 4개이므로, 1번째 for문은 4번만 돌면 됨. 별찍는 for문 아님
			for (int j = 1; j <= 4-i; j++) { // 열(별)갯수
				System.out.print("_");
			}
			for (int j = 1; j <= i; j++) { // 열(별)갯수
				System.out.print("*");
			}
			System.out.println();
		}
		*/





	} // main

} // class
