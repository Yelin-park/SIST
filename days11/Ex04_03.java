package days11;

import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 3:15:56
 * @subject 배열의 길이 변경(증가) p189
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		int[] m = new int[3];
		m[0] = 100;
		m[1] = 85;
		m[2] = 93;
		
		// 2개의 정수를 더 저장을 해야 된다.
		// m 배열의 크기(길이)를 2개 더 증가(변경)		
		{
			int[] temp = new int[5];             // 5개 짜리 int를 담을 수 있는 temp 배열 생성
			for (int i = 0; i < m.length; i++) { // temp에 m 배열의 요소 값들을 담기(값을 복사하는 작업)
				temp[i] = m[i];
			}
			m = temp;                           // temp가 참조하는 주소를 m도 참조할 수 있도록 코드 작성
		}
		
		m[3] = 80;
		
		disp(m); 
		
		
		
	} // main

	private static void disp(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\n", i, m[i]);
		}
	} // disp

} // class
