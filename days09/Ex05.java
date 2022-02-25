package days09;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오후 4:01:55
 * @subject 제어문 + 연산자 + 알고리즘 + 응용/활용 예제
 * @content 수열
 */
public class Ex05 {

	public static void main(String[] args) {
		// [수열(sequence) : 규칙이 있는 수의 나열(자연수)]
		// 정보처리기사 - 실기(알고리즘)
		// 각 수 : term(항) -> 첫번째항 a1, 두번째 항 a2, n번째항 an (a는 작은 표기법)
		// 1 + 2 + 4 + 7 + 11 + 16 + 22 + ...  -> increase 증가치
		// 1. 20번째 항의 값은?
		// 규칙 1,2,3,4.. 순서대로 더하고 있다.
		
		// [강사님이 풀어주신 코딩]
		// 1~20번째 항의 값과 총 합 구하기
		int increase = 0; // 증가치
		int term = 1;
		int sum = 0;
		// int[] a = new int[20]; // *** 배열로 할시
		
		for (int i = 1; i <= 20; i++) {
			term += increase; // 첫번째항은 1이 되고..
			// a[i] = term; // *** 배열로 할시
			System.out.print(term + "+");
			sum += term;
			increase++; // 1
		}
		System.out.println("\b=" + sum);
		System.out.println("> 20번째 항 : " + term);
		
		/*
		// [다른 사람이 푼 잘한 코딩]
		int a[] = new int [20];
	      a[0] = 1;
	      System.out.print(a[0]);
	      
	      for (int i = 1; i <= 19; i++) { // i는 증가치
	         a[i] = a[i-1] + i;
	         System.out.print(a[i]);
	      }
		*/
		
		//int term = 1;
		int n = 20;
		for (int i = 2; i <= n; i++) {
			term += (i-1);
		}
		System.out.println(term);
		/*
		// 첫번째항 빼고는 작업이 다 똑같음
		// 1항
		int increase = 1; // 증가치
		int term = 1;
		System.out.print(term + "+"); //1+
		
		// 2항
		term += increase;
		System.out.print(term + "+"); //2+
		 
		// 3항
		increase++; // 2
		term += increase;
		System.out.print(term + "+"); //4+
		
		// 4항
		increase++; // 3
		term += increase;
		System.out.print(term + "+"); //7+
		*/
		
		/*
		// 내가 풀다만 코드
		int sum = 0;
		int temp = 0;
		for (int i = 0; i <= 20; i++) {
			sum = i;
			temp = sum + i;
			
			System.out.printf("%d +", temp);
		}
		*/
		

	} // main

} // class
