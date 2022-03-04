package days12;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오후 3:40:26
 * @subject p214 다차원배열 설명
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) {
		// [1차원배열]
		// int[] m = new int[8];
		// System.out.println(m.length); // 배열의 크기
		// dispM(m); // 1차원 배열 출력하는 메서드 호출
		
		/*
		// [2차원배열]
		int[][] m = new int[4][2];
		System.out.println(m.length); 	 // 배열의 행의 크기
		System.out.println(m[0].length); // 배열의 열의 크기
		System.out.println(m[1].length); // 배열의 열의 크기
		System.out.println(m[2].length); // 배열의 열의 크기
		System.out.println(m[3].length); // 배열의 열의 크기
		dispM(m); // 2차원 배열 출력하는 메서드 호출
		// m[행][열]
		// m[0][0] ~ m[3][1] 인덱스 값
		*/
		
		// [3차원배열] 2면 3행 4열
		int[][][] m = new int[2][3][4];
		dispM(m);
		
		/*
		System.out.println(m.length); // 배열의 면의 크기 2
		
		System.out.println(m[0].length); // 배열의 행의 크기 3
		System.out.println(m[1].length); // 배열의 행의 크기 3
		System.out.println(m[2].length); // 배열의 행의 크기 3
		
		System.out.println(m[0][0].length); // 배열의 열의 크기 3
		System.out.println(m[0][1].length); // 배열의 열의 크기 3
		System.out.println(m[0][2].length); // 배열의 열의 크기 3
		System.out.println(m[0][3].length); // 배열의 열의 크기 3
		*/
		
	} // main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d] = %d\t", i, j, k, m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { 		 // 행
			for (int j = 0; j < m[i].length; j++) {  // 열
				System.out.printf("m[%d][%d] = %d\t", i, j, m[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\t", i, m[i]);
		}
	}

} // class
