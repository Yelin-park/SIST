package days09;

import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오후 3:30:07
 * @subject
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		fillLotto(lotto);
		
		dispLotto(lotto);
		
	} // main
	
	
	// 중복을 체크해주는 메서드
	public static boolean isDuplicateLotto(int[] lotto, int idx, int temp) {
		boolean flag = false;
		for (int i = 0; i < idx; i++) {
			if(temp == lotto[i]) {
				flag = true;
				break;
			} //if
		} //for
		return flag ;		
				
	} // is
	
	
	// 출력을 해주는 메서드
	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		}
		System.out.println();
	} // dispLotto

	
	// 채워넣는 메서드
	private static void fillLotto(int[] lotto) {
		Random rnd = new Random();
		int idx = 0;
		
		while(idx <= 5) {
			int temp = rnd.nextInt(45) +1;
			if(!isDuplicateLotto(lotto, idx, temp)) {
				lotto[idx++] = temp;
			} //if
		} //while
		
	} // fillLotto

} // class
