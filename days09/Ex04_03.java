package days09;

import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오후 2:46:30
 * @subject 배열 안에서 중복 체크
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// 배열 안에서 중복 체크
		Random rnd = new Random();
		boolean flag = false; // 중복X : false, 중복O : true
		int[] lotto = new int[6];
		lotto[0] = 7;
		lotto[1] = 32;
		lotto[2] = 15;
		lotto[3] = 8;
		
		// 채워넣을 위치(인덱스)
		int idx = 4;
		int temp; 
		do {
			flag = false;
			temp = rnd.nextInt(45) + 1; 
			for (int i = 0; i < idx; i++) {
				if(temp == lotto[i]) {
					flag = true;
					break;	
				} // if
			} // i for
		} while (flag);
		
		lotto[idx] = temp;
		System.out.println("END");

		
		
	} // main

} // class
