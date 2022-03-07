package days13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오전 10:38:07
 * @subject 검색(Search) 
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// [문제] 찾을 정수 n의 모든 위치값(인덱스값)을 출력하는 코딩을 하세용~
		int[] m = new int[30];
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(20) + 1;
		}
		
		System.out.println(Arrays.toString(m));
		
		int n; // 검색할 정수
		System.out.print("> 검색할 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		// idx : 메서드가 돌려주는 값 > 찾으면 찾은 위치값, 없으면 -1
		int startIndex = 0, idx;
		while ( (idx = sequenceSearch(m, n, startIndex)) != -1) {
			System.out.printf("%d 위치에서 찾았습니다.\n", idx);
			startIndex = idx + 1; // 찾은 위치 다음 위치를 시작하는 위치로 바꾸고 다시 while문 돌기
		}
		
	} // main
	
	// 찾지 못한 경우는 -1 값을 반환
	private static int sequenceSearch(int[] m, int n, int startIndex) { // startIndex 찾기 시작할 인덱스 위치
		int idx = -1; 
		for (int i = startIndex; i < m.length; i++) {
			if(m[i] == n) {
				idx = i;
				break; // 찾은 경우
			} // if
		} // i for
		return idx;
	} 

} // class
