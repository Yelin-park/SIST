package days13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오전 10:38:07
 * @subject 검색(Search) - [2진검색(Bionary Search)]
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 검색 - 순차검색 : 평균횟수 n/2
		//        [2진검색(Bionary Search)] == 성능 좋다 == 트리구조검색
        //            		n개의 데이터의 최대 비교 횟수는 log2n회이고, 평균 비교 횟수는 log2(n/2)이다.
		// 2진검색의 필수조건 : 반드시 정렬이 되어져 있어야 한다.
		//       bottom           middle                top
		//         0                5                   10
		//                              bottom  middle
		//                               6       8
		int[] m = {1, 3, 8, 11, 15, 17, 20, 21, 25, 30, 34};
		System.out.println(Arrays.toString(m));
		
		int n; // 검색할 정수
		System.out.print("> 검색할 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // ex) 찾고자 하는 값 25
		
		int idx = binarySearch(m, n);
		if(idx == -1) {
			System.out.println("찾는 정수는 없습니다.");
		} else {
			System.out.printf("%d 위치에서 찾았습니다.\n", idx);
		}
		
		// ex) 17일 때 (인덱스 : 5)
		// 가운데 값 == 25  > false
		// 가운데 값 > 25   > false   -> 만약 가운데 값이 더 크다면 오른쪽을 다 버림   > 인덱스의 끝은 
		// 가운데 값 < 25   > true    -> 1, 3, 8, 11, 15, 17을 다 버림(왼쪽을 다 버림) > 인덱스는 6부터 시작
		// 찾게되면 bottom, middle, top이 같은 값이 됨, 같은 값이 안되면 찾으려고 하는 값이 없는 것
		
		// 트리구조검색
		// 10억개 1,000,000,000
		// 1번 검색으로 절반 날아감 5억개
		// 2번 검색으로 절반 날아감 2.5억개
		// 3번 검색으로 절반 날아감 1.25억개
		// 4번 검색으로 절반 날아감 0.625억개
		// 5번 검색으로 절반 날아감 31,250,000
		// 6번 검색으로 절반 날아감 15,625,000
		// 7번						7,812,500
		// 8번						3,906,250
		// 9번                       1,953,125
		// 10번 976,562
		// 11번 488,281
		// 12번 244,140
		// 13번 122,070
		// 14번 61,035
		// 15번 30,517
		// 16번 15,258
		// 17번 7,629
		// 18번 3,814
		// 19번 1,907
		// 20번 953
		// 21번 476
		// 22번 238 
		// 23번 119
		// 24번 59
		// 25번 29
		// 26번 14
		// 27번 7
		// 28번 3
		// 29번 1
		// 30번 0
		
	} // main

	// 가운데 값 > 25   > false   -> 만약 가운데 값이 더 크다면 오른쪽을 다 버림   > 인덱스의 끝은 
	// 가운데 값 < 25   > true    -> 1, 3, 8, 11, 15, 17을 다 버림(왼쪽을 다 버림) > 인덱스는 6부터 시작
	private static int binarySearch(int[] m, int n) {
		// 강사님이 풀어주신 코드
		int bottom = 0;
		int top = m.length - 1;
		int middle;
		
		while(bottom <= top ) {
			middle = (top+bottom) / 2;
			if(m[middle] == n) return middle;
			else if(m[middle] > n) top = middle - 1;
			else				   bottom = middle + 1;
		}
		return -1;
		
		/*
		// 내가 풀다만 코드
		int idx = -1;
		int bottom = 0;
		int middle = m.length / 2;
		int top = m.length - 1;
		
		while(bottom != middle && middle != top && top != bottom) {
			if(m[middle] == n) return idx = middle;
			else if(m[middle] < n) {
				bottom = middle + 1;
				middle = (bottom + top) / 2;
			}
			else if(m[middle] > n) {
				top = middle - 1;
				middle = (bottom + top) / 2;
			}
		} // while
		
		return idx;
		*/
	}
	
} // class
