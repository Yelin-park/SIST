package days06;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오전 9:43:13
 * @subject 5일차 복습문제 풀이 10번 풀이(n이 큰값 m이 작은 값일 경우)
 * @content
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 5일차 복습문제 10번 풀이
		int n, m;
		Scanner sc = new Scanner(System.in);

		System.out.print("두 정수(n, m)값을 입력하세요: "); // 2 3 입력
		n = sc.nextInt(); // 블러킹(멈춰있다) > 입력을 해줘야 해결
		m = sc.nextInt();

		int sum = 0;
		// 5(n) 3(m)           5 <= 3 : 거짓 -> for문을 종료하고 sum을 출력
		// 풀이1) 중복된 코드가 많다
		/*
		if (n > m) {
			for (int i = m; i <= n; i++) {
				sum += i;
				System.out.print(i + "+");
			}
		} else if (n < m) {
			for (int i = n; i <= m; i++) {
				sum += i;
				System.out.print(i + "+");
			}
		}
		*/
		
		// 풀이2) 자리를 바꿔서 출력
		/*
		if(n > m) {
			// 자리 바꿈
			int temp = n;
			n = m;
			m = temp;
		} // 항상 n < m
		for(int i = n; i <= m; i++) {
			sum +=  i;
			System.out.print(i + "+");
		}
		*/
		
		// 풀이3) 제일 좋은 코딩 *** > 2번이랑 같지만 3번 풀이가 가독성이 좋기 때문에
		int min = n > m ? m : n;
		int max = n > m ? n : m;
		
		for(int i = min; i <= max; i++) {
			sum +=  i;
			System.out.print(i + "+");
		}
		
		System.out.println("\b=" + sum);
		
	} // main
}// class
