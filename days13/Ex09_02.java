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
public class Ex09_02 {

	public static void main(String[] args) {
		// 동적 배열
		int[][] lottos; // 배열 선언
		int gameNumber = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 회수 입력하세요?");
		gameNumber = sc.nextInt();
		lottos = new int[gameNumber][6];
		
		// ***** p216 그림 5-5 반드시 이해 *****
		// 2차원 배열 로또번호 채워넣는 코딩
		for (int i = 0; i < gameNumber; i++) {
			fillLottoOne(lottos[i]); // ex) 책 그림에서는 score[0]
		}
		
		// 출력
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%d 로또번호 :", (i+1));
			dispLottoOne(lottos[i]);
		}

	} // main
	
	public static boolean isDuplicateLotto(int[] lotto, int idx, int temp) {
		boolean flag = false;
		for (int i = 0; i < idx; i++) {
			if(temp == lotto[i]) {
				flag = true;
				break;	
			} // if
		} // i for
		return flag;
	}

	public static void fillLottoOne(int[] lotto) {
		Random rnd = new Random();
		
		int idx = 0;
		// 몇 번만에 배열을 다 채울 수 있는지 모르니까(채워질때까지)while 쓰기
		while (idx <= 5) {
			int temp = rnd.nextInt(45) +1;
			
			if(!isDuplicateLotto(lotto, idx, temp)) {
				lotto[idx++] = temp;
				//idx++;
			}
		} //while
	
	} // fillLotto
	
	public static void dispLottoOne(int[] lotto) {
		// 배열명.length == 배열의 크기(길이) == 6
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		} // i for
		System.out.println(); // 개행
	} // dispLotto
	
} // class
