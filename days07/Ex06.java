package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 3:38:43
 * @subject
 * @content 제어문 + 연산자 응용 및 활용
 */
public class Ex06 {

	public static void main(String[] args) {
		// [문제] 1-2+3-4+5-6+7-8+9-10=-5
		// 짝수일 경우 sum -= i    %d +
		// 홀수일 경우 sum += i    %d -
		
		// **** [4번 풀이] **** 좋은 코딩! -> 스위치 변수와 삼항연산자 사용
		
		boolean sw = false;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += (sw ? -i : i);
			System.out.printf(sw ? "%d+" : "%d-" , i);
			sw = !sw;
		}
		System.out.println("\b=" + sum);
		
		
		/*
		// *** [3번 풀이] ***    -> 연산없이 스위치 변수가 t/f 일때 계산
		// [스위치 변수] 선언해서 코딩
		boolean sw = false;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(sw) { // 짝수
				sum -= i;
				System.out.printf("%d+", i);
			} else {         // 홀수
				sum += i;
				System.out.printf("%d-", i);
			}
			sw = !sw;  // if/else 문이 끝나면 sw 값을 반대로 바꿈
		}
		System.out.println("\b=" + sum);
		
		
		/*
		// [2번 풀이] 삼항연산자 풀이(강사님이 풀어주신 코드)
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += (i % 2 == 0 ? -i : i);
			System.out.printf(i%2==0 ? "%d+" : "%d-" , i);
		}
		System.out.println("\b=" + sum);
		*/
		
		/*
		// [1번 풀이](강사님이 풀어주신 코드)
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) { // 짝수
				sum -= i;
				System.out.printf("%d+", i);
			} else {         // 홀수
				sum += i;
				System.out.printf("%d-", i);
			}
			//sum += i;
			//System.out.printf("%d+", i);
		}
		System.out.println("\b=" + sum);
		*/
		
		/*
		// (내가 푼 것)
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if(i % 2 != 0) {
				System.out.print("+");
				sum += i;   
			}
			else {
				System.out.print("-");
				sum -= i;
			}
			System.out.print(i);
		}
		System.out.println("=" + sum);
		*/

	} // main

} // class
