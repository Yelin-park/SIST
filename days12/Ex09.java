package days12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오후 2:26:58
 * @subject p204 예제5-11)
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// Arrays.sort(); > 배열을 정렬하는 메서드
		
		// 0 <= n <= 9
		int[] m = new int[30];
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(10);
		}
		System.out.println(Arrays.toString(m));
		
		
		// for문이 30번 도는 코딩 ***
		int[] counter = new int[10];
		for (int i = 0; i < m.length; i++) {
			counter[ m[i] ]++; // ex8(m[i])의 개수(counter[8])가 1증가 한다.
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.printf("%d의 개수 : %d\n", i, counter[i]);
		}
		
		/*
		// for문이 300번 도는 코딩
		for (int i = 0; i <= 9; i++) {
			int count = 0;
			for (int j = 0; j < m.length; j++) {
				if(i == m[j]) count++;
			}
			System.out.printf("%d의 개수 : %d\n", i, count);
		}
		*/

	} // main

} // class
