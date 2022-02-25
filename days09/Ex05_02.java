package days09;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오후 4:01:55
 * @subject 제어문 + 연산자 + 알고리즘 + 응용/활용 예제
 * @content 수열
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// [수열(sequence) : 규칙이 있는 수의 나열(자연수)]
		// 정보처리기사 - 실기(알고리즘)
		// 각 수 : term(항) -> 첫번째항 a1, 두번째 항 a2, n번째항 an (a는 작은 표기법)
		// 1 + 2 + 4 + 7 + 11 + 16 + 22 + ...  -> increase 증가치
		
		// 문제) while로 접근하기
		// 1. 항의 값이 250 전까지의 총합과 그 항의 값을 구하기
		
		int increase = 0; // 증가치
		int term = 1;
		int sum = 0;
		
		// while(term <= 250) {
		while((term += increase) <= 250) { // ***** 이해(암기)
			// term += increase;
			// if(term > 250) break;
			System.out.print(term + "+");
			sum += term;
			increase++; 
		}
		System.out.println("\b=" + sum);
		System.out.println("> 20번째 항 : " + term);
		
		/*
		// 내가 푼 코드
		int increase = 0; // 증가치
	      int term = 1;
	      int sum = 0;
	      
	      while(term < 250) {
	         term += increase; 
	         if(term < 250) { 
	            System.out.print(term + "+");
	            sum += term;
	            increase++; // 1
	         }
	      }
	      System.out.println("\b=" + sum);
	      System.out.println("> 항 값: " + (term - increase));
		*/

	} // main

} // class
