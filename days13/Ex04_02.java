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
public class Ex04_02 {

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
		
		// 2번 풀이
		int[] idxArr = sequenceSearch(m, n);
		System.out.println(Arrays.toString(idxArr));
		if(idxArr == null) {
			System.out.println("찾는 정수는 없습니다.");
		} else {
			for (int i = 0; i < idxArr.length  ; i++) {
				 if(  idxArr[i] != -1  )  System.out.printf("%d 위치에서 찾았다.\n", idxArr[i]);
			} // i for
		} // else
           
		
		/*
		// 1번 풀이
		int[] idxArr = sequenceSearch(m, n);
		// idxArr.length == 0 System.out.println("찾는 정수는 없습니다.");
		
		if(idxArr[0] == -1) System.out.println("찾는 정수는 없습니다.");
		else {
			for (int i = 0; i < idxArr.length && idxArr[i] != -1; i++) {
				if(idxArr[i] != -1) System.out.printf("%d 위치에서 찾았다.\n", idxArr[i]);
			}
		}
		*/
		
		/*
		int idx = sequenceSearch(m, n); // 찾은 위치값
		if(idx == -1) System.out.println("찾는 정수는 없습니다.");
		else          System.out.printf("%d 위치에서 찾았습니다.\n", idx);
		*/
		
	} // main
	
	// 2번 풀이
	private static int[] sequenceSearch(int[] m, int n) {
		// 배열을 크기를 정할 수 있도록 찾으려고 하는 값이 있는 개수를 세는 코딩
		int idxLength = 0; 
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) idxLength++;
		} // i for
		
		if (idxLength == 0) return null; // 찾으려고 하는 값이 없다면 배열은 null을 돌려주기
		
		int[] idxArr = new int[idxLength]; // 찾은 개수만큼 배열의 크기를 할당
		int idx = 0; // 채워넣어야 할 배열의 인덱스 시작 값
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) idxArr[idx++] = i;
		} // i for
		
		return idxArr;
	} // 2번 풀이
	
	/*
	// 1번 풀이
	private static int[] sequenceSearch(int[] m, int n) {
		int[] idxArr = new int[m.length]; // -1로 초기화
		Arrays.fill(idxArr, -1);
		int idx = 0;
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) {
				idxArr[idx++] = i;
			}
		}
		
		return idxArr;
	}  // 1번 풀이
	*/
	
	/*
	private static int sequenceSearch(int[] m, int n) {
		int idx = -1;
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) {
				idx = i;
				break;
			}
		}
		return idx;
	} 
	*/ 

} // class
