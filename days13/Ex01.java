package days13;

import java.util.Arrays;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오전 9:05:26
 * @subject 배열, 제어문 응용 및 활용
 * @content 배열, 정렬(sort) - 버블정렬, 선택정렬 [병합정렬(Marge Sort)]
 */
public class Ex01 {

	public static void main(String[] args) {
		// 병합정렬 : 비교 기반 정렬 알고리즘
		// 이미 정렬되어져 있는 두 개의 배열을 합병하여 한 개의 배열로 만드는 정렬 방식
		// 7 4    3 8    2 5    1 6
		// 4 7    3 8    2 5    1 6
		//  3 4 7 8       1 2 5 6
		// 1 2 3 4 5 6 7 8
		int[] m = { 1, 3, 6 };
		int midx = 0;
		int[] n = { 2, 4, 5, 7, 8, 9 };
		int nidx = 0;
		int[] mn = new int[m.length + n.length];
		int mnidx = 0;
		
		
		while (midx != m.length && nidx != n.length) {
			mn[mnidx++] = (m[midx] > n[nidx]) ? n[nidx++] : m[midx++];
			
			// if(m[midx] > n[nidx]) mn[mnidx++] = n[nidx++];
			// else 				  mn[mnidx++] = m[midx++];
			
		} // while
		
		// 가독성이 더 좋은 코딩 **
		int[] temp = (m.length == midx) ? n : m; // 남은 배열
		int tempidx = (m.length == midx) ? nidx : midx; // 남은 배열의 인덱스
		for (int i = tempidx; i < temp.length; i++) {
			mn[mnidx++] = temp[i];
		} // i for
		
		// for문 대신 System.arraycopy 사용해도 됨
		
		System.out.println(Arrays.toString(mn));
		
		
		/*
		// 남은 배열 복사 코딩 추가
		if(midx == m.length) { // n배열이 남아있다.
			for (int i = nidx; i < n.length; i++) { // mn.length도 가능하던디..
				mn[mnidx++] = n[nidx++];
			}
		} else {
			for (int i = mnidx; i < m.length; i++) {
				mn[mnidx++] = m[midx++];
			}	
		}
		*/
		
		/*
		// 내가 풀다만 코드
		int m_idx = 0;
		int n_idx = 0;
		int k_idx = 0;

		while (k_idx != mn.length) {
			if (m[m_idx] > n[n_idx]) {
				mn[k_idx++] = n[n_idx++];
			} else if (m[m_idx] < n[n_idx]) {
				mn[k_idx++] = m[m_idx++];
			}
			if(m_idx == m.length) {
				for (int i = n_idx; i < n.length; i++) {  // 나는mn.length로 해서 범위가 벗어난다고 에러 발생***
					mn[k_idx++] = n[n_idx++];
				}
			}
			
		}
		System.out.println(Arrays.toString(mn));
		*/

	} // main

} // class
