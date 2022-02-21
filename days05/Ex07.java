package days05;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 2:40:24
 * @subject while 조건 + 반복문
 * @content 
 * 
 *                 for    - 반복 횟수
 *                 while  - 반복 조건
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * if (condition) { // 조건이 참이면 {} 블럭을 처리 }
		 */
		
		
		/*
		while (condition) {
			// 조건이 참일동안 반복해서 {} 블럭을 처리
		} //
		*/
		
		/*
		// 헬로우 월드 10번 출력
		int i = 1;
		// 1 2 3 4 5 6 7 8 9 10
		while (   i <= 10 ) {
			System.out.println("헬로우 월드");
			i++;
		} // while
		*/
		
		// [시험]
		
		// 1~10 까지 합을 while 문 사용해서 처리.
		int i = 1, sum = 0;
		// 무한루프
		while (i <= 10) {    // 1 <=10 true일때 까지
			sum += i;
			System.out.print(i + "+");			
			i++;
		}		
		System.out.println("=" + sum);

	}  // main

} // class















