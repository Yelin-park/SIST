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
public class Ex04 {

	public static void main(String[] args) {
		// 검색(Search) : 같은 성질을 가지는 항목의 [집합]에서 필요한 특성을 갖는 [항목]을 찾아내는 것
		// 순차 검색(탐색)법(Sequential search)   찾아내는 횟수가 평균 n/2 횟수 
		// 2진 검색(탐색)법(Binary Search)
		
		int[] m = new int[30];
		
		Random rnd = new Random();
		// 1 ~ 20까지의 임의의 정수를 채워넣기
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(20) + 1;
		}
		
		System.out.println(Arrays.toString(m));
		
		int n; // 검색할 정수
		System.out.print("> 검색할 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		// 순차적으로 탐색하여 검색할 정수가 있는 위치값을 찾아서 반환
		int idx = sequenceSearch(m, n); // 찾은 위치값
		if(idx == -1) System.out.println("찾는 정수는 없습니다.");
		else          System.out.printf("%d 위치에서 찾았습니다.\n", idx);
		
		
	} // main
	// 1. 기능 : 배열(항목의 집합)에서 정수(특정 항목)을 찾아서 위치값을 반환하는 메서드
	// 2. 매개변수 : 항목의 집합(배열), 특정 항목(정수)
	// 3. 리턴값(리턴자료형) : 특정 항목이 없으면 -1, 있으면 특정 항목이 있는 위치값 (int)
	private static int sequenceSearch(int[] m, int n) {
		int idx = -1; // 배열의 인덱스 값은 0부터 시작하므로, -1이 반환되면 찾는 값이 없다는 뜻
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) {
				idx = i;
				break; // break문이 있으면 맨 처음 찾은 인덱스 값을 반환, 없으면 맨 마지막에 찾은 인덱스 값을 반환
			}
		}
		return idx;
	} 
	
	/*
	private static int[] sequenceSearch(int[] m, int n) {
		int[] idx = null;
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) {
				idx[i] = i;
			}
		}
		return idx;
		
	} 
	*/
} // class
