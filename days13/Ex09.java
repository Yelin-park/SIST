package days13;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오후 3:39:06
 * @subject [로또예제] days09.Ex04_02.java 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 1. 게임 회수 입력? 3
		// 1 로또번호 : [11][6][10][40][41][36]
		// 2 로또번호 : [11][6][10][40][41][36]
		// 3 로또번호 : [11][6][10][40][41][36]

		// 6 * 3 = 18   int[] lotto = new int[6*게임회수];
		//				int[][] lotto = new int[게임회수][6];
		
		// 동적배열
		int[][] lottos;
		
		int gameNumber = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 회수 입력하세요?");
		
		gameNumber = sc.nextInt();
		lottos = new int[gameNumber][6];
		fillLottos(lottos);
		dipsLottos(lottos);

	} // main

	private static void dipsLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%d 로또번호 :", (i+1));
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.printf("[%d]", lottos[i][j]);
			} // j for
			System.out.println();
		} // i for
		
	} // dipsLottos
	
	public static boolean isDuplicateLotto(int[][] lottos, int row, int idx, int temp) { // row -> 채워넣고자 하는 행
		boolean flag = false;
		for (int i = 0; i < idx; i++) {
			if(temp == lottos[row][i]) { // row행 안에 중복이 있는지 확인
				flag = true;
				break;	
			} // if
		} // i for
		return flag;
	} // isDuplicateLotto

	private static void fillLottos(int[][] lottos) {
		int gameNumber = lottos.length; // 행 갯수 == 게임 횟수
		for (int i = 0; i < lottos.length; i++) { // 게임 횟수만큼 로또 번호를 만들겠다.
			
			Random rnd = new Random();
			
			int idx = 0;
			// 몇 번만에 배열을 다 채울 수 있는지 모르니까(채워질때까지)while 쓰기
			while (idx <= 5) {
				int temp = rnd.nextInt(45) +1;
				if(!isDuplicateLotto(lottos, i, idx, temp)) { // lottos, i > 2차원 배열의 같은 행
					lottos[i][idx++] = temp; // 같은 행의 idx 안에 로또번호를 넣어라
				}
			} //while
			
		} // for i

	} // fillLottos
	
} // class
