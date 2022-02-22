package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오후 2:05:35
 * @subject 중첩 for문 문제 - 혼자 해본 것
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/* 
		i = 1
			j = 1,2,3,4,
		 i = 2
			j = 1,2,3,4,
		 i = 3
			j = 1,2,3,4,
		 */
		
		// 1번 문제
	    // *
	    // **
	    // ***
	    // ****
	/*
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print("*");
			} System.out.println("*");
		} 
	 */

	      // 2번 문제
	      // ****
	      // ***
	      // **
	      // *
	/*	
		for (int i = 4; i >= 1; i--) {  
			for (int j = 1; j <= i; j++) { 
				System.out.print("*");
			} System.out.println();
		} 
	*/	


	      // 3번 문제
	      // ___*
	      // __**
	      // _***
	      // ****


		for (int i = 1; i <= 4; i++) {  // 행
			for (int j = 1; j <= i+1 ; j++) { // 열
				System.out.print(" ");
			}
			for (int k = 1; k <= 1 ; k++) {
				
			}
		} 
			System.out.println();
		 
		

	      // 4번 문제
	      // ****
	      // _***
	      // __**
	      // ___*
		

	      // 5번 문제 ( 이등변 삼각형 )
	      // __*
	      // _***
	      // *****


	      // 6번 문제( 마름모 )
	      // __*
	      // _***
	      // *****
	      // _***
	      // __*

	      // 7번 문제
	      // *
	      // _*
	      // __*
	      // ___*
	      // ____*

	      // 8번 문제
	      // ____*
	      // ___*
	      // __*
	      // _*
	      // *

	      // 9번 문제
	      // *___*
	      // _*_*
	      // __*
	      // _*_*
	      // *___*
		

	}

}
