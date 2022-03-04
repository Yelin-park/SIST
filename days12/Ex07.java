package days12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 11:08:32
 * @subject p197 예제5-7)
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// p197 예제5-7) 배열의 섞기(shuffle)
		// 수업 종료 후에 코딩하기(책보지말고!)
		
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		
		Random rnd = new Random();
		
		for (int i = 0; i < 100; i++) {
			int a = rnd.nextInt(10);
			int temp = numArr[0];
			numArr[0] = numArr[a];
			numArr[a] = temp;
		}

		System.out.println(Arrays.toString(numArr));

	} // main

} // class
