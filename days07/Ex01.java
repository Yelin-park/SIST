package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오전 9:02:34
 * @subject Chapter4 제어문(조건문과 반복문)
 * @content *** 제어문 활용하는 예제 ***
 * 
 *          - 2주가 끝나면 만드는(10일) 프로그램  >  사다리타기게임 / 미로찾기
 *          - 프로그래머스에서 코딩문제 풀어보기
 */
public class Ex01 {

	public static void main(String[] args) {
		// 세로 구구단 출력
		// i=2 j=1,2,3,4,5,6,7,8,9    >    i=1 j=2,3,4,5,6,7,8,9
		// i=3 j=1,2,3,4,5,6,7,8,9
		// i=9 j=1,2,3,4,5,6,7,8,9
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %02d\t", j, i, i*j);
			} // j for
			System.out.println();
		} // i for
		
		
		
	} // main

} // class
