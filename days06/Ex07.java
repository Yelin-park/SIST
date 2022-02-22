package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오후 5:22:33
 * @subject 구구단(multiplication table) 가로로 출력
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 구구단의 한 단을 입력받아서 출력
		// [가로로 구구단 출력]
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d = %02d\t", i, j, i*j);
			}
			System.out.println();
		}
		
		
		/*
		int dan = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %02d ", dan, i, dan*i);
		}
		System.out.println();
		
		dan = 3;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %02d ", dan, i, dan*i);
		}
		System.out.println();
		*/

	} // main

} // class
