package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오전 10:13:39
 * @subject 세로 구구단 출력3
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		// 세로 구구단 출력 	        
		// 2단 3단 4단   	
		// 5단 6단 7단    	
		// 8단 9단        	
		//                         
		
		// [반복규칙]
		// k=1    2,3,4
		// k=2    5,6,7
		// k=3    8,9
		//        3*k-1        3*k-1+2 
		
		
		// 3번 풀이 : 단을 출력하는 코딩안에 조건을 추가하기 [좋은 코딩]
		for (int k = 1; k <=3; k++) {       // k for문은 중복되는 for문 횟수 반복해주는 코드
			System.out.println("k=" + k);   
			out:for (int i = 1; i <= 9; i++) {
				for (int j = 3*k-1; j <= 3*k-1+2 && j != 10 ; j++) {  // 단을 출력하는 코딩
					System.out.printf("%d * %d = %02d\t", j, i, i*j);
				} // j for
				System.out.println();
			} // i for
			System.out.println();
		} // k for
		
		
		
		
		// 2번 풀이(이름붙은for문)
		for (int k = 1; k <=3; k++) {       // k for문은 중복되는 for문 횟수 반복해주는 코드
			System.out.println("k=" + k);   
			for (int i = 1; i <= 9; i++) {
				out:for (int j = 3*k-1; j <= 3*k-1+2; j++) {  // 단을 출력하는 코딩
					if( j == 10) {
						System.out.print("XX");
						break out;
					} // if문
					System.out.printf("%d * %d = %02d\t", j, i, i*j);
				} // j for
				System.out.println();
			} // i for
			System.out.println();
		} // k for
		
		
		/*
		// 내가 풀다만 코딩
		for (int k = 1; k <=3; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = k*2+1; j <=k*2+2; j++) {
					System.out.printf("%d * %d = %02d\t", j, i, j*i);
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

		
		
		
		
	} // main

} // class
