package days05;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 3:30:06
 * @subject 
 * @content 
 *                         if
 *                         switch
 *                         for  / for each 문
 *                         while / do~while
 *                         break
 *                         continue
 */
public class Ex10 {

	public static void main(String[] args) {
		// continue 문
		// 1~10 까지의 합을 출력하는 코딩 - [ for ]/ while
		// 1+2+3+4+5+6+7+8+9+10+=55
		
		// [문제] 1 ~ 10 중 홀수의 합을 출력  1+3+5+7+9+=25
		int sum = 0;
		
		// [1]
		/*
		for (int i = 1 ; i <= 10 ; i++) {
			if(i % 2 != 0) {
				sum += i;
				System.out.print( i + "+");
			} // if
		} // for
		
		*/
		// [2] continue 문 설명
		/*
       for (int i = 1 ; i <= 10 ; i++) {			
			if(i % 2 == 0) continue;			
			sum += i;
			System.out.print( i + "+"); 
		} // for
		*/
		
		// [3] (시험) 1~10 까지의 홀수의 합 
		// i = 1/3/5/7/9
		//         2씩 증가
		
		for (int i = 1 ; i <= 10 ; i += 2) {			 	
			sum += i;
			System.out.print( i + "+");
		}
		System.out.println("=" + sum);
		
	} // main

} // class













