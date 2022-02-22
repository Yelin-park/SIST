package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오후 5:35:03
 * @subject 구구단 세로로 출력
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 문제) 세로로 구구단 출력
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %02d\t", j, i, i*j);
			}
			System.out.println();
		}

	} // main

} // class
