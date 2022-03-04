package days12;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 11:10:05
 * @subject p202 정렬(Sort) - 자료를 [일정한 기준]에 따라 나열하는 것
 * @content                          [키] 순으로 정렬 - 작은 사람 ~ 큰 사람     Ascending(어센딩) 오름차순 정렬 : 1,2,3..,10
 * 													    큰 사람 ~ 작은 사람     Descending(디센딩) 내림차순 정렬
 * 									 [성적]순으로 정렬 ASC
 * 								     [나이]순으로 정렬 DESC
 * 
 * 			[정렬 방법] - 정보처리기사 실기(알고리즘)
 * 			1. [선택정렬, 삽입정렬, 버블정렬, 병합정렬,] 퀵정렬, 힙정렬... 등등
 * 			Ex08은 버블정렬과 선택정렬
 */
public class Ex08 {

	public static void main(String[] args) {
		int[] m = {3, 5, 2, 4, 1};
		// 1. 버블정렬(Bubble sort) - 오름차순(ASC) 정렬 기준으로 설명
		//   - [서로 이웃한 데이터들을] 비교하며 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식이다.
		//     가장 큰 값이 맨 뒤로 오면 1회전을 한 것이다.
		//     가장 큰값을 빼고 그 다음 큰 값을 뒤로 보내며 정렬하기(2회전) .. 반복(n회전)
		// m = bubbleSort(m);
		
		// 2. 선택정렬(selection sort)
		//   - 정렬되지 않은 데이터들에 대해 가장 작은 데이터를 찾아 가장 앞의 데이터와 교환해나가는 방식이다.
		
		m =  selectionSort(m);
		
		
		
		System.out.println(Arrays.toString(m));
		
		
		


	} // main
	
	// 선택 정렬 - 유튜버, 컴퓨터 개론(선택정렬) 코딩(회전당 자리바꿈 1번만 하기)
	private static int[] selectionSort(int[] m) {
		// {3, 5, 2, 4, 1};
		// [1], 5, 2, 4, 3  회전당 자리바꿈 1번만 하기
		int minIndex; // min == m[miniIndex]
		for (int i = 0; i < m.length-1; i++) { // 3번 인덱스 까지 (맨마지막은 그대로 있어도 되기때문에 맨마지막은 자리바꿈 안함)
			minIndex = i; 	// 배열에 있는 값들 중 가장 작은 값, 위치값(인덱스)
			for (int j = i+1; j < m.length; j++) { // 가장 작은 값을 minIndex 값으로 설정하고 해당하는 인덱스를 제외한 뒤에있는 나머지 인덱스 값들을 비교하는 코딩
				if(m[minIndex] > m[j]) minIndex = j; // 만약 minIndex에 있는 값이 더 크면 minIndex값을 j로 바꿔라
			} // j for
			// i값이 minIndex와 다르다면(가장 작은 값의 위치가 다르기 때문에 자리바꿈하는 코딩)
			if(i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			} // if
			
		} // i for
		
		return null;
	} // selectionSort

	/*
	// 매번 자리 바꿈을 하는 코딩
	private static int[] selectionSort(int[] m) {
		// 0 1 2 3 4
		// 3 5 2 4 1
		// 앞의 값 > 뒤의 값 자리 바꿈
		// 0-1 0-2 0-3 0-4			[1] 0 0 0 0
		// 1-2 1-3 1-4              [1][2] 0 0 0
		// 2-3 2-4					[1][2][3] 0 0
		// 3-4						[1][2][3][4] 0
		
		for (int i = 0; i < m.length-1; i++) {
			for (int j = i+1; j < m.length; j++) {
				System.out.printf("%d-%d\t",i,j);
				if(m[i] > m[j]) {
					System.out.print("***");  // 자리 바꿈이 있을 때 마다 ***을 찍기
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m)); // 매자리마다 바꾼 것이 출력
			}
			// System.out.println(Arrays.toString(m));
		}
		return m;
		
		/*
		// 내가 풀다만 코딩
		int min = m[0];
		for (int i = 1; i < m.length; i++) {
			min = min > m[i] ? m[i] : min;
			if(min == m[i]) {
				int temp = min;
				min = m[i];
				m[i] = temp;
			}
			m[i-1] = min;
		}
		System.out.println(Arrays.toString(m));
	
		// return m;
	} // selectionSort
*/	
	
	private static int[] bubbleSort(int[] m) {
		// 앞 > 뒤 자리바꿈
		// 0-1 1-2 2-3 3-4        1회전    0 0 0 0 [5]
		// 0-1 1-2 2-3 		      2회전    0 0 0 [4][5]
		// 0-1 1-2      		  3회전    0 0 [3][4][5]
		// 0-1        			  4회전    [1][2][3][4][5]
		
		for (int i = 0; i < 4; i++) {
			System.out.println((i+1) + "회전");
			for (int j = 0; j < 4-i; j++) {
				System.out.printf("%d-%d 자리 비교 :", j, j+1);
				if(m[j] > m[j+1]) { // 부등호만 바꾸면 내림차순 정렬이 됨
					System.out.print("***");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				} // if
				
				System.out.println(Arrays.toString(m));
			} // j for
		} // i for
		return m;
	} // bubbleSort

} // class
