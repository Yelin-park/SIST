package days13;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오후 3:01:27
 * @subject 2차원 배열 -> 1차원 배열로 변환
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 정보처리기사 실기 문제 : 2차원 배열 -> 1차원 배열로 변환
		// 4행 3열 2차원 배열 m
		int[][] m = {
					 {1,2,3},
					 {4,5,6},
					 {7,8,9},
					 {10,11,12}
					};
	
		dispM(m);
		
		int[] n = new int[m.length * m[0].length];
		
		// 2 -> 1차원 코딩
		// 풀이2) i와 j를 사용하는 방법
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[3*i+j] = m[i][j];
			} // j for
		}
		
		/*
		// 풀이1) 인덱스 변수 k 선언하는 방법
		int k = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[k++] = m[i][j];
			} // j for
		}
		*/
		dispM(n);
		
	} // main

	// 1차원 배열 출력 메서드
	private static void dispM(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("n[%d] = %d\t", i, n[i]);
		}
	} // dispM

	// 2차원 배열 출력 메서드
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d] = %d\t", i, j, m[i][j]);
			} // j for
			
			System.out.println();
			
		} // i for
		
	} // dispM
	
} // class
