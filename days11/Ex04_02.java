package days11;

import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 3:15:56
 * @subject 배열의 길이 변경 p189
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// ㄱ. int 배열을 선언 및 생성
		int[] m = new int[3];
		m[0] = 100;
		m[1] = 85;
		
		// ㄷ. m 배열명에 무엇이 들어가 있냐? [배열의 시작 주소]
		// 에러메시지 : java.lang.[NullPointerException]   *****
		// 해석 : 배열의 실제메모리의 주소가 없다.
		// GC(가비지 콜렉터) : 자동으로 메모리를 관리(자바 특징) -> 힙영역에 가비지를 버려주는 역할
		// 힙(Heap) 동적 영역 - 가비지가 가득 차면 언젠가는 힙 메모리가 가득 참 -> 오버플로워 발생 -> 파란색 화면 - 메모리 덤프
		// 힙 영역을 비우려면 컴퓨터를 껐다 켜야함(OFF -> ON)
		m = null;  // 시작주소와 연결이 끊어짐(더 이상 힙(동적) 영역에 있는 저장공간을 더 이상 참조하지 않겠다)
				   // 힙(동적) 영역에서 연결이 끊어진 저장공간 : 쓰레기(가비지)
		
		
		// [배열을 사용할 때 가장 많이 발생하는 에러 메시지]
		// 에러메시지 : java.lang.[ArrayIndexOutOfBoundsException]: 3   *****
		// 해석 : 배열 + 인덱스 + 바운드(범위) => 배열의 인덱스 범위가 벗어났다.
		// m[3] = 50; // 없는 방에 값을 집어넣으려고 하는 것
		
		// ㄴ. 배열 출력
		disp(m); // 배열 출력 함수
		
		
	} // main

	private static void disp(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\n", i, m[i]);
		}
	} // disp

} // class
