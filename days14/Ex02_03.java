package days14;

/**
 * @author Yelin
 * @date 2022. 3. 8. - 오후 2:03:39
 * @subject [다차원 배열 예제]
 * @content 누적하는 배열
 */
public class Ex02_03 {

	public static void main(String[] args) {
		
		int[][]m = new int[5][5];
		
		fillM(m);
		
		Ex02_02.dispM(m);

	} // main

	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m[i].length-1; j++) {
				m[i][j] = (m.length-1)*i+j+1;
				// i행의 마지막열 누적
				m[i][m[i].length-1] += m[i][j];
				// j열의 마지막행 누적
				m[m.length-1][j] += m[i][j];
				// 4행 4열에 모두 누적
				m[m.length-1][m[m.length-1].length-1] += m[i][j];
			} // for j
		} // for i
		
	} // fillM

} // class


/*
 // 내가 풀다만 코드

for (int i = 0; i < m.length-1; i++) {
	for (int j = 0; j < m[i].length-1; j++) {
		m[i][j] = 4*i+j+1;
	}
}

for (int i = 0; i < m.length; i++) {
	for (int j = 0; j < m[i].length; j++) {
		if(j == m.length-1) break;
		m[i][m[i].length-1] += m[i][j < 4 ? j : j-1];
	}
}
 */
