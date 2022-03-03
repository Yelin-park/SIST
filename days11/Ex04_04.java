package days11;

import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 3:15:56
 * @subject 배열의 길이 변경(증가) 메서드 선언 + 호출p189 *****
 * @content 1. 기능 : 배열의 크기를 원하는 길이만큼 증가시키는 메서드 increaseArraySize
 * 			2. 매개변수 : 원래배열명(int[] m), int size(증가시킬 길이)
 * 			3. 리턴값(리턴자료형) : 지금은 모르겠으니 void
 */
public class Ex04_04 {

	public static void main(String[] args) {
		int[] m = new int[3];
		m[0] = 100;
		m[1] = 85;
		m[2] = 93;

		// 2개의 정수를 더 저장을 해야 된다.
		// m 배열의 크기(길이)를 2개 더 증가(변경)
		m = increaseArraySize(m, 5);

		m[3] = 80;

		disp(m);

	} // main

	public static int[] increaseArraySize(int[] m, int n) { // increaseArraySize 메서드로 인해 스택영역에 m 배열 생성, main()의 m과 같은 힙영역 주소를 참조

		int[] temp = new int[m.length + n];  // 원래 배열크기(main과 동일한 m이 참조하는 주소를 가짐) + n 만큼 증가한 것을 스택영역에 temp를 생성하여 저장 
		for (int i = 0; i < m.length; i++) { 
			temp[i] = m[i]; // temp에 m이 가지고 있는 요소의 값을 복사
		}
		
		// increaseArraySize = temp;
		// m = temp;
		
		return temp; // 스택영역에 생긴 temp가 참조하는 힙영역에 있는 m을 main에 리턴

	} // increaseArraySize

	private static void disp(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\n", i, m[i]);
		}
	} // disp

} // class
