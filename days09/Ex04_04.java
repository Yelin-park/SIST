package days09;

import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오후 2:46:30
 * @subject 배열 안에서 중복 체크
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// 배열 안에서 중복 체크
		Random rnd = new Random();
		boolean flag = false; // 중복X : false, 중복O : true
		
		int[] lotto = new int[6];
		
		int idx = 0;
		// 몇 번만에 배열을 다 채울 수 있는지 모르니까(채워질때까지)while 쓰기
		while (idx <= 5) {
			int temp = rnd.nextInt(45) +1;
			
			if(!isDuplicateLotto(lotto, idx, temp)) {
				lotto[idx++] = temp;
				//idx++;
			}
		} //while
		
		
		System.out.println("END");

		
		
	} // main

	// 배열 안에서 해당위치에 값이 중복체크 해서 true/false 반환하는 메서드
	// 중복되면 true 반환
	// 중복 X   false 반환
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
	
} // class
