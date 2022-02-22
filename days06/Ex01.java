package days06;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오전 9:43:13
 * @subject 5일차 복습문제 풀이 [9, 10 문제 부족]

 * @content
 * 			for문은 반복문     > 반복횟수가 정해져있을 때
 *          while은 조건반복문 > 반복횟수 X, 조건을 반복하는 것 > 조건만 있을 때는 while문이 더 사용하기 쉬움
 *          
 *          7.
 *           - 배열 관련 : Kors[9] == 마지막 요소(9번째 요소) == kors[kors.length - 1]
 *           
 *          8.
 *           - while 문의 조건식이 false면 실행 x
 *           - do{
 *               // t/f 상관없이 최소한 1번 수행{}
 *              } while(false);
 *             
 *          9. 
 *           - "a" -> chatAt(index) -> 'a' : 문자열의 특정인덱스 값의 문자를 돌려주는 메서드
 *           - 알파벳 조건 : 'A' ~ 'Z' || 'a' ~ 'z'
 *             'A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z'   > () 안쳐도 됨. 우선순위가 ! > && > || 입니다.
 *             Character.isUpperCase(ch) || Character.isLowerCase(ch)
 *             Character.isAlphabetic(int) > 유니코드 문자 체크 메서드 > 리턴값/자료형은 boolean
 */
public class Ex01 {

	public static void main(String[] args) {
		// 5일차 복습문제 10번 풀이
		int n, m;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수(n, m)값을 입력하세요: "); // 2 3 입력
		n = sc.nextInt();
		m = sc.nextInt();

		int sum = 0;
		
		// for문 사용
		for(int i = n; i <= m; i++) {  // int i = 0; i <= 10; i++
			sum += i;
			System.out.print(i + "+");
		}
		System.out.println("\b=" + sum);
		
		
		/*
		// while문 사용 > 1~10까지 합을 구하는 while문을 작성해보고 수정하면 로직이해하기쉬움
		while(n <= m) {
			sum += n;
			System.out.print(n + "+");
			n++;
		}
		System.out.println("\b=" + sum); 
		*/
	}

}
