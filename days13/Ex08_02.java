package days13;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오후 3:22:52
 * @subject 1차원 배열 -> 2차원 배열 변환
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 1차원 배열 -> 2차원 배열 변환
		int[] m = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[][] n = new int[6][2];
		
		// 코딩
		int col = n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/col][i%col] = m[i];
		}
		
		dispM(n);

	} // main
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d] = %d\t", i, j, m[i][j]);
			} // j for
			
			System.out.println();
			
		} // i for
		
	} // dispM
	
} // class
