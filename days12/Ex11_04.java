package days12;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오후 4:22:06
 * @subject 다차원 배열의 초기화
 * @content 질문? 왜 다차원 배열을 사용하는가?
 * 			**** p216 그림5-5 꼭 이해하기 ****
 */
public class Ex11_04 {

	public static void main(String[] args) {
		/*
		int[] m = new int[8];				int 8개
		int[][] m = new int[2][4];			int 8개
		int[][][] m = new int[2][2][2]; 	int 8개
		*/
		
		// 3차원배열
		// 면 = 학년
		// 행 = 반
		// 열 = 학생
		int[][][] kors = new int[3][7][30];
		// 2학년 5반 15번 학생의 국어 점수는? kors[1][4][14]
		// 2학년 5반의 국어 점수 평균은?
		// kors[1][4][0] ~ kors[1][4][29]
		int tot = 0;
		for (int i = 0; i < 30; i++) {
			tot += kors[1][4][i];
		}
		double avg = (double)tot / 30;
		
		
	} // main

} // class
