package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오전 9:41:05
 * @subject 세로 구구단 출력2
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 2단 3단 4단 5단
		// 6단 7단 8단 9단
		
		// [반복 규칙]
		// k = 1      2단~5단       >  +3   >     5
		// k = 2      6단~9단       >  +3   >     9
		//            4*k-2
		
		for (int k = 1; k <=2; k++) {       // k for문은 중복되는 for문 횟수 반복해주는 코드
			System.out.println("k=" + k);   
			for (int i = 1; i <= 9; i++) {
				for (int j = 4*k-2; j <= 4*k-2+3 ; j++) {
					System.out.printf("%d * %d = %02d\t", j, i, i*j);
				} // j for
				System.out.println();
			} // i for
			System.out.println();
		} // k for
		
		
		/*
		
		// 1번 풀이(내가 풀었던 것)
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5 ; j++) {
				System.out.printf("%d * %d = %02d\t", j, i, i*j);
			} // j for
			System.out.println();
		} // i for
		
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 6; j <= 9 ; j++) {
				System.out.printf("%d * %d = %02d\t", j, i, i*j);
			} // j for
			System.out.println();
		} // i for
		
		
		*/
		
		

	} // main

} // class
