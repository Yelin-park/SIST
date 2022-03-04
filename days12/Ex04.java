package days12;

import java.util.Arrays;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 10:08:57
 * @subject p192 배열의 복사
 * @content System.arraycopy(); 메서드
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] m = {1, 2, 3};
		int[] temp = new int[m.length + 5];
		
		/*
		for (int i = 0; i < m.length; i++) {
			temp[i] = m[i];
		}
		*/
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// 1. 기능 : System 클래스 안에 배열을 복사하는 메서드 : arraycopy()
		// 2. 매개변수 : src, srcPos, dest, destPos, length
		// 		src : 복사할 배열
		// 		dest : 복사할 곳의 배열
		//		srcPos : 복사를 시작할 요소의 인덱스 위치
		//		destPos : 복사를 하여 붙여넣을 인덱스 위치
		// 		length : 몇개 복사할 것인가
		// 3. 리턴값(리턴자료형) void
		
		System.arraycopy(m, 1, temp, 4, 2);
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(temp));
		

	} // main

} // class
