package days13;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오후 3:39:06
 * @subject [로또예제] days09.Ex04_02.java 
 * @content 내가 푼 코드
 */
public class Ex09_yelin {

	public static void main(String[] args) {
		// 1. 게임 회수 입력? 3
		// 1 로또번호 : [11][6][10][40][41][36]
		// 2 로또번호 : [11][6][10][40][41][36]
		// 3 로또번호 : [11][6][10][40][41][36]

		// 6 * 3 = 18   int[] lotto = new int[6*게임회수];
		//				int[][] lotto = new int[게임회수][6];
		
		Scanner sc = new Scanner(System.in);
		int n;
		String sn;
		String regex = "[1-9]||10"; // 게임 횟수 한도 10번 > 5만원까지
		do {
			System.out.println("게임 회수 입력하세요?");
			sn = sc.next();
		} while (!sn.matches(regex));
		
		n = Integer.parseInt(sn);

		int[][] lottogame = new int[n][6];
		
		for (int i = 0; i < n; i++) {
			int[] lotto = new int[6];
			days09.Ex04_02.fillLotto(lotto);
			dispLotto(lotto);
			int col = lottogame[0].length;
			for (int j = 0; j < lotto.length; j++) {
				lottogame[i][j%col] = lotto[j];
			}
		}
		
		dispM(lottogame);

	} // main
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d] = %d\t", i, j, m[i][j]);
			} // j for
			
			System.out.println();
			
		} // i for
	}
	
	// [생성된 로또 번호 출력하는 메서드]
	public static void dispLotto(int[] lotto) {
		// 배열명.length == 배열의 크기(길이) == 6
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		} // i for
		System.out.println(); // 개행
	} // dispLotto
	
	
} // class
