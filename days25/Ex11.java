package days25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 3:31:21
 * @subject p633 예제11-22
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// Set		25개 랜덤한 정수(1~50)를 저장
		// 반복자를 사용해서 int[][] board (2차원배열 5행5열)에 채워넣고
		// 2차원 배열 출력
		
		Set<Integer> set = new HashSet<Integer>();
		int[][] b = new int [5][5];
		
		Random rnd = new Random();
		
		while (set.size() < 25) {
			set.add((int)(Math.random() * 50) + 1);
		} // while
		
		Iterator<Integer> ir = set.iterator();
		int idx = 0;
		// 5열 갯수 b[0].length;
		while (ir.hasNext()) {
			Integer n = (Integer) ir.next();
			b[idx/5][idx%5] = n;
			idx++;
			System.out.printf("[%02d]", n);
			if(idx % 5 == 0) System.out.println();
		} // while
		
		
		/*
		for (int i = 0; i < b[0].length * b.length; i++) {
			set.add(rnd.nextInt(25)+1);
		}
		*/
		
		/*
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = Integer.parseInt((String) ir.next());
				System.out.printf("b[i][j] < 10 ? "	" : " " ", b[i][j]);
			}
			System.out.println();
		}
		*/
	} // main

} // class
