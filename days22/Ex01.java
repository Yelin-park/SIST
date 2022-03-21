package days22;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오전 10:11:26
 * @subject 막대기 문제_강사님 풀이
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		int n; // 막대기 수 저장할 변수
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] sticks = new int[n];
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = sc.nextInt(); // 막대기를 입력받기
		}
		
		Arrays.sort(sticks); // 막대기 정렬
		// System.out.println(Arrays.toString(sticks)); // 5 4 4 2 2 8

		int idx = 0, value;
		// int min = sticks[0]; // 가장 작은 값
		
		do {
			System.out.println(n - idx); // 처음엔 6 - 0 해서 원래 막대기 갯수 6이 나옴 -> 6-2 = 4
			value = sticks[idx]; // 찾기 시작한 값 2 -> 4
			try {
				while (value == sticks[++idx]); // idx 안에 있는 값이 같으면 반복문을 계속 돌고 다르면 빠져나와서 idx 값(위치값)이 다르게 나옴
			} catch (ArrayIndexOutOfBoundsException e) {
				// 다 찾고 또 찾으려고해서 예외 발생 -> 비정상적으로 처리하지 않기 위해서 try-catch 사용
			}
			
		} while (idx < n); // 막대기 갯수(6)보다 작을 때 까지
		
	} // main

} // class

/*
문제3) 막대기 자르기  - 취업문제 

각각 0이상의 정수를 길이로 하는 N개의 막대기가 있다.

 이 막대기들 중 가장 짧은 막대기의 길이로 모든 막대기를 자르는 것을 [cut operation]이라고 하자.

예를 들어 6개의 막대기가 있고 그 길이가 다음과 같다면 

5 4 4 2 2 8 

이 경우 [Cut Operation]을 한번 수행하면 다음과 같다. 

3 2 2 6

(가장 짧은 길이인 2로 6개의 막대기를 잘라내고 길이가 0이 되버린 2개의 막대기는 버려진다.) 

N개의 막대기와 그 각각의 길이가 주어졌을 때 [Cut Operation]을 모든 막대기가 버려질 때(길이가 0이 될때)까지 반복하고  수행 시 마다 남은 막대기의 수를 출력하는 프로그램을 작성하라. 

입력 
첫줄에 막대기의 수 N을, 다음 줄에 각각의 막대기의 길이를 공백으로 구분해서 입력한다.

출력 
매 줄마다 [Cut Operation]이 수행 되 때 마다 남은 막대기의 수를 출력 

제한 
1 <= N <= 1000
1 <= 막대기의 길이 <= 1000

입력 예제 #1
6
5 4 4 2 2 8

출력 예제 #1
6
4
2
1

입력 예제 #2
8
1 2 3 4 3 3 2 1

출력 예제 #2
8
6
4
1 
*/
