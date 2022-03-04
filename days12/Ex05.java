package days12;

import java.util.Arrays;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 10:21:46
 * @subject 배열의 단점 		-> 단점으로 인해서 컬렉션(Collection)을 사용
 * @content 1. 배열의 길이(크기)가 자동으로 증가/감소 X
 * 			2. 배열의 값을 추가/수정/삭제 등등 -> 개발자가 직접 처리를 해야한다.
 */
public class Ex05 {

	public static void main(String[] args) {
		int[] m = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(m));
		
		// 1. 새로운 요소를 추가
		int idx = 5;
		if(idx == m.length) {
			System.out.println("> 배열 크기가 부족하다.");
			m = days11.Ex04_04.increaseArraySize(m, idx);
		}
		
		m[idx] = 100; 
		System.out.println(Arrays.toString(m));
		
		idx++;
		
		// 2. m[3] 요소의 값을 제거
		// before : [1, 2, 3, 4, 5, 100, 0, 0, 0, 0]
		// after  : [1, 2, 3, 5, 100, 0, 0, 0, 0, 0]
		// ㄱ. 제거할 위치(3)보다 큰 인덱스의 배열 값을 앞으로 1칸씩 이동 (ex. 5와 100 > 0은 4보다 작아서 해당x)
		// ㄴ. 마지막 값(100)은 다시 초기화
		// ㄷ. idx 1 감소

		for (int i = 4; i < idx; i++) {
			m[i-1] = m[i];
		}
		m[idx-1] = 0;
		idx--;
		System.out.println(Arrays.toString(m));
	} // main

} // class
