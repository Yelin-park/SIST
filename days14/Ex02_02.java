package days14;

/**
 * @author Yelin
 * @date 2022. 3. 8. - 오후 2:03:39
 * @subject [다차원 배열 예제]
 * @content 마방진
 * 		// 짝수 / [홀수] 마방진
		// 1. 첫 번째 행의 가운데 열 : 1
		// 2-1. 5의 배수라면 		행 증가
		// 2-2. 5의 배수가 아니라면 열 증가, 행 감소  > 행이 벗어남(-1,3)
		//   ㄱ. 행 벗어나면 -> 가장 큰 행(4) -> ex) 4행 3열
		//	 ㄴ. 열 벗어나면 -> 가장 작은 열(0) -> ex) 2행 4열
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		int[][] m =new int[5][5];
		
		fillMagicSquare(m);
		
		dispM(m);

	} // main

	private static void fillMagicSquare(int[][] m) {
		int row = 0, col = m.length/2; // 행과 열을 저장할 변수
		int n = 1; // 출력될 값(1~25)
		
		while(n <= m.length * m.length) {
			m[row][col] = n;
			if(n % m.length == 0) {
				row++;
			} else {
				col++;
				row--;
				if(row < 0) row = m.length-1; // 행이 -1이 된 경우
				if(col > m.length-1) col = 0; // 열이 5가 된 경우
			}
			n++;  // 찍은 후 n 값 증가
		} // while
		
	} // fillMagicSquare

	public static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]\t",m[i][j]);
			} // for j
			System.out.println();
		} // for i
		
	}

} // class

/*
		// 내가 풀다만 코드
		int first = m.length / 2;
		m[0][first] = 1;
		int col = 0;
		int line = 0;
		i:for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] % 5 == 0) { // 5의 배수라면
					m[col++][line] = i++; 
				} else if(m[i][j] % 5 != 0) { // 5의 배수가 아니라면
					
				}
			}
		}
*/
