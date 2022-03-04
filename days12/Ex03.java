package days12;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 9:47:47
 * @subject p189 배열의 길이 변경하기
 * @content p189 배열의 초기화 ***
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		int[] m;    	// 스택 [] m  -> 선언
		// new int[3]; 	// 힙  100번지[][][] > int를 실제로 저장할 수 있는 배열크기 3개를 잡겠다.  -> 선언
		m = new int[3]; // 스택[100번지]  m은 참조변수가 된다.

		// 값을 처음 할당하는 것을 초기화라고 한다.
		m[0] = 90; // 초기화
		m[1] = 80; // 초기화
		m[2] = 70; // 초기화
		*/
		
		// m[3] = 100; // 에러메시지 : java.lang.ArrayIndexOutOfBoundsException 
		
		// 배열 초기화
		// 배열의 선언(생성)과 초기화를 동시에
		int[] m = {90, 80, 70};
		
	} // main

} // class
