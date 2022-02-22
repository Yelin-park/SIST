package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오전 11:43:48
 * @subject 별 찍기(for 제어문 연습)
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****
		
		/* 두 번째
		for (int i = 1; i <= 4; i++) {
			System.out.println("****");
		}
		*/
		
		for (int i = 1; i <= 4; i++) {      // 행 갯수
			for (int j = 1; j <= 4; j++) {  // 열 갯수
				System.out.print("*");
			}
			System.out.println();
		}

	} // main

} // class
